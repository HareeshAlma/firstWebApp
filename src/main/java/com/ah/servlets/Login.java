package com.ah.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ah.storedb.Item;
import com.ah.storedb.ItemDAO;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		ItemDAO idao = new ItemDAO();
		HashMap<String,String> userDetails = idao.getUserDetails();
		
		//HttpSession session;
		System.out.println(userDetails.get(userid));
		//System.out.println(userDetails.containsKey(userid));
		//String pswd = userDetails.get(userid);
		if(userDetails.containsKey(userid)){
			if(password.equals(userDetails.get(userid)))
			{
				HttpSession session = request.getSession(true);
				ArrayList<Item> itemlist = idao.displayitems();
				session.setAttribute("itemslist", itemlist);
		        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayItemsForLogout.jsp");
		        dispatcher.forward(request, response); 
		        
				//response.sendRedirect("/firstWebApp/ControllerForLogout");
				//System.out.println("correct");
			}
			else
			{
				response.sendRedirect("/firstWebApp/error.jsp");
				//System.out.println("incorrect password");
			}
		}
		else
		{

			response.sendRedirect("/firstWebApp/noUser.jsp");
			System.out.println("user id doesnot exist");
		}
		
	}

}
