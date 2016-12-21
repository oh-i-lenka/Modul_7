package Task_1_2_3;

public class Order implements Comparable<Order> {
    private long id;
    private Integer price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long id, Integer price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }


     @Override
    public int compareTo(Order o) {
        int res = 0;
        if (this.getId() > o.getId()) {
            res = 1;
        }
        if (this.getId() < o.getId()) {
            res = -1;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id + " item " + itemName +
                " shop " + getShopIdentificator() + " price " + price + getCurrency() + " " + getUser().getCity().toString() + "}";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
