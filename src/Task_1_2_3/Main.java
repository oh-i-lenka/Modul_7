package Task_1_2_3;

import java.util.*;

public class Main {

    static Set<Order> setOfOrders = new TreeSet<>();
    static List<Order> listOfOrders = new ArrayList<>();
    static List<User> listOfUsers = new ArrayList<>();


    public static void main(String[] args) {
        creatingListOfOrders();
        creatingSetOfOrders();
        sortByPrice();
        sortByShopAndCity();
        deletingDuplicates();
        deletingBySpecificPrice();
        separateByCurrency();
        lookingForPetrov();
        maxPrice();
        deletingUSD();
        uniqueCities();
    }

    static public List<User> creatingListOfUsers() {
        listOfUsers.add( new User(1, "Birgit", "Wolf", "Wien", 5000));
        listOfUsers.add(new User(3, "Ann", "Smith", "Prague", 4400));
        listOfUsers.add(new User(2, "Petra", "Szabo", "Wien", 3000));
        listOfUsers.add( new User(4, "Sabine", "Schmidt", "Tirol", 5010));
        listOfUsers.add(new User(5, "David", "Pfiller", "Tirol", 105000));
        listOfUsers.add( new User(6, "Phillip", "Cooper", "Villah", 65000));
        listOfUsers.add(new User(7, "Bruno", "Massi", "Kyiv", 25000));
        listOfUsers.add(new User(8, "Oleg", "Petrov", "Prague", 35000));
        listOfUsers.add(new User(9, "Tanya", "Sidorova", "Kyiv", 150));
        listOfUsers.add(new User(10, "Oksana", "Ivanova", "Kyiv", 1500));
        return listOfUsers;
    }

    static public List<Order> creatingListOfOrders(){
        creatingListOfUsers();
        listOfOrders.add(new Order(101, 1034, Currency.EUR, "Loafers", "Veromoda", listOfUsers.get(0)));
        listOfOrders.add(new Order(102, 254, Currency.EUR, "ChelsyBoots", "Geox", listOfUsers.get(1)));
        listOfOrders.add(new Order(103, 334, Currency.USD, "Espadrilles", "Zara", listOfUsers.get(1)));
        listOfOrders.add(new Order(103, 334, Currency.USD, "Espadrilles", "Zara", listOfUsers.get(2)));
        listOfOrders.add(new Order(104, 254, Currency.USD, "Loafers", "Mango", listOfUsers.get(3)));
        listOfOrders.add(new Order(105, 254, Currency.USD, "Boots", "H&M", listOfUsers.get(4)));
        listOfOrders.add(new Order(106, 254, Currency.EUR, "Boots", "H&M", listOfUsers.get(5)));
        listOfOrders.add(new Order(106, 254, Currency.EUR, "Boots", "H&M", listOfUsers.get(5)));
        listOfOrders.add(new Order(107, 1500, Currency.USD, "Boots", "H&M",listOfUsers.get(6)));
        listOfOrders.add(new Order(108, 1230, Currency.UAH, "Turnschuhe", "Tommy_Hilfiger", listOfUsers.get(7)));
        listOfOrders.add(new Order(109, 2540, Currency.UAH, "Balerinas", "Tom_Tailor", listOfUsers.get(8)));
        listOfOrders.add(new Order(110, 2356, Currency.UAH, "Pumps", "Tommy_Hilfiger", listOfUsers.get(9)));

        return listOfOrders;
    }

    static public Set<Order> creatingSetOfOrders(){
        creatingListOfOrders();
        setOfOrders.addAll(listOfOrders);
        return setOfOrders;
    }

    static public List<Order> sortByShopAndCity(){
        Collections.sort(listOfOrders, new Task_1_2_3.ItemSchopCityComparator());
        System.out.println(listOfOrders);
        return listOfOrders;
    }

    static public List<Order> sortByPrice(){
        Collections.sort(listOfOrders, new Task_1_2_3.PriceComparator());
        System.out.println(listOfOrders);
        return listOfOrders;
    }

    static public void deletingDuplicates (){
        Set<Order> tempSet = new TreeSet<>();
        tempSet.addAll(listOfOrders);
        listOfOrders.clear();
        listOfOrders.addAll(tempSet);
        System.out.println("Duplicates are deleted");
    }

    static public void deletingBySpecificPrice(){
        Iterator iterListOrders = listOfOrders.iterator();
        while (iterListOrders.hasNext()) {
            Order currentOrder = (Order) iterListOrders.next();
            if (currentOrder.getPrice() < 1500) {
                iterListOrders.remove();
            }
        }
        System.out.println(listOfOrders);
    }

    static public void separateByCurrency(){
        List<Order> listUSDOrders = new ArrayList<>();
        List<Order> listUAHOrders = new ArrayList<>();
        int i = 0;
        int j = 0;
        for (Order item : listOfOrders) {
            if (item.getCurrency() == Currency.USD) {
                listUSDOrders.add(i,item);
                i++;
            }
            if (item.getCurrency() == Currency.UAH) {
                listUAHOrders.add(j,item);
                j++;
            }
        }
        System.out.println(listUAHOrders);
        System.out.println(listUSDOrders);
    }

    static public boolean lookingForPetrov(){
        boolean result = false;
        for (Task_1_2_3.Order item : setOfOrders) {
            if (item.getUser().getLastName() == "Petrov") {
                System.out.printf("The TreeSet contains surname Petrov");
                result = true;
            }
        }
        if (result = false){
            System.out.printf("The TreeSet does not contain any surname Petrov");
        }
        return result;
    }

    static public Order maxPrice(){
        int maxPrice = 0;
        Order orderMaxPrice = new Order(0,0,null,"","", null);
        Task_1_2_3.Currency currencyMaxPrice = null;
        for (Task_1_2_3.Order item : setOfOrders) {
            if (item.getPrice() > maxPrice) {
                maxPrice = item.getPrice();
                currencyMaxPrice = item.getCurrency();
                orderMaxPrice = item;
            }
        }
        System.out.printf("The maximum price is " + maxPrice + " " + currencyMaxPrice);

       return  orderMaxPrice;
    }

    static public void deletingUSD(){
        Iterator iter = setOfOrders.iterator();
        while (iter.hasNext()){
            Order currentElement = (Order)iter.next();
            if (currentElement.getCurrency() == Currency.USD){
                iter.remove();
            }
        }
        System.out.println(setOfOrders);
    }

    static public void uniqueCities() {
        creatingListOfUsers();
        Map<String, List<User>> uniqCitiesMap = new TreeMap<>();

        for (User item : listOfUsers) {
            if (uniqCitiesMap.containsKey(item.getCity())) {
                uniqCitiesMap.put(item.getCity(), putInMap(uniqCitiesMap.get(item.getCity()), item));
            } else {

                uniqCitiesMap.put(item.getCity(), putInMap(new ArrayList<>(), item));
            }
        }
        System.out.println(uniqCitiesMap);
    }

    static List<User> putInMap(List<User> listOfUsers, User user) {
        listOfUsers.add(user);
        return listOfUsers;
    }
}