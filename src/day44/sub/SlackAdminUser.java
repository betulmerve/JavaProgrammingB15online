package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminId;

    public void sendAtChannelMessage(){

        System.out.println(name+" sending message");
    }
    public void deleteMessage(){
        System.out.println(name+" deleting message");
    }
    public void addChannel(){
        System.out.println(name+" adding channel");
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public SlackAdminUser(String name, String status, int adminId) {
        this.name=name;
        this.status=status;
        this.adminId = adminId;
    }

    public static void main(String[] args) {
        SlackAdminUser user1=new SlackAdminUser("Akbar","Release the horses",101);
        // --- inherited methods we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        // --- our own methods we are calling
        user1.addChannel();
        user1.deleteMessage();
        user1.sendAtChannelMessage();
        System.out.println("user1 = " + user1);





    }
}
