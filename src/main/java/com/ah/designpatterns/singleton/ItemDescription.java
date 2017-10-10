package com.ah.designpatterns.singleton;

import java.util.ArrayList;

import com.ah.storedb.Item;
import com.ah.storedb.ItemDAO;

public class ItemDescription {
	
	private static ItemDescription obj;// = new ItemDescription();
	
	private ItemDescription(){
		
	}
	public static ItemDescription getInstance(){
		if(obj == null)
			obj = new ItemDescription();
		
		return obj;
	}
	
	private ArrayList<Item> getItemDescription(){
		ItemDAO idao = new ItemDAO();
		ArrayList<Item> descriptionList = idao.getDescriptionList();
		return descriptionList;
	}
	
	
	public static void main(String[] args)
	{
		ItemDescription ins1 = ItemDescription.getInstance();
		System.out.println(ins1);
		ItemDescription ins2 = ItemDescription.getInstance();
		System.out.println(ins2);
		ItemDescription ins3 = new ItemDescription();
		System.out.println(ins3);
		
	}
	
	
	/*public static void main(String[] args){
		//ItemDescription ins1 ;//= new ItemDescription();
		ItemDescription ins1 = new ItemDescription();
		System.out.println(ins1);
		ItemDescription ins2 = new ItemDescription();
		System.out.println(ins2);
	//ItemDescription ins3 = new ItemDescription();
		//System.out.println(ins3);
	//System.out.println(	ins1.getItemDescription());
		ArrayList<Item> finalList = ins1.getItemDescription();
		for(Item x: finalList)
		{
			System.out.print(x.getBarcode()+"    ");
			System.out.println(x.getDescription());
		}
	}*/
	
	
	
}
