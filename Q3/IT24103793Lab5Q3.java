import java.util.Scanner;

public class IT24103793Lab5Q3 {
    static final int ROOM_CHARGES_PER_DAY = 48000;     static final int MIN_DATE = 1;  // Minimum valid date
    static final int MAX_DATE = 31; 
    static final int DISCOUNT_10 = 10;  
    static final int DISCOUNT_20 = 20;      
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the start date of reservation (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date of reservation (1-31): ");
        int endDate = scanner.nextInt();

                if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;  // Exit the program if validation fails
        }

                if (startDate >= endDate) {
            System.out.println("Error: Start date must be earlier than end date.");
            return;  // Exit the program if validation fails
        }

               int numOfDays = endDate - startDate;

               int discount = 0;
        if (numOfDays >= 3 && numOfDays <= 4) {
            discount = DISCOUNT_10;
        } else if (numOfDays >= 5) {
            discount = DISCOUNT_20;
        }

               int totalAmount = numOfDays * ROOM_CHARGES_PER_DAY;

                int discountAmount = (totalAmount * discount) / 100;

                int finalAmount = totalAmount - discountAmount;

        System.out.println("Number of days reserved: " + numOfDays);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Discount amount: Rs " + discountAmount);
        System.out.println("Final amount to be paid: Rs " + finalAmount);

                scanner.close();
    }
}
