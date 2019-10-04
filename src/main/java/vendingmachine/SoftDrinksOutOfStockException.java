package vendingmachine;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    SoftDrinksOutOfStockException(){
        System.out.println("Fill up drink");
    }
    SoftDrinksOutOfStockException(String error) {
        super(error);
        System.out.println();
    }
}
