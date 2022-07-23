/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */                                                      //Functions Implemented//
//Delwyn Hamilton//                      //1.you can select any hotel and order food//
package foodorder;                       //2.swiigy driver will be given 5% commision and the commision percent is also shown// 
                                         //3.once you purchased select y to buy again or see the bill review//
import java.util.*;                      //3.In the bill review option you can view the amount spent on each model//

public class Foodorder {
                                                                          
	String[] pizzas = {"The 4 Cheese Pizza","Farmhouse","Cheese n Corn","Peppy Paneer"};
	                  

	String[] bur = {"American Cheese Supreme","Maharaja Mac","Cheese Lava American","Triple Cheese American"};

	String[] sand = {"Club Sandwich","Veg Cheese Grilled Sandwich","Chilly Panner Sandwich"};
	
	String[] bev = {"Coke","Pepsi","Choclate Smoothie","Choclate Shake"};

	String[] des = {"Choclate Chip Muffin","Choco Lava Cake","Brownie Fantasy"};

	String name;
	static String again;
	static int choice = 0;
        static int cost=0;
	int quantity;
	int pchoice;
	int pchoice1;
	static Scanner s = new Scanner(System.in);
        
        public void displaydriver(){
        System.out.println("Drivers Name");
        int k = (int)(choice*(5/100.0f));
        }
        
        public void finalReview(){
                System.out.println("The Final Review is:");
                System.out.println("Total BILL: "+ cost );
                System.out.println("Hotel Charge:  " + ((95*cost)/100.0f));
		System.out.println("Drivers Charge:" + (cost/100.0f)*5);
            
            
        }
        
        
	public void pizzaMenu() {
		System.out.println("\t\t#PIZAAS-");
		System.out.println("\t\t1. " + pizzas[0]);
		System.out.println("\t\t2. " + pizzas[1]);
		System.out.println("\t\t3. " + pizzas[2]);
		System.out.println("\t\t4. " + pizzas[3]);
		System.out.println("Please Select Your Flaver:");
		pchoice = s.nextInt();

		if (pchoice >= 1 && pchoice <= 5) {
			System.out.println("\t\t1.Small Rs.250");
			System.out.println("\t\t2.Regular Rs.400");
			System.out.println("\t\t3.Large Rs.600");
			System.out.println("Choose Size Please:");
			pchoice1 = s.nextInt();

			if (pchoice1 >= 1 && pchoice1 <= 3) {
				System.out.println("Enter Quantity:");
				quantity = s.nextInt();
				switch (pchoice1) {
				case 1:
					choice = 250 * quantity;
					break;
				case 2:
					choice = 400 * quantity;
					break;
				case 3:
					choice = 600 * quantity;
					break;
				default:
					System.out.println("Wrong Choice!!");
				}

				switch (pchoice1) {
				case 1:
					System.out.println("\t|\t----------Your Order----------");
					System.out.println("\t|\t" + quantity + "\t" + pizzas[0]);
					System.out.println("\t|\tYour Total Bill is:  " + choice);
                                        cost=choice;
                                        System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                        System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
					System.out.println("\t|\tThank You for Ordering from SWIGGY");
					System.out.println("\t|\tVisit Again(*_*)");
					System.out.println("------------------------------------------------");
					break;
				case 2:
					System.out.println("\t|\t-----Your Order-----");
					System.out.println("\t|\t" + quantity + "\t" + pizzas[1]);
					System.out.println("\t|\tYour Total Bill is:  " + choice);
                                        cost=choice;
                                        System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                        System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
					System.out.println("\t|\tThank You for Ordering from SWIGGY");
					System.out.println("\t|\tVisit Again(*_*)");
					System.out.println("------------------------------------------------");
					break;
				case 3:
					System.out.println("\t|\t-----Your Order-----");
					System.out.println("\t|\t" + quantity + "\t" + pizzas[2]);
					System.out.println("\t|\tYour Total Bill is:  " + choice);
                                        cost=choice;
                                        System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                        System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
					System.out.println("\t|\tThank You for Ordering from SWIGGY");
					System.out.println("\t|\tVisit Again(*_*)");
					System.out.println("------------------------------------------------");
					break;
				case 4:
					System.out.println("\t|\t-----Your Order-----");
					System.out.println("\t|\t" + quantity + "\t" + pizzas[3]);
					System.out.println("\t|\tYour Total Bill is:  " + choice);
                                        cost=choice;
                                        System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                        System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
					System.out.println("\t|\tThank You for Ordering from SWIGGY");
					System.out.println("\t|\tVisit Again(*_*)");
					System.out.println("------------------------------------------------");
					break;
				default:
					System.out.println("Wrong Choice!!");
				}

			}
		}
	}

