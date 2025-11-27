package com.test;

import org.jboss.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/log")
public class SimpleLogServlet extends HttpServlet {
    
    private static final Logger logger = Logger.getLogger(SimpleLogServlet.class);
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        logger.info("Simple INFO log message");
        
        resp.setContentType("text/plain");
        resp.getWriter().write("Log message written");
    }
}
