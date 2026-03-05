abstract class Room {

    String type;
    double price;

    Room(String type,double price){
        this.type = type;
        this.price = price;
    }

    void display(){
        System.out.println("Room Type : "+type);
        System.out.println("Price : "+price);
    }
}

class SingleRoom extends Room{

    SingleRoom(){
        super("Single Room",2000);
    }
}

class DoubleRoom extends Room{

    DoubleRoom(){
        super("Double Room",3500);
    }
}

class SuiteRoom extends Room{

    SuiteRoom(){
        super("Suite Room",7000);
    }
}