	public void burgerMenu() {
		System.out.println("\t\t#BURGERS-");
		System.out.println("\t\t1. " + bur[0] + " Rs.124");
		System.out.println("\t\t2. " + bur[1] + " Rs.220");
		System.out.println("\t\t3. " + bur[2]+ " Rs.230");
		System.out.println("\t\t4. " + bur[3] + " Rs.200");
		System.out.println("Please Select Your Burger:");
		pchoice1 = s.nextInt();

		if (pchoice1 >= 1 && pchoice1 <= 3) {
			System.out.println("Enter Quantity:");
			quantity = s.nextInt();
			switch (pchoice1) {
			case 1:
				choice = 124 * quantity;
				break;
			case 2:
				choice = 220 * quantity;
				break;
			case 3:
				choice = 230 * quantity;
				break;
			case 4:
				choice = 200 * quantity;
				break;

			default:
				System.out.println("Wrong Choice!!");
			}

			switch (pchoice1) {
			case 1:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bur[0]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 2:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bur[1]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 3:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bur[2]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 4:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bur[3]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
                                
                                       
			default:
				System.out.println("Wrong Choice!!");
			}
		}
	}

	public void sandwichMenu() {
		System.out.println("\t\t#SANDWICHES-");
		System.out.println("\t\t1. " + sand[0] + " Rs.80");
		System.out.println("\t\t2. " + sand[1] + " Rs.90");
		System.out.println("\t\t3. " + sand[2] + " Rs.100");
		System.out.println("Please Select Your Sandwich:");
		pchoice1 = s.nextInt();

		if (pchoice1 >= 1 && pchoice1 <= 3) {
			System.out.println("Enter Quantity:");
			quantity = s.nextInt();
			switch (pchoice1) {
			case 1:
				choice = 80 * quantity;
				break;
			case 2:
				choice = 90 * quantity;
				break;
			case 3:
				choice = 100 * quantity;
				break;
			default:
				System.out.println("Wrong Choice!!");
			}

			switch (pchoice1) {
			case 1:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + sand[0]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 2:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + sand[1]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 3:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + sand[2]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			default:
				System.out.println("Wrong Choice!!");
			}

		}
	}

	public void bevMenu() {
		System.out.println("\t\t#BEVERAGES-");
		System.out.println("\t\t1. " + bev[0] + " Rs.70");
		System.out.println("\t\t2. " + bev[1] + " Rs.70");
		System.out.println("\t\t3. " + bev[2] + " Rs.184");
		System.out.println("\t\t4. " + bev[3] + " Rs.151");
		System.out.println("Please Select Your Beverage:");
		pchoice1 = s.nextInt();

		if (pchoice1 >= 1 && pchoice1 <= 4) {
			System.out.println("Enter Quantity:");
			quantity = s.nextInt();
			switch (pchoice1) {
			case 1:
				choice = 70 * quantity;
				break;
			case 2:
				choice = 70 * quantity;
				break;
			case 3:
				choice = 184 * quantity;
				break;
			case 4:
				choice = 151 * quantity;
				break;
			default:
				System.out.println("Wrong Choice!!");
			}

			switch (pchoice1) {
			case 1:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bev[0]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 2:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bev[1]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 3:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bev[2]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 4:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + bev[3]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			default:
				System.out.println("Wrong Choice!!");

			}
		}
	}

