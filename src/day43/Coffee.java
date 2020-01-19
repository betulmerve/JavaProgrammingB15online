package day43;

import day42.Movie;

public class Coffee {

    private String type;
    private int caffeineLevel;
    private double price;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0) {
            this.price=1;
        } else {
            this.price=price;
        }
    }

    public Coffee() {
        System.out.println("No arg constructor");
    }

    public Coffee(String type, int caffeineLevel) {
        this.type=type;
        this.caffeineLevel=caffeineLevel;
        System.out.println("2 args constructor");
    }

    public Coffee(String type, int caffeineLevel, double price) {
        this.type=type;
        this.caffeineLevel=caffeineLevel;

        setPrice(price);

//        if (price<0) {
//            this.price=1;
//        } else {
//            this.price=price;
//        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
