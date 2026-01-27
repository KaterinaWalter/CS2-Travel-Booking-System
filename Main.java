import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      
      // Test out the constructor for Trip objects
      GlampingTrip trip1 = new GlampingTrip("Roaree", "Poconos", 10, true);

      Scanner input = new Scanner(System.in);
      // LOOP for booking trips with client input
      boolean continueBooking = true; // flag to control loop
      while (continueBooking) {
         // 1. Call static bookTravel method to create object
         GlampingTrip currentTrip = bookTrip(input);
         // 2. Display the object's details
         System.out.println(currentTrip);
         // 3. Ask user if they want to continue booking
         System.out.println("Do you want to book another Glamping trip? (y/n)");
         String response = input.nextLine();
         if ( response.equals("n") ) {
            continueBooking = false; // stop the loop
         }

      }

   } // end main method

   // Methods don't have to just be for object classes!
   // Write a reusable process for creating objects
   public static GlampingTrip bookTrip(Scanner scan) {
      // 1. Create a blank travel object
      GlampingTrip newTrip = new GlampingTrip();

      // 2. Ask client for details
      System.out.println("What is your name?");
      String clientName = scan.nextLine();
      System.out.println("Where do you want to go?");
      String clientDestination = scan.nextLine();
      System.out.println("How many days?");
      int clientDuration = scan.nextInt();
      System.out.println("Are you outdoorsy? Type true or false");
      boolean clientOutdoorsy = scan.nextBoolean();
      // reset the scanner fix:
      scan.nextLine();

      // 3. Call mutator methods (setters) to update the object
      newTrip.setTravelerName(clientName);
      newTrip.setDestination(clientDestination);
      newTrip.setDurationInDays(clientDuration);
      newTrip.setIsOutdoorsy(clientOutdoorsy);
      newTrip.setTotalCost(); // calculate total trip cost

      // 4. Return the completed travel object
      return newTrip;
   }


} // end Main class
