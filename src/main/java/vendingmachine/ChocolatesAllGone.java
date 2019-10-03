package vendingmachine;

public class ChocolatesAllGone extends ProductNotFoundException {
    ChocolatesAllGone(String error) {
        super(error);
    }
}
