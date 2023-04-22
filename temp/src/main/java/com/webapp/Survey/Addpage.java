package com.webapp.Survey;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Addpage {
	
	static final public String addr = "127.0.0.1:8080";
	static final public String Hpage = "/";
	static final public String AddPage = "/add";
	static final public String ViewPage = "/comments";
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
//            		+"		<style>body {\r\n"
//            		+ "    		background-color: #732673;\r\n"
//            		+ "}</style>"
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
            		+ "            			<h1>Welcome</h1>"
            		+"						<div class=\"box\">"
	            	+"							<div><a href=\""+AddPage +"\"> <h2>Add Comments</h2> </a></div>"
	            	+"							<div><a href=\""+ViewPage +"\"> <h2>See All Comments</h2> </a></div>"
            		+"						</div>"
            		+ "</div>"
            		+ "            </div>\r\n"
            		+ "        </div>\r\n"
            		+ "    </section>\r\n"
            		+ "    <div id=\"SCRtepm\"></div>\r\n"
            		+ "</body>\r\n"
            		+ "\r\n"
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
        		+ "            			<h1>Topic</h1>"
        		+"						<div class=\"box\">"
            	+"							<div><form>\r\n"
            	+ "        						<textarea\r\n"
            	+ "          						placeholder=\"Enter Your Comment :\"\r\n"
            	+ "        							></textarea>\r\n"
            	+ "        						<button class=\"button is-block is-info is-large is-fullwidth\">Submit</button>\r\n"
            	+ "      					</form></div>"
        		+"						</div>"
        		+ "</div>"
        		+ "            </div>\r\n"
        		+ "        </div>\r\n"
        		+ "    </section>\r\n"
        		+ "    <div id=\"SCRtepm\"></div>\r\n"
        		+ "</body>\r\n"
        		+ "\r\n"
        		+ "</html>";
    return str;
        }
    
    
    // comments page to view all comments
    @RequestMapping(
        method =  { RequestMethod.GET },
        value = { ViewPage }
    )
    public String commentspage(String args[]) throws InterruptedException 
    	{
            return "Comments Page";
        }
}


	
