import java.util.ArrayList;

public class Operations {


    private static final int CONFIRMEDTICKET = 15;
    private static final int LOWERBERTH = 2;
    private static final int MIDDLEBERTH = 2;
    private static final int UPPERBERTH = 2;
    private static final int RACTICKET = 2;
    private static final int WAITINGLIST = 1;

    private static int availableLowerberth = 2;
    private static int availableMiddleberth = 2;
    private static int availableUpperberth = 2;
    private static int availableRacTicktet = 2;
    private static int availableWaitingListTicket = 1;

    public static void setAvailableLowerberth(int availableLowerberth) {
        Operations.availableLowerberth = availableLowerberth;
    }

    public static void setAvailableMiddleberth(int availableMiddleberth) {
        Operations.availableMiddleberth = availableMiddleberth;
    }

    public static void setAvailableUpperberth(int availableUpperberth) {
        Operations.availableUpperberth = availableUpperberth;
    }

    public static void setAvailableRacTicktet(int availableRacTicktet) {
        Operations.availableRacTicktet = availableRacTicktet;
    }

    public static void setAvailableWaitingListTicket(int availableWaitingListTicket) {
        Operations.availableWaitingListTicket = availableWaitingListTicket;
    }

    public static int getAvailableLowerberth() {
        return availableLowerberth;
    }

    public static int getAvailableMiddleberth() {
        return availableMiddleberth;
    }

    public static int getAvailableUpperberth() {
        return availableUpperberth;
    }

    public static int getAvailableRacTicktet() {
        return availableRacTicktet;
    }

    public static int getAvailableWaitingListTicket() {
        return availableWaitingListTicket;
    }

    public static ArrayList<Ticket> getAllTickets() {
        return allTickets;
    }

    static ArrayList<Ticket> allTickets = new ArrayList<>();

    public static void printAllTickets()
    {
        for(Ticket t:allTickets)
        {
            System.out.println(t.toString());
            System.out.println();
        }
    }
    public static Ticket getByPassengerId(String passengerId)
    {
        for(Ticket t:allTickets){
            if(t.getPassengerId().equals(passengerId))
            {
                return t;
            }
        }
        return null;
    }
    public static void addToAllTickets(Ticket ticket)
    {
        allTickets.add(ticket);
    }

    public static int getConfirmedticket()
    {
        return CONFIRMEDTICKET;
    }
    public static int getRacticket()
    {
        return RACTICKET;
    }
    public static int getWaitinglist()
    {
        return WAITINGLIST;
    }

    public  static int getLOWERBERTH() {
        return LOWERBERTH;
    }

    public static int getMIDDLEBERTH() {
        return MIDDLEBERTH;
    }

    public static int getUPPERBERTH() {
        return UPPERBERTH;
    }

