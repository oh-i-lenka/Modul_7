package Task_4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoogleAPI implements API {

    static public List<Room> listOfRoomsGA() {
        List<Room> roomsFromGA = new ArrayList<>();
        roomsFromGA.add(new Room(3033, 350, 2, new Date(10, 3, 117), "Hilton", "Budapest"));
        roomsFromGA.add(new Room(2122, 1155, 3, new Date(113, 2, 27), "Hilton", "Budapest"));
        roomsFromGA.add(new Room(3303, 480, 1, new Date(117, 02, 7), "Hilton", "Karlovu Varu"));
        roomsFromGA.add(new Room(3330, 720, 3, new Date(117, 1, 1), "Ritz", "Madrid"));
        roomsFromGA.add(new Room(1001, 920, 1, new Date(117, 2, 1), "Sacher", "Wien"));
        roomsFromGA.add(new Room(3003, 650, 2, new Date(117, 1, 1), "Santa-Maria", "Candolim"));
        roomsFromGA.add(new Room(3300, 650, 2, new Date(117, 1, 1), "Beach Resort", "Panaji"));
        roomsFromGA.add(new Room(3333, 1155, 3, new Date(13, 1, 17), "Hilton", "Budapest"));
        roomsFromGA.add(new Room(2122, 1155, 3, new Date(113, 1, 27), "Hilton", "Budapest"));
        return roomsFromGA;
    }

    public GoogleAPI() {
    }

    @Override
    public List<Room> findRooms() {
        List<Room> roomsFromGA = listOfRoomsGA();
        Iterator<Room> iter = roomsFromGA.iterator();
        while (iter.hasNext()) {
            Room currentRoom = (Room) iter.next();
            if ((currentRoom.getPrice() != Main.price) || (currentRoom.getCityName() != Main.city) || (currentRoom.getHotelName() != Main.hotel)) {
                iter.remove();
            }
        }
        return roomsFromGA;
    }
}
