package SingletonPattern.singleton;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){}

    public static  Singleton getInstance() {
        if (uniqueInstance == null) {
           synchronized (Singleton.class){
               if (uniqueInstance == null) {
                   uniqueInstance = new Singleton();
               }
           }
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }

    @Override
    public String toString() {
        return "Hello my name is singleton\n Hash code: "+uniqueInstance.hashCode();
    }
}
