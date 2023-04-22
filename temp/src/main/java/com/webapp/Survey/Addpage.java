package com.webapp.Survey;


import java.sql.*;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Addpage {
	
	static final public String addr = "127.0.0.1:8080";
	static final public String Hpage = "/";
	static final public String AddPage = "/add";
	static final public String ViewPage = "/comments";
	static final public String DB = "/addcomment";
    // One syntax to implement a
    // GET method
	// home page 
    @GetMapping(Hpage)
    public String home()
    {
        String str
            = "<!DOCTYPE html>\r\n"
            		+ "<html>\r\n"
            		+ "\r\n"
            		+ "<head>\r\n"
            		+ "    <meta charset=\"utf-8\">\r\n"
            		+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
            		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
            		+ "    <title>Home</title>\r\n"
            		+ "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css\" />\r\n"
            		+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n"
            		+ "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n"
            		+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\r\n"
            		+ "</head>\r\n"
            		+ "\r\n"
            		+ "<body>\r\n"
            		+ "    <section class=\"hero is-primary is-fullheight\">\r\n"
            		+ "\r\n"
            		+ "        <div class=\"hero-head\">\r\n"
            		+ "        </div>\r\n"
            		+ "\r\n"
            		+ "        <div class=\"hero-body\">\r\n"
            		+ "            <div class=\"container has-text-centered\" >\r\n"
            		+ "					<div class=\"column is-4 is-offset-4\" >"				
            		+"						<div class=\"box\">"
            		+"							<div class=\"field\">\r\n"
            		+"          					<strong>Welcome</strong>\r\n"
            		+ "    						</div>"
	            	+"							<div><a href=\""+AddPage +"\"> <h2>Add Comments</h2> </a></div>"
	            	+"							<div><a href=\""+ViewPage +"\"> <h2>See All Comments</h2> </a></div>"
            		+"						</div>"
            		+ "</div>"
            		+ "            </div>\r\n"
            		+ "        </div>\r\n"
            		+ "    </section>\r\n"
            		+ "</body>\r\n"
            		+ "</html>";
        return str;
    }
    
    
    // add page to add new comment
    @RequestMapping(
        method =  { RequestMethod.GET },
        value = { AddPage }
    )
    public String addpage(String args[]) throws InterruptedException 
    	{
    	String str
        = "<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "\r\n"
        		+ "<head>\r\n"
        		+ "    <meta charset=\"utf-8\">\r\n"
        		+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
        		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "    <title>Home</title>\r\n"
        		+ "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css\" />\r\n"
        		+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n"
        		+ "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n"
        		+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\r\n"
        		+ "</head>\r\n"
        		+ "\r\n"
        		+ "<body>\r\n"
        		+ "    <section class=\"hero is-primary is-fullheight\">\r\n"
        		+ "\r\n"
        		+ "        <div class=\"hero-head\">\r\n"
        		+ "        </div>\r\n"
        		+ "\r\n"
        		+ "        <div class=\"hero-body\">\r\n"
        		+ "            <div class=\"container has-text-centered\" >\r\n"
        		+ "					<div class=\"column is-4 is-offset-4\" >"				
        		+"						<div class=\"box\">"
        		+"							<div class=\"field\">\r\n"
        		+ "          					<strong>Topic</strong>\r\n"
        		+ "    						</div>"
            	+"							<div><form method=\"POST\" action=\""+DB+"\">\r\n"
        		+"								<div class=\"column\"><input class=\"input is-large\" type=\"text\" name=\"name\" placeholder=\"Enter Your Name :\" autofocus=\"\" ></div>"
            	+ "        						<textarea\r\n"
            	+ "          						placeholder=\"Enter Your Comment :\" type=\"text\" name=\"comment\"\r\n"
            	+"									class=\"input is-large\""
            	+ "        							></textarea>\r\n"
            	+ "        						<button class=\"button is-block is-info is-large is-fullwidth\">Submit</button>\r\n"
            	+ "      					</form></div>"
        		+"						</div>"
        		+ "</div>"
        		+ "            </div>\r\n"
        		+ "        </div>\r\n"
        		+ "    </section>\r\n"
        		+ "</body>\r\n"
        		+ "</html>";
    return str;
        }
    
 // Add comment to mysql DB
    @RequestMapping(
        method =  { RequestMethod.POST },
        value = { DB },
        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE
    )
    public void Addtodb(HttpServletResponse httpServletResponse,@RequestBody MultiValueMap<String, String> formData) throws InterruptedException 
    	{
//    	System.out.println(formData.getFirst("name"));
    	try{   
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/javasql","root","test");  
    		//here javasql is database name, root is username and password is test  
    		Statement stmt=con.createStatement();  
    		stmt.executeUpdate("INSERT INTO Comments (comment, Name)\r\n"
    				+ "VALUES ("+"\""+formData.getFirst("comment")+"\""+","+"\""+formData.getFirst("name")+"\""+");");  

    		con.close();
    		httpServletResponse.setHeader("Location", ViewPage);
    	    httpServletResponse.setStatus(302);
    		}catch(Exception e){ System.out.println(e);}  
    	}  
    
    // comments page to view all comments
    @RequestMapping(
        method =  { RequestMethod.GET },
        value = { ViewPage }
    )
    public String commentspage(String args[]) throws InterruptedException 
    	{
    	String result = "";
    	try {
	    	Connection con=DriverManager.getConnection(  
	        		"jdbc:mysql://localhost:3306/javasql","root","test");  
	        		//here javasql is database name, root is username and password is test
	    	Statement stmt=con.createStatement();  
	    	ResultSet rs=stmt.executeQuery("select * from Comments");  
	    	while(rs.next())
	    		result += "      <div class=\"columns\">\r\n"
        		+ "        <div class=\"column\">"+rs.getInt(1)+"</div>\r\n"
        		+ "        <div class=\"column\">"+rs.getString(4)+"</div>\r\n"
        		+ "        <div class=\"column\">"+rs.getString(3)+"</div>\r\n"
        		+ "        <div class=\"column\">"+rs.getString(2)+"</div>\r\n"
        		+ "      </div>\r\n";
	    	
	    	con.close();  
    	}catch(Exception e){ System.out.println(e);}  
    	String str
        = "<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "\r\n"
        		+ "<head>\r\n"
        		+ "    <meta charset=\"utf-8\">\r\n"
        		+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
        		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "    <title>Home</title>\r\n"
        		+ "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.min.css\" />\r\n"
        		+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n"
        		+ "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n"
        		+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\r\n"
        		+ "</head>\r\n"
        		+ "\r\n"
        		+ "<body>\r\n"
        		+ "    <section class=\"hero is-primary is-fullheight\">\r\n"
        		+ "\r\n"
        		+ "        <div class=\"hero-head\">\r\n"
        		+ "        </div>\r\n"
        		+ "\r\n"
        		+ "        <div class=\"hero-body\">\r\n"
        		+ "            <div class=\"container has-text-centered\" >\r\n"
        		+ "					<div class=\"column is-4 is-offset-4\" >"				
        		+"						<div class=\"box\">"
        		+"							<div class=\"field\">\r\n"
        		+"          					<strong>Comments</strong>\r\n"
        		+ "    						</div>"
        		+"						</div>"
        		+"						<div class=\"box\">\r\n"
        		+ "    						<div class=\"field\">\r\n"
        		+ "     						 <div class=\"columns\">\r\n"
        		+ "       						 <div class=\"column\">ID</div>\r\n"
        		+ "       						 <div class=\"column\">Name</div>\r\n"
        		+ "       						 <div class=\"column\">Comment</div>\r\n"
        		+ "       						 <div class=\"column\">Date</div>\r\n"
        		+ "      					</div>\r\n"
        		+ 							result
        		+ "    				</div>\r\n"
        		+ "            </div>\r\n"
        		+ "        </div>\r\n"
        		+ "    </section>\r\n"
        		+ "</body>\r\n"
        		+ "</html>";
    	
            return str;
        }
}


	
