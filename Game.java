import java.util.Scanner;
public class Game {
    private Player player;
    private Coin coin;
    public Game() {
        player = new Player(100);
        coin = new Coin(Math.random());
        System.out.println("Your initial balance is 100");
    }

    public void play() {
        Scanner s = new Scanner(System.in);
        System.out.println("How much would you like to risk?");
        int risk = s.nextInt();
        System.out.println("heads/tail");
        String guess = s.next().toLowerCase();
        boolean correct = player.flip(coin, guess, risk);
        int balance = player.getBalance();
        if (correct) {
            System.out.println("Correct! Your new balance is " + balance);
        } else {
            System.out.println("Sorry! Your new balance is " + balance);
        }
        if (balance > 0) {
            play();
        }
        else {
            System.out.println("GAME OVER!");
            s.close();
        }
    }
}