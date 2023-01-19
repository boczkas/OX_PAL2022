import java.util.HashMap;
import java.util.Map;

public class Board {
    int size;
    Map<Position, String> positionsWithSymbols = new HashMap<>();

    public Board(int size) {
        this.size = size;
        // to bedzie do wywalenia
        positionsWithSymbols.put(new Position(0,1), "X");
        positionsWithSymbols.put(new Position(1,1), "O");
        positionsWithSymbols.put(new Position(2,2), "O");
    }

    public void show() {
        for(int i = 0; i < size; i++) {
            String row = "";
            for(int j = 0; j < size; j++) {
                if(positionsWithSymbols.containsKey(new Position(i, j))) {
                    row += positionsWithSymbols.get(new Position(i, j));
                }
                else {
                    row += " ";
                }
            }
            System.out.println(row);
        }
    }
}
