package TemplateMethodPattern;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brewing coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Camel eyes to coffee...");
    }




}
