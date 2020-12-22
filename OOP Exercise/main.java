package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {



        Hamburger myHamburger = new Hamburger("Mats Burger", "chicken", "chicken");
        myHamburger.addCarrot();
        myHamburger.showPrice();

        System.out.println("====================================================");

        HealthyBurger healthyBurger = new HealthyBurger("chicken");
        healthyBurger.addHealthyKetchup();
        healthyBurger.showPrice();

        System.out.println("====================================================");

        DeluxeBurger deluxeBurger = new DeluxeBurger("deluxe burger","rollen", "chicken");
        deluxeBurger.showPrice();
    }
}
