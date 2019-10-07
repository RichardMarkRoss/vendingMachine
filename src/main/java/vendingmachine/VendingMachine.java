package vendingmachine;

public class VendingMachine extends ProductNotFoundException {
    private static int softDrink;
    private static int saltySnacks;
    private static int chocolates;

    private static void  buy(Product product) throws ProductNotFoundException {
        if(product instanceof Coke){
            if(softDrink == 0){
                throw new SoftDrinksOutOfStockException();
            }
            --softDrink;
        }else if(product instanceof Snack){
            if(saltySnacks == 0){
                throw new SaltyCracksAllEatenException();
            }
            --saltySnacks;
        }else if(product instanceof Chocolate){
            if(chocolates == 0){
                throw new ChocolatesAllGone();
            }
            --chocolates;
        }else{
            System.out.println("product not found");
        }
    }
    private static void addStock(Product product,int newStock){
        if(product instanceof Chocolate){
            chocolates = newStock;
        }else if(product instanceof Coke){
            softDrink = newStock;
        }else if(product instanceof Snack){
            saltySnacks = newStock;
        }else {
            System.out.println("no stoke found");
        }
    }

    public static void main(String[] args) {

        Coke coke = new Coke();
        Chocolate chocolate = new Chocolate();
        Snack snack = new Snack();

        VendingMachine.addStock(coke,3);
        VendingMachine.addStock(chocolate,6);
        VendingMachine.addStock(snack,7);

        try{
            VendingMachine.buy(snack);
            VendingMachine.buy(snack);
            VendingMachine.buy(snack);
            VendingMachine.buy(snack);

            VendingMachine.buy(coke);
            VendingMachine.buy(coke);
            VendingMachine.buy(coke);
//            VendingMachine.buy(coke);

            VendingMachine.buy(chocolate);
            VendingMachine.buy(chocolate);
            VendingMachine.buy(chocolate);
            VendingMachine.buy(chocolate);
            VendingMachine.buy(chocolate);
//            VendingMachine.buy(chocolate);
//            VendingMachine.buy(chocolate);
//            VendingMachine.buy(chocolate);

            System.out.println(softDrink);
            System.out.println(saltySnacks);
            System.out.println(chocolates);
        }catch (ProductNotFoundException e){
            e.printStackTrace();
        }
    }
}
