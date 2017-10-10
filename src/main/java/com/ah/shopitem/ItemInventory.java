package com.ah.shopitem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ah.storedb.ItemDAO;



/**
 * Servlet implementation class ItemInventory
 */
public class ItemInventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemInventory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();//.append("Served at: ").append(request.getContextPath());
		ItemDAO idao = new ItemDAO();

		/*//idao.selectAll();
		ArrayList<Item> itemlist = idao.selectAll();
		for(Item x: itemlist)
		{
			out.append(x.getBarcode()+ " "+x.getName()+" "+x.getDescription()+" "+x.getPrice()+" "+x.getQuantity()+"\n");
		//out.append("\n");
		}
		*/
		
		
		
		
		
		Connection con = null;
		//ResultSet rs = null;
		try {
			//out.append("***********Item Inventory***********");
	out.append("<table border='1' align='center'>");
	out.append("<caption>");out.append("<h2>");out.append("***********Item Inventory***********");out.append("</h2>");out.append("</caption>");
	out.append("<tr>");
	out.append("<th>"); out.append("barcode/id");  		out.append("</th>");	
	out.append("<th>"); out.append("Name");        		out.append("</th>");
	out.append("<th>"); out.append("description"); 		out.append("</th>");	
	out.append("<th>"); out.append("price");       		out.append("</th>");	
	out.append("<th>"); out.append("quantity");    		out.append("</th>");
	out.append("<th>"); out.append("discounted");  		out.append("</th>");
	out.append("<th>"); out.append("discount_percent");	out.append("</th>");
	out.append("</tr>");
			con = idao.getConnection();
			Statement stmt = con.createStatement();
			
			 ResultSet rs = stmt.executeQuery("select * from item");
			 //out.append("hello0000000");
			while (rs.next())
			{
				out.append("<tr>");
				out.append("<td>"+rs.getString("id") + "</td> <td>  " + rs.getString(2) + "</td> <td>  " + rs.getString(3) + "</td> <td> "+rs.getInt(4) +"</td> <td> "+rs.getInt(5) +"</td> <td> "+rs.getBoolean(6)+"</td> <td> "+rs.getInt(7)+"</td>");
			out.append("</tr>");
			}
			out.append("</table>");	
	}
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally
		{
			if(con != null)
			{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	out.print(request.getSession().getCreationTime());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
