package com.ah.factorydesign;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Office obj = new Branch1();
		obj.info();
		*/
		
		FactoryDesignClass fdc = new FactoryDesignClass();
		Office office = fdc.getInstance("Branch1");
		office.info();
		
	}

}
