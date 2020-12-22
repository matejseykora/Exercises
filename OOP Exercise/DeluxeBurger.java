package academy.learnprogramming;

public class DeluxeBurger extends Hamburger {

    private boolean chipsAdded;
    private boolean drinkAdded;

    private int chipsAddedPrice = 8;
    private int drinkAddedPrice = 5;

    private int price;

    public DeluxeBurger(String burgerName, String breadRollType, String meat) {
        super(burgerName, breadRollType, meat);
        this.chipsAdded = true;
        this.drinkAdded = true;
    }

    @Override
    public void showPrice() {
        System.out.println("Base price = " + super.getBasePrice());

        System.out.println("chipsAddedPrice = " + this.chipsAddedPrice);
        System.out.println("drinkAddedPrice = " + this.drinkAddedPrice);

        System.out.println((super.getBasePrice() + chipsAddedPrice + drinkAddedPrice));
    }
}
