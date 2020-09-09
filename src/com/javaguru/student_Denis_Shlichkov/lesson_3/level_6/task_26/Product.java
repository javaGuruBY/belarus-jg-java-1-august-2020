package lesson_3.level_6.task_26;

class Product {
    private String name;
    private double regularPrice;
    private double discount;

    Product(String name){
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double actualPrice(){
        return (regularPrice - regularPrice * (discount/100));
    }

    void printInformation(){
        System.out.println("Product name: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Price with discount: " + actualPrice());
    }
}
