//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    BookingService service = new BookingService();

    service.confirmReservation(new Reservation("Rahul","Single Room"));
    service.confirmReservation(new Reservation("Priya","Suite Room"));

}
