package TemplateMethodPattern;

public class CoffeeShop {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

//        System.out.println("Making tea....\n");
//        tea.makeRecipe();
//        System.out.println("--------------------");
//        tea.hookMilk();

        System.out.println("Making coffee....\n");
        coffee.makeRecipe();
        System.out.println("--------------------");
        //coffee.hookMilk();

    }
}
