package VisitorPattern;

public interface Visitor {
    void visit(Car car);
    void visit(Chair chair);
    void visit(Apple apple);
}
