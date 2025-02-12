import java.util.Scanner;

class Ticket {
    int ticketId;
    char[] customerName;
    char[] movieName;
    int seatNumber;
    Ticket next;

    Ticket(int ticketId, char[] customerName, char[] movieName, int seatNumber) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.next = null;
    }
}

class TicketSystem {
    Ticket head;

    void bookTicket(int ticketId, char[] customerName, char[] movieName, int seatNumber) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber);
        if (this.head == null) {
            this.head = newTicket;
            this.head.next = this.head;
            return;
        }
        Ticket temp = this.head;
        while (temp.next != this.head) temp = temp.next;
        temp.next = newTicket;
        newTicket.next = this.head;
    }

    void cancelTicket(int ticketId) {
        if (this.head == null) return;
        Ticket temp = this.head, prev = null;
        if (this.head.ticketId == ticketId && this.head.next == this.head) {
            this.head = null;
            return;
        }
        do {
            if (temp.ticketId == ticketId) {
                if (prev != null) prev.next = temp.next;
                else {
                    Ticket last = this.head;
                    while (last.next != this.head) last = last.next;
                    this.head = this.head.next;
                    last.next = this.head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != this.head);
    }

    void displayTickets() {
        if (this.head == null) return;
        Ticket temp = this.head;
        do {
            System.out.print(temp.ticketId + " ");
            int i = 0;
            while (temp.customerName[i] != '\0') System.out.print(temp.customerName[i++]);
            System.out.print(" ");
            i = 0;
            while (temp.movieName[i] != '\0') System.out.print(temp.movieName[i++]);
            System.out.println(" " + temp.seatNumber);
            temp = temp.next;
        } while (temp != this.head);
    }
}

public class OnlineTicketReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketSystem system = new TicketSystem();

        system.bookTicket(1, new char[]{'A', 'l', 'i', 'c', 'e', '\0'}, new char[]{'A', 'v', 'a', 't', 'a', 'r', '\0'}, 12);
        system.displayTickets();
        system.cancelTicket(1);
        system.displayTickets();

        scanner.close();
    }
}
