package Task_4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TripAdvisorAPI implements API {

    static public List<Room> listOfRoomsTA() {
        List<Room> roomsFromTA = new ArrayList<>();
        roomsFromTA.add(new Room(2122, 1155, 3, new Date(113, 1, 17), "Hilton", "Budapest"));
        roomsFromTA.add(new Room(1001, 920, 1, new Date(117, 1, 1), "Sacher", "Wien"));
        roomsFromTA.add(new Room(2222, 1655, 1, new Date(117, 1, 2), "Hilton", "Wien"));
        roomsFromTA.add(new Room(2220, 920, 1, new Date(117, 1, 1), "Sacher", "Wien"));
        roomsFromTA.add(new Room(2002, 720, 3, new Date(117, 1, 1), "Ritz", "Madrid"));
        roomsFromTA.add(new Room(2200, 650, 2, new Date(117, 1, 1), "Santa-Maria", "Candolim"));
        roomsFromTA.add(new Room(2022, 1255, 2, new Date(117, 1, 7), "Hilton", "Wien"));
        roomsFromTA.add(new Room(2122, 1155, 3, new Date(113, 2, 17), "Hilton", "Budapest"));
        return roomsFromTA;
    }

    public TripAdvisorAPI() {
    }

    @Override
    public List<Room> findRooms() {
        List<Room> roomsFromTA = listOfRoomsTA();
        Iterator<Room> iter = roomsFromTA.iterator();
        while (iter.hasNext()) {
            Room currentRoom = (Room) iter.next();
            if ((currentRoom.getPrice() != Main.price) || (currentRoom.getCityName() != Main.city) || (currentRoom.getHotelName() != Main.hotel)) {
                iter.remove();
            }
        }
        return roomsFromTA;
    }
}
