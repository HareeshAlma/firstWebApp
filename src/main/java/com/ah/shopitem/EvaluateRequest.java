package com.ah.shopitem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvaluateRequest
 */
public class EvaluateRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EvaluateRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();//.append("Served at: ").append(request.getContextPath());
		/*
		out.append(request.getContentType());
		out.append(request.getContentLength());
		out.append(request.getAuthType());
		out.append(request.getCharacterEncoding());
		out.append(request.getContextPath());
		out.append(request.getCookies());
		request.getHeader(arg0);
		request.getHeaders(arg0);
		request.getLocale();
		request.getLocalPort();
		request.getServerPort();
		request.getSession();*/
		
		
	
		System.out.println(request.getMethod()+" from get");
		System.out.println(request.getPathInfo());
		System.out.println(request.getQueryString());
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURL());
		System.out.println(request.getLocale());
		//response.setStatus(405);
		//response.setStatus(307, "not found");

		out.print(request.getSession().getCreationTime());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println(request.getMethod());
		//System.out.println();
		System.out.println(request.getPathInfo());
		System.out.println(request.getQueryString());
	
	}

}
