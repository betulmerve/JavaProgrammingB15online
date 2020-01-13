package day40;

public class SpaceShip {
    String name;
    String currentDirection; // up , down , right, left
    int x; //coordinate
    int y;


    public void setInitialPosition(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void setDirection(String newDirection) {

        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {
            currentDirection = newDirection;
        } else {
            System.out.println("Invalid direction");
            currentDirection = "";
        }

    }


    /**
     * move the spaceship to 1 block according to the current direction
     */
    public void move1Block() {

        switch (currentDirection) {
            case "right":
                x++;
                break;
            case "left":
                x--;
                break;
            case "up":
                y++;
                break;
            case "down":
                y--;
                break;
            default:
                break;
        }

    }

    // right click in your class anywhere
    // select generate
    // select toString -->> Hit enter
    // Delete @override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }


    // add a functionality to move1Block with direction provided in one shot

    public void move1Block(String newDirection) {

        setDirection(newDirection);
        move1Block();

    }

    public void moveShipMove (String direction, int a) {

        if (direction.equalsIgnoreCase("up")) {
            y = y + a;
        } else if (direction.equalsIgnoreCase("down")) {
            y = y - a;
        } else if (direction.equalsIgnoreCase("right")) {
            x = x + a;
        } else if (direction.equalsIgnoreCase("left")) {
            x = x - a;
        } else {
            System.out.println("invalid direction");
        }
    }
}


