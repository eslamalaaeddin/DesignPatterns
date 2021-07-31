package VisitorPattern;

public class Mabe3atVisitor implements Visitor{
    @Override
    public void visit(Car car) {
        car.setPrice(car.getPrice() * 3.6);
    }

    @Override
    public void visit(Chair chair) {
        chair.setPrice(chair.getPrice() * 5.8);
    }

    @Override
    public void visit(Apple apple) {
        apple.setPrice(apple.getPrice() * 8.7);
    }
}
