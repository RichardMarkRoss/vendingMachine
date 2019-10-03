package vendingmachine;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    SoftDrinksOutOfStockException(String error) {
        super(error);
    }
}
