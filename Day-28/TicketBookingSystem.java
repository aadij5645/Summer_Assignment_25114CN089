import java.util.Scanner;
public class TicketBookingSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int availableTickets = 10;
        int choice, tickets;
        do {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter number of tickets: ");
                    tickets = sc.nextInt();
                    if (tickets <= availableTickets) 
                    {
                        availableTickets = availableTickets - tickets;
                        System.out.println("Ticket booked successfully.");
                    } 
                    else 
                    {
                        System.out.println("Tickets not available.");
                    }
                    break;
                case 2:
                    System.out.println("Available Tickets: " + availableTickets);
                    break;
                case 3:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
}