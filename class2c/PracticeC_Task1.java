package class2c;

class Ticket {
    private static int nextNumber = 1;
    private String ticketId;

    public Ticket() {
        this.ticketId = String.format("T-%03d", nextNumber++);
    }

    public void printTicket() {
        System.out.println("Issued Ticket: " + this.ticketId);
    }
}

public class PracticeC_Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Ticket t = new Ticket();
            t.printTicket();
        }
    }
}