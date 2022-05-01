import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");
        HashMap<Integer,Integer> myMap = new HashMap<>();

        String[] grid1 = new String[] {"...x..","....xx","..x..."};
        String[] grid2 = new String[] {"....x."};

        System.out.println("Grid: "+grid2[0]);
        System.out.println("blocks cleaned: "+CleaningRobotPath.cleaningRobot(grid2));

    }
}
