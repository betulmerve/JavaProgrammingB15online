package day44;

public class SlackUser {

    protected String name;
    protected String status;

    public void sendMessage(){

        System.out.println("Slack user "+name+" typing");
    }
    public void callSomeone(){

        System.out.println("Slack user "+name+" calling");
    }
    public void addEmoji(){

        System.out.println("Slack user "+name+" adding emoji");
    }

}
