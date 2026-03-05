import java.util.*;

class BookingService{

    HashMap<String,Set<String>> allocatedRooms = new HashMap<>();

    void confirmReservation(Reservation r){

        String roomID = r.roomType.substring(0,2)+"-"+UUID.randomUUID().toString().substring(0,4);

        allocatedRooms.putIfAbsent(r.roomType,new HashSet<>());

        allocatedRooms.get(r.roomType).add(roomID);

        System.out.println("Reservation Confirmed");
        System.out.println("Guest : "+r.guestName);
        System.out.println("Room ID : "+roomID);
    }
}
