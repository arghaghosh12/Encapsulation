package javabean;

class CarMainClass {
	public static void main(String[] args) {
		Car c=new Car();
		
			c.setBrand("Mahindra");
			c.setCost(1500000);
			
			System.out.println("Brand is: "+c.getBrand()+ " and  Cost is: "+c.getCost());
			//System.out.println();
			
		
	}
}