    public static void bookTicket(Ticket ticket)
    {
        if(ticket.getAge()<5)
        {
            System.out.println("Berth is not allocated for children below 5 yo");
            return;
        }

        if(ticket.getBerthPreference().equals("L"))
        {
           if(getAvailableLowerberth()!=0 )
           {
               ticket.setBerthPreference("L");
               setAvailableLowerberth(getAvailableLowerberth()-1);
               ConfirmedTickets.addTicket(ticket);
               addToAllTickets(ticket);
           }
           else{
               System.out.println("Lower berth not available");
               if(getAvailableMiddleberth()!=0)
               {
                   ticket.setBerthPreference("M");
                   setAvailableMiddleberth(getAvailableMiddleberth()-1);
                   ConfirmedTickets.addTicket(ticket);
                   addToAllTickets(ticket);
               }
               else
               {
                   if(getAvailableUpperberth()!=0)
                   {
                       ticket.setBerthPreference("U");
                       setAvailableUpperberth(getAvailableUpperberth()-1);
                       ConfirmedTickets.addTicket(ticket);
                       addToAllTickets(ticket);
                   }
                   else
                   {
                      if(getAvailableRacTicktet()!=0)
                      {
                          ticket.setBerthPreference("RAC");
                          setAvailableRacTicktet(getAvailableRacTicktet()-1);
                          RacTickets.addTicket(ticket);
                          addToAllTickets(ticket);
                      }
                      else
                      {
                          if(getAvailableWaitingListTicket()!=0)
                          {
                              ticket.setBerthPreference("WL");
                              setAvailableWaitingListTicket(getAvailableWaitingListTicket()-1);
                              WaitingList.addTicket(ticket);
                              addToAllTickets(ticket);
                          }
                          else
                          {
                              System.out.println("No tickets available at the moment");
                          }
                      }
                   }
               }
           }
        }
       else if(ticket.getBerthPreference().equals("M"))
        {
            if(getAvailableMiddleberth()!=0)
            {
                ticket.setBerthPreference("M");
                ConfirmedTickets.addTicket(ticket);
                setAvailableMiddleberth(getAvailableMiddleberth()-1);
                allTickets.add(ticket);
            }
            else
            {
                if(getAvailableLowerberth()!=0)
                {
                    ConfirmedTickets.addTicket(ticket);
                    ticket.setBerthPreference("L");
                    setAvailableLowerberth(getAvailableLowerberth()-1);
                    allTickets.add(ticket);
                }
                else
                {
                  if(getAvailableUpperberth()!=0)
                  {
                      ConfirmedTickets.addTicket(ticket);
                      ticket.setBerthPreference("U");
                      setAvailableUpperberth(getAvailableUpperberth()-1);
                      allTickets.add(ticket);
                  }
                  else{
                      if(getAvailableRacTicktet()!=0)
                      {
                          ticket.setBerthPreference("RAC");
                          setAvailableRacTicktet(getAvailableRacTicktet()-1);
                          RacTickets.addTicket(ticket);
                          addToAllTickets(ticket);
                      }
                      else
                      {
                          if(getAvailableWaitingListTicket()!=0)
                          {
                              ticket.setBerthPreference("WL");
                              setAvailableWaitingListTicket(getAvailableWaitingListTicket()-1);
                              WaitingList.addTicket(ticket);
                              addToAllTickets(ticket);
                          }
                          else
                          {
                              System.out.println("No tickets available at the moment");
                          }
                      }
                  }
                }
            }
        }
       else
        {
            if(getAvailableUpperberth()!=0)
            {
                ticket.setBerthPreference("U");
                setAvailableUpperberth(getAvailableUpperberth()-1);
                ConfirmedTickets.addTicket(ticket);
                allTickets.add(ticket);

            }
            else{
                if(getAvailableMiddleberth()!=0)
                {
                    ticket.setBerthPreference("M");
                    ConfirmedTickets.addTicket(ticket);
                    setAvailableMiddleberth(getAvailableMiddleberth()-1);
                    allTickets.add(ticket);
                }
                else {
                    if (getAvailableLowerberth() != 0) {
                        ConfirmedTickets.addTicket(ticket);
                        ticket.setBerthPreference("L");
                        setAvailableLowerberth(getAvailableLowerberth() - 1);
                        allTickets.add(ticket);
                    }
                    else
                    {
                        if(getAvailableRacTicktet()!=0)
                        {
                            ticket.setBerthPreference("RAC");
                            setAvailableRacTicktet(getAvailableRacTicktet()-1);
                            RacTickets.addTicket(ticket);
                            addToAllTickets(ticket);
                        }
                        else
                        {
                            if(getAvailableWaitingListTicket()!=0)
                            {
                                ticket.setBerthPreference("WL");
                                setAvailableWaitingListTicket(getAvailableWaitingListTicket()-1);
                                WaitingList.addTicket(ticket);
                                addToAllTickets(ticket);
                            }
                            else
                            {
                                System.out.println("No tickets available at the moment");
                            }
                        }
                    }
                }
            }
        }
    }

    public static void cancelTicket(String passengerId)
    {
        Ticket ticket =getByPassengerId(passengerId);
        allTickets.remove(ticket);
        if(ticket.getBerthPreference().equals("M") || ticket.getBerthPreference().equals("L") || ticket.getBerthPreference().equals("U"))
        {
            ConfirmedTickets.removeTicket(ticket);
            if(ticket.getBerthPreference().equals("M"))
            {
                setAvailableMiddleberth(getAvailableMiddleberth()+1);
            }
            else if(ticket.getBerthPreference().equals("U"))
            {
                setAvailableUpperberth(getAvailableUpperberth()+1);
            }
            else
            {
                setAvailableLowerberth(getAvailableLowerberth()+1);
            }
            if(!RacTickets.isEmpty())
            {

                Ticket t = RacTickets.getPriorityCustomer();
                RacTickets.removeticket(t);
                t.setBerthPreference(ticket.getBerthPreference());
               ConfirmedTickets.addTicket(t);

                setAvailableRacTicktet(getAvailableRacTicktet()+1);
            }
        }
        else if(ticket.getBerthPreference().equals("RAC")) {

            RacTickets.removeticket(ticket);
            if (!WaitingList.isEmpty()) {
                RacTickets.addTicket(WaitingList.getPriorityCustomer());
                setAvailableWaitingListTicket(getAvailableWaitingListTicket() + 1);
                addToAllTickets(ticket);
            }

        }

    }

}
