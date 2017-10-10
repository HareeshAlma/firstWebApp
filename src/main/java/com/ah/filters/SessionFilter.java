package com.ah.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SessionFilter implements Filter {

    public SessionFilter() {
    }
	public void destroy() {
	}

	private static final Logger log = LogManager.getLogger(SessionFilter.class);
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		Long StartTime = System.currentTimeMillis();
		HttpServletRequest req = (HttpServletRequest) request;
	    HttpSession session = req.getSession(false);
	    
	  if(session == null)
	  {
		  RequestDispatcher dispatcher = request.getRequestDispatcher("LogIn.jsp");
	        dispatcher.forward(request, response); 
	  }
	  
	  else{
		chain.doFilter(request, response);
	  }
	  
		log.debug("time taken "+ (System.currentTimeMillis()-StartTime));
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
