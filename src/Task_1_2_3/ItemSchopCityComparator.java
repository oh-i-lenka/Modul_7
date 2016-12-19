package Task_1_2_3;

import java.util.Comparator;

public class ItemSchopCityComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getItemName().compareTo(o2.getItemName()) == 0){
            if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0){
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        };
        return o1.getItemName().compareTo(o2.getItemName());
    }
}
