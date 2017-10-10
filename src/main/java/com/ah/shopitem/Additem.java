package com.ah.shopitem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ah.storedb.ItemDAO;

/**
 * Servlet implementation class Additem
 */
public class Additem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Additem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();//.append("Served at: ").append(request.getContextPath());
	/*	ItemDAO idao = new ItemDAO();
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter barcode");String barcode = sc.nextLine();
		System.out.println("enter name");String name = sc.nextLine();
		System.out.println("enter description");String description = sc.nextLine();
		System.out.println("enter price"); int price = sc.nextInt();
		System.out.println("enter quantity"); int quantity = sc.nextInt();
		System.out.println("Any Discount ?"); String offer = "";
		offer = sc.nextLine();
		boolean discount = false;
		int percent = 0;
		if(offer == "yes")
		{
		discount = true;
		if(discount == true);
		{
		System.out.println("discount percentage"); percent = sc.nextInt();
		
		}
		}
		
		//int price = 2002;
	
		String sqlstatement = "insert into item (id,name,description,price,quantity,discounted,discount_percent) values ('"+barcode+"','"+name+"','"+description+"',"+price+","+quantity+","+discount+","+percent+")";
		idao.insert(sqlstatement);*/
		
		//System.out.println(response.setStatus(405));
		request.getSession(false);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw = response.getWriter();
		String barcode = request.getParameter("barcode");
		//pw.append(barcode);
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		int price = Integer.parseInt(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		String discount = request.getParameter("discount");

		String discount_percent = request.getParameter("discount_percent");
		
		ItemDAO idao = new ItemDAO();
		if(barcode!=null)
		{
		String sqlstatement = "insert into item (id,name,description,price,quantity,discounted,discount_percent) values ('"+barcode+"','"+name+"','"+description+"',"+price+","+quantity+","+discount+","+discount_percent+")";
		idao.insert(sqlstatement);
		}
		/*ItemInventory iinven = new ItemInventory();
		iinven.doGet(null,null);*/
		else
			response.sendRedirect("www.google.com");
		
		
		
		
		

	}

}
