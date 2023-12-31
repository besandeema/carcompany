package car;


import java.util.List;

public class Order {
    static String xchoice="Invalid !!!.. \n  Retry, please:";
    private static boolean placeOrderr;
    private static boolean listOrder;
    private static boolean listCategories;
    public static boolean isPlaceOrder() {
        return placeOrderr;
    }

    public static void setPlaceOrder(boolean placeOrder) {
        Order.placeOrderr = placeOrder;
    }

    public static boolean isListOrder() {
        return listOrder;
    }

    public static void setListOrder(boolean listOrder) {
        Order.listOrder = listOrder;
    }
    public static boolean isListCategories() {
        return listCategories;
    }

    public static void setListCategories(boolean listCategories) {
        Order.listCategories = listCategories;
    }
    private int orderId;
    private List<Product> orderedProducts;
    private double totalPrice;
    public Order(int orderId, List<Product> orderedProducts) {
        this.orderId = orderId;
        this.orderedProducts = orderedProducts;
        this.totalPrice = calculateTotalPrice();
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private double calculateTotalPrice() {

        for (Product product : orderedProducts) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

}