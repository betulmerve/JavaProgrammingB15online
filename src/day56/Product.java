package day56;

public class Product extends Object {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //bu override oluyor
    //method signature exactly the same
    @Override
    public boolean equals(Object obj) {
        Product otherProduct=(Product) obj;

        return otherProduct.name.equals(this.name)  && otherProduct.price==this.price;

    }

    //bu ise overloading oluyor
    //method name ayni fakat method signature farkli

//    public boolean equals(Product otherProduct) {
//
//        return otherProduct.name.equals(this.name)  && otherProduct.price==this.price;
//
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

