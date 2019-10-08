package vendingmachine;

public class MaxiVendingMachine extends VendingMachine {

    public void buy(Snack snack) throws SaltyCracksAllEatenException {
        --saltySnacks;
        if (saltySnacks == 0) {
            throw new SaltyCracksAllEatenException();
        }
    }
    public void buy(Coke coke) throws SoftDrinksOutOfStockException {
        --softDrink;
        if (softDrink == 0) {
            throw new SoftDrinksOutOfStockException();
        }
    }
     void buy(Chocolate chocolate) throws ChocolatesAllGone{
        --chocolates;
        if (chocolates == 0) {
            throw new ChocolatesAllGone();
        }
    }
    @Override
    void buy(Product product) throws InvalidProductException{
    }
    public void addStock(Coke coke, int newStock ){
        softDrink = newStock;
    }
    public void addStock(Snack snack, int newStock ){
        saltySnacks = newStock;
    }
    public void addStock(Chocolate chocolate, int newStock ){
        chocolates = newStock;
    }
    @Override
    void addStock(Product product, int newStock ) throws InvalidProductException{

    }

    public static void main(String[] args) {
        Coke coke = new Coke();
        Chocolate chocolate = new Chocolate();
        Snack snack = new Snack();
        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();
        maxiVendingMachine.addStock(coke,3);
        maxiVendingMachine.addStock(chocolate,6);
        maxiVendingMachine.addStock(snack,7);
        try{
            maxiVendingMachine.buy(chocolate);
            maxiVendingMachine.buy(chocolate);
            maxiVendingMachine.buy(coke);
            maxiVendingMachine.buy(snack);

        }catch (ChocolatesAllGone | SaltyCracksAllEatenException | SoftDrinksOutOfStockException | InvalidProductException e){
            e.printStackTrace();
        }
    }

}
