import java.util.Scanner;

class Ticket {
    int ticketId;
    char[] passengerName;
    char[] trainName;
    int seatNumber;
    Ticket next;

    Ticket(int ticketId, char[] passengerName, char[] trainName, int seatNumber) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.trainName = trainName;
        this.seatNumber = seatNumber;
        this.next = null;
    }
}

class TicketReservation {
    Ticket head;

    void bookTicket(int ticketId, char[] passengerName, char[] trainName, int seatNumber) {
        Ticket newTicket = new Ticket(ticketId, passengerName, trainName, seatNumber);
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
            while (temp.passengerName[i] != '\0') System.out.print(temp.passengerName[i++]);
            System.out.print(" ");
            i = 0;
            while (temp.trainName[i] != '\0') System.out.print(temp.trainName[i++]);
            System.out.println(" " + temp.seatNumber);
            temp = temp.next;
        } while (temp != this.head);
    }

    Ticket searchTicketByPassenger(char[] passengerName) {
        if (this.head == null) return null;
        Ticket temp = this.head;
        do {
            int i = 0;
            while (temp.passengerName[i] == passengerName[i] && temp.passengerName[i] != '\0' && passengerName[i] != '\0') i++;
            if (temp.passengerName[i] == '\0' && passengerName[i] == '\0') return temp;
            temp = temp.next;
        } while (temp != this.head);
        return null;
    }
}

public class TrainTicketReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketReservation system = new TicketReservation();

        system.bookTicket(1, new char[]{'J', 'o', 'h', 'n', '\0'}, new char[]{'E', 'x', 'p', 'r', 'e', 's', 's', '\0'}, 5);
        system.bookTicket(2, new char[]{'A', 'n', 'n', '\0'}, new char[]{'F', 'a', 's', 't', '\0'}, 10);
        system.bookTicket(3, new char[]{'M', 'a', 'r', 'k', '\0'}, new char[]{'E', 'x', 'p', 'r', 'e', 's', 's', '\0'}, 15);

        system.displayTickets();
        system.cancelTicket(2);
        system.displayTickets();

        scanner.close();
    }
}
