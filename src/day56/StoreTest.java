package day56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreTest {

    public static void main(String[] args) {
        
        Store s1=new Store();
        System.out.println("s1.name = " + s1.name);
        System.out.println("s1.productList = " + s1.getProductList());

        s1.getProductList().add(new Product("imac",3999));
        System.out.println("s1.productList = " + s1.getProductList());

        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5));

        Store s2=new Store("Denis Store",denisList);
        System.out.println("s2 = " + s2);


        Product p1 = new Product("CheeseCake", 10);
        s2.addProduct(p1);
        System.out.println("s2 = " + s2);

        s2.addProduct("Latte",3);
        System.out.println("s2 = " + s2);

        System.out.println("s2.getProductCount() = " + s2.getProductCount());

        s2.displayProducts();

        System.out.println("s2.checkIfProductExist(p1) = " + s2.checkIfProductExist(p1));

        s2.removeProduct(p1);
        System.out.println("s2.indexOfProduct(p1) = " + s2.indexOfProduct(p1));
        s2.removeProduct(p1);

        System.out.println("s2.sumOfAll() = " + s2.sumOfAll());
        System.out.println("s2.getAveragePrice() = " + s2.getAveragePrice());

        System.out.println("s2.maxPrice() = " + s2.maxPrice());

        System.out.println("s2 = " + s2.getAllProductsMoreThanAveragePrice());


    }
}