	public void desMenu() {
		System.out.println("\t\t#DESSERT-");
		System.out.println("\t\t1. " + des[0] + " Rs.110");
		System.out.println("\t\t2. " + des[1]+ " Rs.90");
		System.out.println("\t\t3. " + des[2] + " Rs.60");
		System.out.println("Please Select Your Dessert:");
		pchoice1 = s.nextInt();

		if (pchoice1 >= 1 && pchoice1 <= 3) {
			System.out.println("Enter Quantity:");
			quantity = s.nextInt();
			switch (pchoice1) {
			case 1:
				choice = 110 * quantity;
				break;
			case 2:
				choice = 90 * quantity;
				break;
			case 3:
				choice = 60 * quantity;
				break;
			default:
				System.out.println("Wrong Choice!!");
			}

			switch (pchoice1) {
			case 1:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + des[0]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 2:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + des[1]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			case 3:
				System.out.println("\t|\t-----Your Order-----");
				System.out.println("\t|\t" + quantity + "\t" + des[2]);
				System.out.println("\t|\tYour Total Bill is:  " + choice);
                                cost=choice;
                                System.out.println("\t|\tcomission to driver: " +((choice/100.0f)*5));
                                System.out.println("\t|\tRestaurant Cost: " +((95*choice)/100.0f));
				System.out.println("\t|\tThank You for Ordering from SWIGGY");
				System.out.println("\t|\tVisit Again(*_*)");
				System.out.println("------------------------------------------------");
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
		}
	}

	public void displayhotel() {

		System.out.println("----------Welcome to SWIGGY----------");

		System.out.println("\nPlease Enter Your First Name:");
		name = s.next();

		System.out.println("--------------------------------------------");

		System.out.println("Hello " + name + " !!!");
		System.out.println("Which hotel would you like to order?");

		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("\t|\tHOTELS");
		System.out.println("\t|\t1.PizzaHut");
		System.out.println("\t|\t2.KFC");
		System.out.println("\t|\t3.A2B");
		System.out.println("\t|\t4.DODGE");
		System.out.println("--------------------------------------------");
	}
        public void displayfood() {

		
		System.out.println("What would you like to order?");

		System.out.println("--------------------------------------------");
		System.out.println("\t|\t       \t\t|");
		System.out.println("\t|\tMenu:\t\t|");
		System.out.println("\t|\t1.Pizzas\t|");
		System.out.println("\t|\t2.Burgers\t|");
		System.out.println("\t|\t3.Sandwich\t|");
		System.out.println("\t|\t4.Beverages\t|");
		System.out.println("\t|\t5.Dessert\t|");
		System.out.println("--------------------------------------------");
        }
         public void displayfinal() {

		
		System.out.println("What would you like to order?");

		System.out.println("--------------------------------------------");
		System.out.println("\t|\t       \t\t|");
		System.out.println("\t|\tMenu:\t\t|");
		System.out.println("\t|\t1.Pizzas\t|");
		System.out.println("\t|\t2.Burgers\t|");
		System.out.println("\t|\t3.Sandwich\t|");
		System.out.println("\t|\t4.Beverages\t|");
		System.out.println("\t|\t5.Dessert\t|");
                System.out.println("\t\t6.Bill Review\t");
		System.out.println("--------------------------------------------");
        
         }
	public static void main(String[] args) throws Exception {
		int i = 1;

		Foodorder f = new Foodorder();
                Foodorder l = new Foodorder();
                Hotel h = new Hotel();
                Driver d = new Driver();

		f.displayhotel();
                
                System.out.println("Enter your choice");
                choice = s.nextInt();
                switch(choice) {
                    case 1:
			h.PizzaHut();
                        f.displayfood();
			break;
                    case 2:
			h.KFC();
                        f.displayfood();
			break;
                    case 3:
			h.A2B();
                        f.displayfood();
			break;
                    case 4:
			h.DODGE();
                        f.displayfood();
			break;
		default:
			System.out.println("Please Enter Correct Choice...");
                        
                }

		System.out.println("Please Enter your Choice:");
		choice = s.nextInt();
		switch (choice) {
		case 1:
			f.pizzaMenu();
			break;
		case 2:
			f.burgerMenu();
			break;
		case 3:
			f.sandwichMenu();
			break;
		case 4:
			f.bevMenu();
			break;
		case 5:
			f.desMenu();
			break;
		default:
			System.out.println("Please Enter Correct Choice...");
		}
		
		while (i <= 6) {
			System.out.println("Would you like to Order again or see the Bill Review? Y/N:");
			again = s.next();
			if (again.equalsIgnoreCase("y")) {
				l.displayfinal();
				System.out.println("Please Enter your Choice:");
				choice = s.nextInt();
				switch (choice) {
				case 1:
					f.pizzaMenu();
					break;
				case 2:
					f.burgerMenu();
					break;
				case 3:
					f.sandwichMenu();
					break;
				case 4:
					f.bevMenu();
					break;
				case 5:
					f.desMenu();
					break;
                                case 6:
                                        l.finalReview();
				}
                            

			} else {
                                d.displaydriver();
				System.out.println("Thank You...Visit Again(*_*)!!!");
				System.out.println("------------------------------------------------");
			}
		}

		

		s.close();
	}
}
// A Project by delwyn Hamilton//
//Thank you//