package vendingmachine;

public class InvalidProductException extends RuntimeException {
    InvalidProductException(){
        System.out.println("invalid product");
    }
}
