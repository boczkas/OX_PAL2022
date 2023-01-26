import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // pobierz imiona graczy


        System.out.println("Podaj imie pierwszego gracza");
        String imie1 = scanner.next();
        System.out.println("Podaj imie drugiego gracza");
        String imie2 = scanner.next();

        Player player1 = new Player(imie1, "O");
        Player player2 = new Player(imie2, "X");

        // pobierz rozmiar planszy
        System.out.println("Podaj rozmiar planszy");
        int rozmiar = scanner.nextInt();
        Board board = new Board(rozmiar);

        // Gra
        game(player1, player2, board);


    }

    private static void game(Player player1, Player player2, Board board) {
        boolean hasWinner = false;
        while (!hasWinner) {
            showBoard(board);
            playerPlay(player1, board);
            hasWinner = hasWinner(board, player1);

            if(hasWinner) {
                break;
            }

            showBoard(board);
            playerPlay(player2, board);
            hasWinner = hasWinner(board, player2);
        }
        System.out.println("Gratulacje!");
    }

    private static boolean hasWinner(Board board, Player player) {
        System.out.println("Sprawdzam czy mamy zwyciezce");
        return Judge.hasWinner(board, player.getSymbol());
    }

    private static void playerPlay(Player player, Board board) {
        System.out.println("A teraz ruch wykonuje " + player.getImie());
        System.out.println("Podaj X");
        int x = scanner.nextInt();

        System.out.println("Podaj Y");
        int y = scanner.nextInt();

        board.add(new Position(x, y), player.getSymbol());

    }

    private static void showBoard(Board board) {
        board.show();
        System.out.println("A oto plansza...");
    }
}
