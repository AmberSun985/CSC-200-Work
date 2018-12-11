package lab2Package;

public class customer {
	
	private int  numBooks;                              // number of books customer purchase
	private int  numMagazines;                          // number of magazines customer purchase
	private int  customerAge;                           // age of customer 
    
    public customer(int customerAge, int numBooks, int numMagazines) {
    	this.customerAge = customerAge;
    	this.numBooks = numBooks;
    	this.numMagazines = numMagazines;
    }
    
    public int getAge() {
        return customerAge;
    }

    public int getBooks() {
        return numBooks;
    }
    
    public int getMagazines() {
        return numMagazines;
    }

	public static void main(String[] args) {

	    final double SENIORCITIZENDISCOUNT = .1;    // discount on the total pre-tax sale for senior citizen
	    final double TAXRATE = .05;                 // tax rate on the total sale 
	    final double EACHBOOKCOST = 10.0;           // cost of each book 
	    final double EACHMAGAZINECOST = 2.0;        // cost of each magazine

		customer customer1 = new customer(25, 5, 3);
		System.out.println("Customer 1 is " + customer1.getAge() + " years old and wants " + customer1.getBooks() + " books and " + customer1.getMagazines() + " magazines.");
	    customer customer2 = new customer(65, 8, 1);
	    System.out.println("");
	    System.out.println("Customer 2 is " + customer2.getAge() + " years old and wants " + customer2.getBooks() + " books and " + customer2.getMagazines() + " magazines.");

	    double totalSale1 = (EACHBOOKCOST * customer1.getBooks() + EACHMAGAZINECOST * customer1.getMagazines() ) + 
	    		(EACHBOOKCOST * customer1.getBooks() + EACHMAGAZINECOST * customer1.getMagazines() ) * TAXRATE;
		// = (10 * 5 + 2 * 3) + (10 * 5 + 2 * 3) * 5.0%
		// = 56 + 2.8
		// = 58.8
	    
	    double num1 = EACHBOOKCOST * customer2.getBooks() + EACHMAGAZINECOST * customer2.getMagazines();
	    double num2 = (EACHBOOKCOST * customer2.getBooks() + EACHMAGAZINECOST * customer2.getMagazines()) * SENIORCITIZENDISCOUNT;
	    double num3 = (num1 - num2) * TAXRATE;
	    
	    double totalSale2 = (num1 - num2) + num3;
	    
	    // = (10 * 8 + 2 * 1) - ((10 * 8 + 2 * 1) * 10.0%) + [(10 * 8 + 2 * 1) * 10.0%] * 5.0% 
		// = 82 - 82 * 10.0% + [82 - 82 * 10.0%] * 5.0%
		// = 77.49 
		
	    System.out.println("");
	    
	    // Outputs total sale of customer 1
	    System.out.println("The total sale for customer 1 is: $" + totalSale1);
	    
	    System.out.println("");
	    
	    // Outputs total sale of customer 2
	    System.out.println("The total sale for customer 2 is: $" + totalSale2);
	    
	}

}
