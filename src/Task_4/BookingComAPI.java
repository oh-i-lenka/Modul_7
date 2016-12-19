package Task_4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookingComAPI implements API {


     static public List<Room> listOfRoomsBC(){
         List<Room> roomsFromBC = new ArrayList<>();
        roomsFromBC.add(new Room(1111, 480, 1, new Date(10,2,117), "Hilton", "Karlovu Varu"));
        roomsFromBC.add(new Room(1011,920, 4, new Date (2017,5,1), "Khreshatyk", "Kyiv"));
        roomsFromBC.add(new Room(1101,1200, 2, new Date(117,1,1), "Khreshatyk", "Kyiv"));
        roomsFromBC.add(new Room(1110,920, 4, new Date(117,1,1), "Bristol", "Wien"));
        roomsFromBC.add(new Room(1001,920, 1, new Date(117,1,1), "Sacher", "Wien"));
        roomsFromBC.add(new Room(2122, 1155, 3, new Date(113,1,27), "Hilton", "Budapest"));
        return roomsFromBC;
    }

    public BookingComAPI() {
    }

    @Override
    public  List<Room> findRooms() {
        List<Room> roomsFromBC = listOfRoomsBC();
        Iterator<Room> iter = roomsFromBC.iterator();
        while (iter.hasNext()) {
            Room currentRoom = (Room) iter.next();
            if ((currentRoom.getPrice() != Main.price) || (currentRoom.getCityName() != Main.city) || (currentRoom.getHotelName() != Main.hotel)){
                iter.remove();
            }
        }
        return roomsFromBC;
    }
}
