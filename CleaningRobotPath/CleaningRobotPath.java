import java.util.*;

public class CleaningRobotPath{
    
    public static int cleaningRobot(String[] R){
        int count = 1;
        HashMap<int[], Boolean> visited = new HashMap<>();
        int[] currentCoordinates = new int[] {0,0};
        int[] resultContainer = new int[3];
        if (R.length==0) return 0;
        resultContainer = cleanLine(R, currentCoordinates, 1, 0, visited);
        count = count + resultContainer[0];
        return count;
    }

    //arguments: String[] R
    //           int[] starting coordinates
    //           boolean: which direction constant - 0 for x and 1 for y
    //           boolean: which direction move - 0 for right or down
    //                                             1 for left or up
    //           HashMap: which squares have been visited
    public static int[] cleanLine(String[] R, int[] startCoord, int xMove, int yMove, HashMap<int[], Boolean> visited){
        if (R.length==0) return null;
        if (xMove+yMove!=1) return null; //one should be 0 and the other should be 1
        int x = startCoord[0]; int y= startCoord[1];
        int[] output = new int[]{0,x,y};
        char nextBlock= R[y+yMove].charAt(x+xMove);

        
        while(nextBlock!='x'){
            output[0]++;
            x = x+xMove; y = y+yMove;
            nextBlock = R[y+yMove].charAt(x+xMove);
        }

        output[1]=x; output[2]=y;

        return output;
    }

    public static void changeHashMap(HashMap<Integer,Integer> myMap){
        Random rand = new Random();
        myMap.put(rand.nextInt(10), rand.nextInt(10));
    }
}