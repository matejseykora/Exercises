package academy.learnprogramming;

public class HealthyBurger extends Hamburger {

    private boolean healthyKetchup;
    private boolean healthyMayoneze;

    private final int healthyKetchupPrice = 5;
    private final int healthyMayonezePrice = 4;

    private int price;

    public HealthyBurger(String meat) {
        super("Healthy Burger", "brown rye", meat);
        this.price = super.getBasePrice();
    }

    public void addHealthyKetchup() {
        this.healthyKetchup = true;
        this.price += healthyKetchupPrice;
    }

    public void addhealthyMayoneze() {
        this.healthyMayoneze = true;
        this.price += healthyMayonezePrice;
    }

    @Override
    public void showPrice() {
        System.out.println("Base price = " + super.getBasePrice());

        if (super.isLettuceAdded()){
            System.out.println("lettucePrice = " + super.getLettucePrice());
        }
        if (super.isTomatoAdded()){
            System.out.println("tomatoPrice = " + super.getTomatoPrice());
        }
        if (super.isCarrotAdded()){
            System.out.println("carrotPrice = " + super.getCarrotPrice());
        }
        if (super.isAppleAdded()){
            System.out.println("applePrice = " + super.getApplePrice());
        }
        if (healthyKetchup){
            System.out.println("healthyKetchupPrice = " + this.healthyKetchupPrice);
        }
        if (healthyMayoneze){
            System.out.println("healthyMayonezePrice = " + this.healthyMayonezePrice);
        }

        System.out.println("Total price = " + price);
    }
}
