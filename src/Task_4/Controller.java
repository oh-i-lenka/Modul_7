package Task_4;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public List<Room> requestRooms() {

        List<API> apiList = new ArrayList<>();
        apiList.add(new GoogleAPI());
        apiList.add(new BookingComAPI());
        apiList.add(new TripAdvisorAPI());

        List<Room> allAPIRooms = new ArrayList<>();

        for (int i = 0; i < apiList.size(); i++) {
            List<Room> eachAPIRooms = apiList.get(i).findRooms();
            List<Room> tempListofDoubles = new ArrayList<>();
            tempListofDoubles.clear();
            for (int j = i + 1; j < apiList.size(); j++) {
                tempListofDoubles.addAll(check(apiList.get(i), apiList.get(j)));
            }
            for (int k = 0; k < tempListofDoubles.size(); k++) {
                int index = eachAPIRooms.lastIndexOf(tempListofDoubles.get(k));
                eachAPIRooms.remove(index);
            }
            allAPIRooms.addAll(eachAPIRooms);
        }
        return allAPIRooms;
    }

    public List<Room> check(API api1, API api2) {
        List<Room> resultingRooms = new ArrayList<>();
        List<Room> listAPI1 = new ArrayList<>();
        List<Room> listAPI2 = new ArrayList<>();
        listAPI1.addAll(api1.findRooms());
        listAPI2.addAll(api2.findRooms());
        int k = 0;
        for (int i = 0; i < listAPI1.size(); i++) {
            for (int j = 0; j < listAPI2.size(); j++) {
                if (listAPI1.get(i).equals(listAPI2.get(j)) == true) {
                    resultingRooms.add(k, listAPI1.get(i));
                    k++;
                }
            }
        }
        return resultingRooms;
    }
}

