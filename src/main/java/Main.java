import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // pobierz imiona graczy
        Scanner scanner = new Scanner(System.in);

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
        boolean winnerPresent = false;
//        while (!winnerPresent) {
            showBoard(board);
            playerPlay(player1, board);

            if(hasWinner(board)) {
//                break;
            }

            showBoard(board);
            playerPlay(player2, board);
            winnerPresent = hasWinner(board);
//        }
    }

    private static boolean hasWinner(Board board) {
        System.out.println("Sprawdzam czy mamy zwyciezce");
        return false;
    }

    private static void playerPlay(Player player, Board board) {
        System.out.println("A teraz ruch wykonuje " + player.imie);
    }

    private static void showBoard(Board board) {
        board.show();
        System.out.println("A oto plansza...");
    }
}
