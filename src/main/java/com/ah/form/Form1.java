package com.ah.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ah.storedb.Item;
import com.ah.storedb.ItemDAO;

/**
 * Servlet implementation class Form1
 */
public class Form1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out = 	response.getWriter();//.append("Served at: ").append(request.getContextPath());
	
	out.append("<html> " );
	out.append("<head> " );
	out.append("<title> ");
	out.append("form " );
	out.append("</title> " );
	out.append("</head> " );
	out.append("<body> " );
	
	out.append("<form method='post' action='Form1'> " );
	out.append("Enter Barcode: " );
	out.append("<input type='text' name='barcode'> " );
	out.append("<br><br>");
	out.append("<input type='submit' value='Fetch Info'> " );
	out.append("</form> " );
	out.append("</body> " );
	/*String barCodeGiven = request.getParameter("barcode");
	out.append(barCodeGiven);
	*/
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw = response.getWriter();
		String barCodeGiven = request.getParameter("barcode");
		Boolean found = false;
		pw.append("Barcode given : "+barCodeGiven);
		System.out.println(barCodeGiven);
		pw.append("<br>");
		
		ItemDAO idao = new ItemDAO();//imported ITEMDAO
		ArrayList<String> barcodes= idao.barcodes();
		//idao.usingBarcode(barCodeGiven);
		/*
		for(String temp: barcodes)
		{
			if(temp == barCodeGiven)
			{
			found = true;
			System.out.println(temp);
			break;
			}
		}
		*/
		
		if(barcodes.contains(barCodeGiven))
		{
		ArrayList<Item> itemlist = idao.usingBarcode(barCodeGiven);
		pw.append("********LIST OF ITEMS AS PER BARCODE*********");
		pw.append("<table border='1'>");
		pw.append("<tr>");
		pw.append("<th>"); pw.append("barcode/id");  		pw.append("</th>");	
		pw.append("<th>"); pw.append("Name");        		pw.append("</th>");
		pw.append("<th>"); pw.append("description"); 		pw.append("</th>");	
		pw.append("<th>"); pw.append("price");       		pw.append("</th>");	
		pw.append("<th>"); pw.append("quantity");    		pw.append("</th>");
		pw.append("</tr>");
		
		
		for(Item x: itemlist)
		{
			//pw.append("<br>");
			pw.append("<tr>");
			pw.append("<td>"+x.getBarcode()+ "</td> <td> "+x.getName()+"</td> <td>  "+x.getDescription()+" </td> <td> "+x.getPrice()+"</td> <td>  "+x.getQuantity()+"</td> <td> ");
		//out.append("\n");
			pw.append("</tr>");
		}
		pw.append("</table>");
		}
		else
			response.sendRedirect("http://www.google.com");
		
	}

}
