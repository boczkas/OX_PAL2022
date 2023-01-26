import java.util.HashMap;
import java.util.Map;

public class Board {
    int size;
    Map<Position, String> positionsWithSymbols = new HashMap<>();

    public Board(int size) {
        this.size = size;
    }

    public void show() {
        for(int i = 0; i < size; i++) {
            String row = "";
            for(int j = 0; j < size; j++) {
                if(positionsWithSymbols.containsKey(new Position(i, j))) {
                    row += " " + positionsWithSymbols.get(new Position(i, j)) + " ";
                    row += "|";
                }
                else {
                    row += "   |";
                }
            }
            System.out.println(row);
        }
    }

    void add(Position position, String symbol) {
        if (positionsWithSymbols.containsKey(position)) {
            System.out.println("Tu juz cos jest! Tracisz ruch");
        } else {
            positionsWithSymbols.put(position, symbol);
        }
    }

    public String get(Position position) {
        if(!positionsWithSymbols.containsKey(position)) {
            return "";
        }
        return positionsWithSymbols.get(position);
    }
}
