import java.util.*;

public class Step1 {
    public static void main(String[] args) {
        // 작성예정
        List<Integer> cards = generateNumbers();
        int[][] grid = printGrid(cards);
        System.out.println(Arrays.deepToString(grid));

    }

    // 1부터 8까지 세 번씩 들어간 숫자 리스트 생성
    public static List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            numbers.add(i);
            numbers.add(i);
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    // 3 * 6 형태로 출력하기
    public static int[][] printGrid(List<Integer> numbers) {
        int[][] grid = new int[3][6];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                grid[i][j] = numbers.get(index);
                index++;
            }
        }
        return grid;
    }
//
//    // 3 * 6 형태로 X 배열 출력하기
//    public static void printGridX() {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.println("X ");
//            }
//            System.out.println();
//        }
//    }




}