package TemplateMethodPattern;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brewing tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding mint to tea...");
    }

    @Override
    void hookMilk() {
        System.out.println("Hooking milk to TEA...");
    }
}
