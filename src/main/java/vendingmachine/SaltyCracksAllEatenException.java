package vendingmachine;

public class SaltyCracksAllEatenException extends ProductNotFoundException {
    SaltyCracksAllEatenException(String error) {
        super(error);
    }
}
