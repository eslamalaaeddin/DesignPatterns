package MediatorPattern;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public String getName() {
        return name;
    }

    public User(ChatRoom chatRoom, String name) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }



}