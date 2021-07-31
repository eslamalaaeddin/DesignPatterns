package MediatorPattern;

public class Demo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User robert = new User(chatRoom, "Robert");
        User john = new User(chatRoom,"John");
        User islam = new User(chatRoom,"Islam");
        User fawzy = new User(chatRoom,"Fawzy");
        User ibrahim = new User(chatRoom,"Ibrahim");

        robert.sendMessage("Hi There");
        john.sendMessage("Yoooo");
        islam.sendMessage("مش عاوز صداع يلا انت وهو!!");
        fawzy.sendMessage("بكرة علينا كويز ايه؟!");
        ibrahim.sendMessage("ههههه");


    }
}
