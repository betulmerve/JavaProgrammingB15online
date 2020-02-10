package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;
    List<Product> productList;

    public Store() {
        this.name="Cybertek Store";
        this.productList=new ArrayList<>();
    }

    public Store(String name, List<Product> otherList) {
        this(); //calling no arg constructor
        this.name=name;
        this.productList.addAll(otherList);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public void removeProduct(Product p) {
        productList.remove(p);
    }

    public void checkIfProductExist(Product p) {
        productList.contains(p);
    }

    public Product maxPrice() {
        Product maxPriceProduct=productList.get(0);
        for (Product each:productList) {
            if (each.getPrice()>maxPriceProduct.getPrice()) {
                maxPriceProduct=each;
            }
        }

        return maxPriceProduct;
    }

    public int sumOfAll() {
        int sum=0;
        for (Product each:productList) {
            sum=sum+each.getPrice();
        }
        return sum;
    }
}
