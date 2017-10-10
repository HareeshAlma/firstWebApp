package com.ah.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ah.store.Order;

public class PerformanceFilter implements Filter {

    public PerformanceFilter() {
       
    }

	public void destroy() {
		
	}

	private static final Logger log = LogManager.getLogger(PerformanceFilter.class);
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Long StartTime = System.currentTimeMillis();
		
		chain.doFilter(request, response);

		log.debug("time taken "+ (System.currentTimeMillis()-StartTime));
					
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
