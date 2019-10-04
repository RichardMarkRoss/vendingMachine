package vendingmachine;

public class ChocolatesAllGone extends ProductNotFoundException {
    ChocolatesAllGone(){
        System.out.println("fill chocolates");
    }
    ChocolatesAllGone(String error) {
        super(error);
    }
}
