package com.ah.servlets;

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

public class ControllerForLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControllerForLogout() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter();
		ItemDAO idao = new ItemDAO();
		ArrayList<Item> itemlist = idao.displayitems();
		//HttpSession session = request.getSession();
		request.setAttribute("itemslist", itemlist);
		//session.setAttribute("itemslist", itemlist);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayItemsForLogout.jsp");
        dispatcher.forward(request, response); 
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
