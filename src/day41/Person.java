package day41;

public class Person {

    //private make it only accessible within the same class
    private String name;
    private int age;
    private long ssn;

    //what i want to only get the name
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSsn(){
        return ssn;
    }

    //what i want to only change the name

    public void setName(String newName){
        name=newName;

    }

    public void setAge(int newAge) {
        age=newAge;
    }

    public void setSsn(long newSsn){
        ssn=newSsn;

    }



    //write a method to give value to the field

    public void setAll(String newName, int newAge, long newSsn) {

        //YOU CAN PUT WHATEVER CHECK HERE TO MAKE SURE
        //THE DATA IS CORRECT OR ANY OTHER LOGIC
        name=newName;
        age=newAge;
        ssn=newSsn;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
