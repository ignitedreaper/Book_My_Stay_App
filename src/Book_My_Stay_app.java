import java.util.LinkedList;
import java.util.Queue;

class Reservation{

    String guestName;
    String roomType;

    Reservation(String name,String room){
        guestName=name;
        roomType=room;
    }
}

class BookingQueue{

    Queue<Reservation> queue = new LinkedList<>();

    void addRequest(Reservation r){

        queue.offer(r);
        System.out.println("Booking request added for "+r.guestName);
    }
}
