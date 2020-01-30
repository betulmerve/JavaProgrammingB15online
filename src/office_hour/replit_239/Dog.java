package office_hour.replit_239;

public class Dog extends Animal {

    String breed;
    int humanYears;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHumanYears() {
        return humanYears;
    }

    public void setHumanYears(int humanYears) {
        this.humanYears = humanYears;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + '\n'+
                "Breed: " + getBreed() + '\n' +
                "Age in calendar years: " + getAge() + '\n' +
                "Age in human years: " + getAgeInHumanYears() ;
    }


    @Override
    public int getAgeInHumanYears() {
        if (getAge()<=2) {
            setHumanYears(getAge()*11);
        } else {
            setHumanYears( 22 + ((getAge()-2) * 5) ) ;
        }
        return getHumanYears();
    }

    public boolean equals(Dog d1) {

        if (d1.getName()==name && d1.getAge()==age && d1.getBreed()==breed ) {
            return true;
        } else {
            return false;
        }
    }
}
