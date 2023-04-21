package com.webapp.Survey;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Addpage {
 
    // One syntax to implement a
    // GET method
	// home page 
    @GetMapping("/")
    public String home()
    {
        String str
            = "<html><body><font color=\"green\">"
              + "<h1>test</h1>"
              + "</font></body></html>";
        return str;
    }
    
    
    // add page to add new comment
    @RequestMapping(
        method =  { RequestMethod.GET },
        value = { "/add" }
    )
    public String addpage(String args[]) throws InterruptedException 
    	{
            return null;
        }
    
    
    // comments page to view all comments
    @RequestMapping(
        method =  { RequestMethod.GET },
        value = { "/comments" }
    )
    public String commentspage(String args[]) throws InterruptedException 
    	{
            return null;
        }
}


	
