package com.ah.designpatterns.singleton;

import java.util.ArrayList;

import com.ah.storedb.Item;

public class MySingleton {	
	
	
	public static void main(String[] args)
	{/*
		SingletonClass obj = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		//SingletonClass obj3 = new SingletonClass();
		System.out.println(obj);
		System.out.println(obj2);
		//System.out.println(obj3);
*/		
				ItemDescription ins1 = ItemDescription.getInstance();
				System.out.println(ins1);
				ItemDescription ins2 = ItemDescription.getInstance();
				System.out.println(ins2);
				
				//ItemDescription ins3 = new ItemDescription();
				
				/*ArrayList<Item> finalList = ins1.getItemDescription();
				for(Item x: finalList)
				{
					System.out.print(x.getBarcode()+"    ");
					System.out.println(x.getDescription());
				}*/
	}
	
	
	
}
