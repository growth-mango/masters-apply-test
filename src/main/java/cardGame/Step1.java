import java.util.List;
import java.util.Random;

public class Step1 {
    public static void main(String[] args) {
        // 작성예정

    }

    // 3행 6열
    public static int[][] generateNumbers() {
        int[][] grid = new int[3][6];
        int num = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                grid[i][j] = num;
                num++;
            }
        }
    }
}