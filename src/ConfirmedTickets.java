import java.util.ArrayList;

public class ConfirmedTickets
{
    private static ArrayList<Ticket> confirmedTickets = new ArrayList<>();

    public static boolean isTicketAvailable()
    {
        return confirmedTickets.size()==Operations.getConfirmedticket();
    }

    public  static void addTicket(Ticket ticket)
    {
        confirmedTickets.add(ticket);
    }
    public static void removeTicket(Ticket ticket)
    {

        confirmedTickets.remove(ticket);
    }


}
