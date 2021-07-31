package VisitorPattern;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car(621340);
        Chair chair = new Chair(12);
        Apple apple = new Apple(12);


        GamarekVisitor gamarekVisitor = new GamarekVisitor();
        Mabe3atVisitor mabe3atVisitor = new Mabe3atVisitor();

        System.out.println(apple.getPrice());
        apple.accept(gamarekVisitor);
        System.out.println(apple.getPrice());
        apple.accept(mabe3atVisitor);
        System.out.println(apple.getPrice());
        System.out.println("----------------");
        System.out.println(chair.getPrice());
        chair.accept(gamarekVisitor);
        System.out.println(chair.getPrice());
        chair.accept(mabe3atVisitor);
        System.out.println(chair.getPrice());
    }
}
