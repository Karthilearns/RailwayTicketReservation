import java.util.ArrayList;

public class RacTickets
{
    private static ArrayList<Ticket> racTickets = new ArrayList<>();

    public static boolean isTicketAvailable()
    {
        return racTickets.size()== Operations.getAvailableRacTicktet();
    }
    public  static void addTicket(Ticket ticket)
    {
        racTickets.add(ticket);
    }
    public static Ticket getPriorityCustomer()
    {
        return(racTickets.get(0));
    }

    public static boolean isEmpty()
    {
        return racTickets.size()==0;
    }
    public static void removeticket(Ticket ticket)
    {
        racTickets.remove(ticket);
    }
}

