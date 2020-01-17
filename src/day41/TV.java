package day41;

public class TV {

    String brand;
    boolean isOn;
    int currentChannel;  //peki currentChannel in 2000 girmek isterlerse? bunu nasil engelleriz? access modifier ile

    public void turnOn() {


        if (isOn==false) {
            System.out.println("Turning tv on");
            isOn=true;
        }

    }

    public void turnOff() {


        if (isOn==true) {
            System.out.println("Turning tv off");
            isOn=false;
        }

    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    //we cannot set the channel if the tv is off
    //valid channel is from 0-50
    public void setCurrentChannel(int newChannelNumber) {

        if (newChannelNumber<0 || newChannelNumber>50) {
            System.out.println("Invalid channel, getting out");
            return;  //early exit from method
        }
        if (isOn==true) {
            currentChannel=newChannelNumber;
        } else {
            System.out.println("Turn on the tv first");
        }

    }

    public int moveForward() {
        if (currentChannel==50) {
            return currentChannel=0;
        } else {
            return currentChannel=currentChannel+1;
        }

    }
    public int moveBackward() {
        if (currentChannel==0) {
            return currentChannel=50;
        } else {
            return currentChannel=currentChannel-1;
        }

    }

    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }

    /*
        TV
               attributes :
                brand , isOn , currentChannel
                Stirng , boolean , int   (range from 1-50)
               behaviours :
                turnOn
                turnOff
                getcurrentChannel
                setcurrentChannel (newChannelNumber)
                moveForward
                moveBackward
         */

}
