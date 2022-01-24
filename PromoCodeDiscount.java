import java.util.*;


public class PromoCodeDiscount {
	
		public static void main(String[] args) {
			// Read data from User using a class called Scanner
			Scanner scanner = new Scanner(System.in); // Scanner Object Construction
					
			System.out.println("Enter an Amount: ");
			double amount = scanner.nextDouble(); // to read a double
					
			System.out.println("Enter Promo Code: ");
			//String promoCode = scanner.nextLine(); // to read a String
			int promoCode = scanner.nextInt();
					
			scanner.close(); // release the memory resources

			System.out.println("Amount is: "+amount);
			System.out.println("Promo Code is: "+promoCode);
			
			// 2 Promo Codes :)
			int JUMBO = 101;   // Flat 50% off for the items worth 200 or more
			int ZOMHELLO = 201; // Flat 60% off for the items worth 159 or more upto 120
			
			double discount = 0;
			
			if(amount >= 159 && (promoCode == JUMBO || promoCode == ZOMHELLO)) {
				System.out.println("You will get Discount");
				
				discount = (promoCode ==  JUMBO && amount >= 200) ? 
						amount * 0.5 : 
							(promoCode == ZOMHELLO) ? 
									((amount * 0.6 > 120) ? 
											120 :
											amount * 0.6):
												0;
				
				String str = (promoCode ==  JUMBO && amount >= 200) ? 
						"Promo code JUMBO applied successfully \n Discount is " + discount : 
					(promoCode == ZOMHELLO) ?
							"promo code ZOMHELLO applied successfully \n Discount is " + discount :
								"Invalid promo code try using JUMBO or ZOMHELLo";
				System.out.print(str);
			}
			else {
				
				System.out.println("Invalid promoCode or \nAmount is Lesser. Please add items worth "+(159-amount)+" more");
			}		
		
		}

	}
