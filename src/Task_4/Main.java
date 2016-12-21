package Task_4;

import java.util.Date;

public class Main {
    static Integer price;
    static Integer persons;
    static String hotel;
    static String city;

    public static void main(String[] args) {
        price = 1155;
        persons = 3;
        hotel = "Hilton";
        city = "Budapest";

        Controller controller = new Controller();
        controller.requestRooms();

        DAO_impl dataBase = new DAO_impl();
        System.out.println(dataBase.getAll());

        Room roomDAO = new Room(1011, 920, 4, new Date(2017, 5, 1), "Chreshatyk", "Kyiv");
        dataBase.save(roomDAO);
        Room roomDAO2 = new Room(2122, 1155, 3, new Date(113, 1, 17), "Hilton", "Budapest");
        dataBase.delete(roomDAO2);
        dataBase.update(roomDAO2);
        dataBase.findById(2122);
        dataBase.getAll();
    }
}
