package TemplateMethodPattern;

public abstract class CaffeineBeverage {
    final public void makeRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Water is boiling...");
    }

    void pourInCup(){
        System.out.println("Pouring into cup...");
    }

    void hookMilk(){
        System.out.println("Hooking milk to beverage...");
    }


}
