public class Judge {
    static boolean hasWinner(Board board, String symbol) {
        return maZwyciezcePoziomego(board, symbol)
                || maZwyciezcePionowego(board, symbol)
                || maZwyciezceZLewejNaPrawo(board, symbol)
                || maZwyciezceZPrawejNaLewo(board, symbol);
    }

    private static boolean maZwyciezceZPrawejNaLewo(Board board, String symbol) {
        return false;
    }

    private static boolean maZwyciezcePionowego(Board board, String symbol) {
        return false;
    }

    private static boolean maZwyciezceZLewejNaPrawo(Board board, String symbol) {
        return false;
    }

    private static boolean maZwyciezcePoziomego(Board board, String symbol) {
        for(int i = 0; i < board.size; i++) {
            int numberOfSymbol = 0;
            for(int j = 0; j < board.size; j++) {
                if (board.get(new Position(i, j)).equals(symbol)) {
                    numberOfSymbol++;
                } else {
                    numberOfSymbol = 0;
                }

                if (numberOfSymbol == 3) {
                    System.out.println("Mamy zwyciezce!");
                    return true;
                }
            }
        }

        return false;
    }
}
