package vendingmachine;

public class VendingMachine extends ProductNotFoundException {
    static int softDrink = 0;
    static int saltySnacks = 0;
    static int chocolates = 0;

    VendingMachine(){
        super("out of stock");
    }

    static void  buy(Product product) {
        if(product instanceof Coke){
            softDrink+=-1;
        }else if(product instanceof Snack){
            saltySnacks+=-1;
        }else if(product instanceof Chocolate){
            chocolates+=-1;
        }else{
            System.out.println("product not found");
        }
    }
    private void addStock(Product product, int newStock){
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
        VendingMachine vendingMachine = new VendingMachine();
        Coke coke = new Coke();
        vendingMachine.addStock(coke, 5);
        try{
            VendingMachine.buy(coke);
            VendingMachine.buy(coke);
            VendingMachine.buy(coke);
            VendingMachine.buy(coke);
            System.out.println(softDrink);
        }catch (Exception e){
            System.out.println("out nof stock");
        }
    }
}
