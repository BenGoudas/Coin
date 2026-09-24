public class Main {
    public static void main(String[] args){
        Coin penny = new Coin();
        Player player = new Player(100);
        player.flip(penny, "tails", 50);
        System.out.println(player.getBalance());
    }
}