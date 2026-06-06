public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("John", 18, 'M', 500);
        Player player2 = new Player("Helga", 25, 'F', 320);

        Bot bot1 = new Bot("Bob", 100, 1);
        Bot bot2 = new Bot("Rembo", 900, 5);

        System.out.println(player1);
        System.out.println(player2);

        System.out.println(bot1);
        System.out.println(bot2);
    }
}
