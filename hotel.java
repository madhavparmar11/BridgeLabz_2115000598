public class hotel {
    int nights;
    String guestname;
    String roomtype;

    hotel(String guestname, String roomtype, int nights) {
        this.guestname = guestname;
        this.roomtype = roomtype;
        this.nights = nights;
    }

    hotel() {
        this.guestname = "No Name";
        this.roomtype = "No Room Type";
        this.nights = 0;
    }

    hotel(hotel other) {
        this.guestname = other.guestname;
        this.roomtype = other.roomtype;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest Name: " + guestname);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        hotel h1 = new hotel("John", "Single", 3);
        hotel h2 = new hotel();
        hotel h3 = new hotel(h1);
        h1.display();
        h2.display();
    }
}
