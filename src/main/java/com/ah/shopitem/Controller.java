package com.ah.shopitem;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ah.storedb.Item;
import com.ah.storedb.ItemDAO;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();//.append("Served at: ").append(request.getContextPath());
		ItemDAO idao = new ItemDAO();
		ArrayList<Item> itemlist = idao.displayitems();
		
		HttpSession session = request.getSession();
		request.setAttribute("itemslist", itemlist);
		session.setAttribute("itemslist", itemlist);
		System.out.println(session.getCreationTime());
		System.out.println(session.getLastAccessedTime());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayItems.jsp");
        dispatcher.forward(request, response); 
        
        
        
        
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		/*ItemDAO idao = new ItemDAO();
		ArrayList<Item> itemlist = idao.displayitems();
		
		request.setAttribute("itemslist", itemlist);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayItems.jsp");
        dispatcher.forward(request, response); 
        */
	
	}

}
