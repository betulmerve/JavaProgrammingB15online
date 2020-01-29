package day48;

//a class can implement more than one interface
public class Kangaroo implements Bouncible,BoxerWithBellyPouch {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    // this is the method we have override from Bouncible interface
    @Override
    public void bounce() {
        System.out.println("This "+ name+ " can jump "+ jumpDistance+
                " meters forward and it would be nice to have "+ GRAVITY+ " gravity");
    }

    // these two methods , we are overriding from BoxerWIthBellyPouch
    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name "+ name+ " is boxing");

    }

    @Override
    public void carryChildInThePocket() {

        System.out.println("Kangaroo with name "+name+ " is carrying child in the pocket");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    public void eat() {
        System.out.println("Kangaroo is eating");
    }


}
