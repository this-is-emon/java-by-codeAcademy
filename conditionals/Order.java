public class Order {
    boolean isFilled;
    double billAmont;
    String shipping;
    String couponCode;

    public Order(boolean filled, double cost, String shippingMethod, String coupon){
        if (cost > 24.0) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmont = cost;
        shipping = shippingMethod;
        couponCode = coupon;
    }

    public void ship(){
        if (isFilled) {
            System.out.println("Shipping: ");
            System.out.println("Shipping cost: " + calculateShipping());
        }else{
            System.out.println("Order not ready.");
        }
    }

    public double calculateShipping(){
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
        
            default:
                shippingCost = .50;
                break;
        }
        return shippingCost;
    }

    public static void main(String[] args){
        Order book = new Order(true,9.99,"Express","Ship50");
        Order chemistrySet = new Order(false,72.50,"Regular","freeShipping");

        book.ship();
        System.out.println("------------------------------");
        chemistrySet.ship();
    }
}
