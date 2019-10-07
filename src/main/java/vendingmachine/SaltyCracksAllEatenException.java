package vendingmachine;

public class SaltyCracksAllEatenException extends ProductNotFoundException {
    SaltyCracksAllEatenException(){
        System.out.println("Satly snacks need to get filled");
    }
}
