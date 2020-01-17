package day41;

public class Product {

    // this keyword can be used to refer the current object
    // we are working on
    // we can use it to refer the instance field
    // this.fieldName
    // only can be used inside instance method (and later constructor)

    private String name;
    private double price;


    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name =name;
    }

    public double getPrice() {
        return this.price;
    }

    //price should be more than 0
    public void setPrice(double price) {
        if (price>0) {
            this.price=price;
        }

    }

}
