class SearchService{

    void searchRooms(RoomInventory inventory){

        System.out.println("Available Rooms");

        for(String key : inventory.inventory.keySet()){

            int count = inventory.inventory.get(key);

            if(count>0){
                System.out.println(key+" available : "+count);
            }
        }
    }
}
