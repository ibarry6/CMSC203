import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		// Creating a new scanner object
		
		
		
		// creating a scanner
	Scanner scan= new Scanner(System.in);
		// Create the variable 
		 String enter;
		 String title;
		 String rating;
	     int soldTickets;
		
		
		// Let create the object
		
		 Movie ibObject = new Movie();  
		
	 do
	{
		// Ask the user to enter the name of a movie
		 System.out.println("Enter the name of a movie");
		 title =scan.nextLine();
		 ibObject.setTitle(title);
		
		// Ask the user to enter the rating of the movie
		 System.out.println("Enter the rating of the movie");
		 rating =scan.nextLine();
		 ibObject.setRating(rating);
		
		// Ask the user to enter the number of ticket sold
		 
		 System.out.println("Enter the name of tickets sold for this movie");
		 soldTickets= scan.nextInt();
 		 ibObject.setSoldTickets(soldTickets);
		
		 System.out.println(ibObject.toString());
		 
		// Ask another question again
		 
		  System.out.println("Do you want to enter again");
		 enter = scan.nextLine();
		 enter= scan.nextLine();
		
	}   while (enter.equals("y"));
	    System.out.println("Goodbye");
	  
		
		
		
		
		
		

	}

}