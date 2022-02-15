import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scans = new Scanner(System.in);

        int choice = 1; int idGenerator =0;
        while (choice == 1 || choice==2 || choice==3) {
            System.out.println("enter choice");
            choice = scans.nextInt();
            switch (choice) {
                case 1:

                    String passengerId = "passenger"+idGenerator++;
                    String name = scans.next();
                    String berthPreference = scans.next();
                    int age = scans.nextInt();

                    Ticket passenger = new Ticket(passengerId,name, berthPreference, age);
                    Operations.bookTicket(passenger);
                    break;

                case 2:
                    String passengerIds = scans.next();
                    Operations.cancelTicket(passengerIds);
                    break;

                case 3:
                    Operations.printAllTickets();
                    break;
            }
        }
    }
}