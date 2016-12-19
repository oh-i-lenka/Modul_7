package Task_4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DAO_impl implements DAO {
    static List<Room> dbRooms = new ArrayList<>();

    public List<Room> getAll() {
        dbRooms.addAll(BookingComAPI.listOfRoomsBC());
        dbRooms.addAll(GoogleAPI.listOfRoomsGA());
        dbRooms.addAll(TripAdvisorAPI.listOfRoomsTA());
        return dbRooms;
    }

    @Override
    public Room save(Room room) {
        dbRooms.add(room);
        System.out.println("The " + room.toString() + "successfully saved!");
        System.out.println(dbRooms);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        dbRooms.remove(room);
        System.out.println("The " + room.toString() + "successfully deleted!");
        System.out.println(dbRooms);
        return true;
    }

    @Override
    public Room update(Room room) {
        Room updatedRoom = new Room();
        for (int j = 0; j < dbRooms.size(); j++) {
            if (dbRooms.get(j).getId() == room.getId()) {
                dbRooms.set(j, room);
            }
        }
        System.out.println("The " + room.toString() + "successfully updated!");
        System.out.println(dbRooms);
        return updatedRoom;
    }

    @Override
    public Room findById(long id) {
        Room requiredRoom = new Room();

        Iterator iter = dbRooms.iterator();

        while (iter.hasNext()) {
            Room currentRoom = (Room) iter.next();
            if (currentRoom.getId() == id) {
                requiredRoom = currentRoom;
            }
        }
        System.out.println("The request rooms are " + requiredRoom.toString());
        return requiredRoom;
    }
}
