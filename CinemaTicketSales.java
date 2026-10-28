import java.util.Scanner;

public class CinemaTicketSales{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int ticketCount;
         double ticketPrice = 50000;
         double totalTicketSold = 0;
         double discount;
         double totalPrice;
         double totalSales = 0;

         while (true){
            System.out.print("Enter number of tickets bought (enter 0 to finish): ");
            ticketCount = sc.nextInt();

            if (ticketCount == 0){
                break;
            }
            
            if (ticketCount <= 0){
                System.out.println("Invalid input! Please try again!");
                continue;
            }

            if (ticketCount >10){
                discount = 0.15;
            } else if (ticketCount > 4){
                discount = 0.10;
            } else {
                discount = 0.00;
            }

            totalPrice = ticketCount * ticketPrice * (1 - discount);

            totalTicketSold += ticketCount;
            totalSales += totalPrice;

            System.out.println("Discount: " + (discount * 100) + "%");
            System.out.println("Total purchase: " + totalPrice);

        }
    
        System.out.println("=== Daily Report ===");
        System.out.println("Total Ticket Sold: " + totalTicketSold);
        System.out.println("Total Sales: " + totalSales);
        
        sc.close();
    
    }
}