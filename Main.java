public class Main {
    public static void main(String[] args) {
        Coin penny = new Coin();

        Player BenGoudas = new Player(100);
        BenGoudas.flip(penny, "tails", 50);
        System.out.println(BenGoudas.getBalance());
    }
}