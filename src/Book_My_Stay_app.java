import java.util.HashMap;

class RoomInventory{

    HashMap<String,Integer> inventory = new HashMap<>();

    void addRoom(String type,int count){
        inventory.put(type,count);
    }

    void displayInventory(){

        System.out.println("Room Inventory");

        for(String key : inventory.keySet()){
            System.out.println(key+" : "+inventory.get(key));
        }
    }
}
