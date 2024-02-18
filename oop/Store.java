public class Store{
    //instace fields
    String productType;
    double price;

    //constructor method
    public Store(String product, double initialPrice){
        productType = product;
        price = initialPrice;
    }

    /* other methods */
    //price increase method
    public void increasedPrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println("Latest Price : " + price);
    }

    //get price with tax method
    public double gitPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + (price*tax);
        return totalPrice;
    }

    //seeing output in string method
    public String toString(){
        String stringObject = "This store sells " + productType + " at a price of " + price + ".";
        return stringObject;
    }

    /* main method */
    public static void main(String[] args){
        Store lemonade = new Store("Lemonade",3.75);
        Store cookieShop = new Store("Cookies", 5.0);
        System.out.println(lemonade);
        System.out.println(cookieShop);
       
    }
}