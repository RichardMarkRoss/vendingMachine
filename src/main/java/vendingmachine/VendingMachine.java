package vendingmachine;

public class VendingMachine extends ProductNotFoundException {
    int softDrink;
    int saltySnacks;
    int chocolates;
    void  buy(Product product) throws ProductNotFoundException {
        if(product instanceof Coke){
            --softDrink;
            if(softDrink == 0){
                throw new SoftDrinksOutOfStockException();
            }

        }else if(product instanceof Snack){
            --saltySnacks;
            if(saltySnacks == 0){
                throw new SaltyCracksAllEatenException();
            }

        }else if(product instanceof Chocolate){
            --chocolates;
            if(chocolates == 0){
                throw new ChocolatesAllGone();
            }

        }else{
            System.out.println("product not found");
        }
    }void addStock(Product product,int newStock){
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
            VendingMachine vendingMachine = new VendingMachine();
            vendingMachine.addStock(coke,3);
            vendingMachine.addStock(chocolate,6);
            vendingMachine.addStock(snack,7);

        try{
            vendingMachine.buy(snack);
            vendingMachine.buy(snack);
            vendingMachine.buy(snack);
            vendingMachine.buy(snack);

            vendingMachine.buy(coke);
            vendingMachine.buy(coke);
            vendingMachine.buy(coke);
//            vendingMachine.buy(coke);

            vendingMachine.buy(chocolate);
            vendingMachine.buy(chocolate);
            vendingMachine.buy(chocolate);
            vendingMachine.buy(chocolate);
            vendingMachine.buy(chocolate);
//            vendingMachine.buy(chocolate);
//            vendingMachine.buy(chocolate);
//            vendingMachine.buy(chocolate);

            System.out.println(vendingMachine.softDrink);
            System.out.println(vendingMachine.saltySnacks);
            System.out.println(vendingMachine.chocolates);
        }catch (ProductNotFoundException e){
            e.printStackTrace();
        }
    }
}
