package vendingmachine;

public class VendingMachine extends ProductNotFoundException {
    private static int softDrink = 0;
    private static int saltySnacks = 0;
    private static int chocolates = 0;

    static void  buy(Product product) throws ProductNotFoundException {
        if(product instanceof Coke){
            if(softDrink <= 0){
                throw new SoftDrinksOutOfStockException();
            }
            softDrink+=-1;
        }else if(product instanceof Snack){
            if(saltySnacks <= 0){
                throw new SaltyCracksAllEatenException();
            }
            saltySnacks+=-1;
        }else if(product instanceof Chocolate){
            if(chocolates <= 0){
                throw new ChocolatesAllGone();
            }
            chocolates+=-1;
        }else{
            System.out.println("product not found");
        }
    }
    private static void addStock(Product product, int newStock){
        if(product instanceof Chocolate){
            chocolates = newStock;
        }else if(product instanceof Coke){
            softDrink = newStock;
        }else if(product instanceof Snack){
            saltySnacks = newStock;
        }else {
            System.out.println("product not part of vending snacks");
        }
    }

    public static void main(String[] args) {

        Coke coke = new Coke();
        Chocolate chocolate = new Chocolate();
        Snack snack = new Snack();
        VendingMachine.addStock(coke, 5);
        try{
            VendingMachine.buy(coke);
//            VendingMachine.buy(chocolate);
            VendingMachine.buy(snack);
            VendingMachine.buy(coke);
//            VendingMachine.buy(chocolate);
            VendingMachine.buy(snack);
            System.out.println(softDrink);
        }catch (ProductNotFoundException e){
            e.printStackTrace();
        }
    }
}
