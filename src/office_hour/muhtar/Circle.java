package office_hour.muhtar;

public class Circle {
    int radious;

    @Override
    public boolean equals(Object obj) {
        Circle c1= (Circle) obj;
        return this.radious==c1.radious;
    }
}

class Test{
    public static void main(String[] args) {

        Circle c1=new Circle();
        c1.radious=3;
        Circle c2=new Circle();
        c2.radious=5;
        Circle c3=new Circle();
        c3.radious=5;

        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c2.equals(c3) = " + c2.equals(c3));

    }
}


/*
Task2:
	create a class called circle:
			instance variables: radious
			override equals() method:
					returns true if the one circule' radius is same with another circle
	create a class called Test:
			create two objects of circle, one' radious is 3, the other' radius is 5
			verify if those two circles are equal
 */
