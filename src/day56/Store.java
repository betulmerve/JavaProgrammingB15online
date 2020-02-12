package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;
    private List<Product> productList;



    public int getProductCount() {
        return productList.size();
    }

    public Store() {
        this.name="Cybertek Store";
        //boylece list null olamaz birsey eklerken sikinti cikmaz
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
        System.out.println("calling addProduct(Product p)");
        productList.add(p);
    }


    public void addProduct(String productName, int productPrice) {
        Product p=new Product(productName,productPrice);
       // System.out.println("calling addProduct(String productName, int productPrice) ");
        productList.add(p);

       // productList.add(new Product(productName,productPrice));
    }

    public void displayProducts(){
        System.out.println(name+ "'s store has below products: ");
        for (Product each:productList) {

            System.out.println("each = " + each);

        }
    }

    public int indexOfProduct(Product p) {
        return productList.indexOf(p);
    }

    public void removeProduct(Product p) {

        if (this.checkIfProductExist(p)){
            productList.remove(p);
        } else {
            System.out.println("We dont have product " +p);
        }

    }

    public boolean checkIfProductExist(Product p) {
        return productList.contains(p);
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

    public List<Product> getAllProductsMoreThanAveragePrice() {
        List<Product> expensiveList=new ArrayList<>();
        for (Product each:productList) {

            if (each.getPrice()>this.getAveragePrice()) {
                expensiveList.add(each);
            }

        }

        return expensiveList;
    }

    public int sumOfAll() {
        int sum=0;
        for (Product each:productList) {
            sum=sum+each.getPrice();
        }
        return sum;
    }

    public double getAveragePrice() {
        return this.sumOfAll()/this.getProductCount();
    }


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
