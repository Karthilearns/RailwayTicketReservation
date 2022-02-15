import java.util.ArrayList;

public class WaitingList
{

    private static ArrayList<Ticket> waitingListTickets = new ArrayList<>();

    public static boolean isTicketAvailable()
    {
        return waitingListTickets.size()== Operations.getWaitinglist();
    }
    public  static void addTicket(Ticket ticket)
    {
        waitingListTickets.add(ticket);
    }
    public static Ticket getPriorityCustomer()
    {
        return(waitingListTickets.get(0));
    }

    public static boolean isEmpty()
    {
        return waitingListTickets.size()==0;
    }
}
