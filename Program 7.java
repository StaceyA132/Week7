/**
 * 
 * @author staceya
 *
 */


public class Program7 {

	public static void main(String[] args) {
		int [] numbers = new int [100];
		String [] names = {"Maria", "Aris", "Galin", "Galena"};
		double [] balances = new double [] {2,56, 12.57, 36.57, 57.89};
		
		//length
		System.out.println(numbers.length);
		System.out.println(names.length);
		System.out.println(balances.length);
		
		//modifying
		names[3] = "Celine Dion";
		System.out.println("__________________________");
		
		//looping
		for (int i = 0; i< names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("__________________________");
		for (String name: names) {
			System.out.println(name);	
		}
		
		//modifying array
		System.out.println("__________________________");
		for (int i = 0; i< names.length; i++) {
			names[i] = names[i] + " Gate";
			System.out.println(names[i]);
		}
		
		System.out.println("__________________________");
		double total = 0.0;
		for (int i = 0; i < balances.length; i++) {
			total += balances[i];
			
		}
		
		  System.out.println("Total Balance: " + total);
	        
	      System.out.println("Average of Total Balance: " + total/balances.length);
		
		
		//calculate the average of the total balance
		
		
	}

}
