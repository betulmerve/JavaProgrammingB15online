package day56;

import java.util.List;

public class Store {

    List<Product> productList;

    public Store() {
        this.productList=null;
    }

    public Store(List<Product> productList) {
        this();
        this.productList.addAll(productList);
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
