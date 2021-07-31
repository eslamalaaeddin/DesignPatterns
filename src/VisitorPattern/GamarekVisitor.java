package VisitorPattern;

public class GamarekVisitor implements Visitor {
    @Override
    public void visit(Car car) {
        car.setPrice(car.getPrice() * 1.8);
    }

    @Override
    public void visit(Chair chair) {
        chair.setPrice(chair.getPrice() * 2.11);
    }

    @Override
    public void visit(Apple apple) {
        apple.setPrice(apple.getPrice() * 1.1);
    }
}
