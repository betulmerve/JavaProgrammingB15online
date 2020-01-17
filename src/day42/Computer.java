package day42;

public class Computer {

    private String brand;
    private int ram;
    private double price;

    public void runProgram() {
        System.out.println(this.brand+ " is running program with the ram "+ this.ram);
    }

    public void calculate() {
        System.out.println(this.brand+ " is calculating");
    }

    public void setBrand(String brand) {

        this.brand=brand;

    }

    public void setRam(int ram) {
        if (ram>=1 && ram<=128) {
            this.ram=ram;
        }

    }
    public void setPrice(double price) {
        if (price>20) {
            this.price=price;
        }

    }

    public String getBrand() {
        return brand;
    }

    public int getRam(){
        return ram;
    }

    public double getPrice(){
        return price;
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }



       /*
    Computer
	attributes:  make it private
		brand, ram (1-128) , price
	behaviour
		runProgram
			--> print brand is running program with the ram  (size)
		calculate
			-->> print brand is calculating
		add getters and setters to all the fields
		ram can not be less than 1 more than 128
		price can not be less than
		toString method
     */
}
