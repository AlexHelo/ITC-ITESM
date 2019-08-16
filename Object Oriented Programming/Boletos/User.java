import java.util.ArrayList;

public class User {
    private String name;
    private char ticketType;
    private int numOfTickets;
    private ArrayList<int[]> ticketPlaces = new ArrayList<int[]>();

    public User(String name, char ticketType, int numOfTickets) {
        this.name = name;
        this.ticketType = ticketType;
        this.numOfTickets = numOfTickets;
        System.out.println("User \"" + name + "\" created:");
        System.out.println("\tTicket type: " + ticketType);
        System.out.println("\tNum of tickets: " + numOfTickets);
    }

    public char getTickets() {
        return ticketType;
    }

    public String getName(){
        return name;
    }
    public void setTicketPlace(int x, int y) {
        int[] ticket = { x, y };
        ticketPlaces.add(ticket);
        System.out.println("\"" + name + "\" has acquired place " + ((char) (y + 'A')) + (x + 1) + ", has "
                + getTicketsLeft() + " tickets left.");
    }

    public int getTicketsLeft() {
        return numOfTickets - ticketPlaces.size();
    }

    public int calcPrice() {
        switch (ticketType) {
        case 'A':
            return 250 * numOfTickets;
        case 'B':
            return 150 * numOfTickets;
        case 'C':
            return 50 * numOfTickets;
        default:
            return 0;
        }
    }
}