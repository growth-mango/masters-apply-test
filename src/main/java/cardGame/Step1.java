import java.util.*;

public class Step1 {
    public static void main(String[] args) {
        // 작성예정
        List<Integer> cards = generateNumbers();
        int[][] grid = printGrid(cards);
        System.out.println(Arrays.deepToString(grid));
        System.out.println(Arrays.toString(getUserInput(1, 15)));

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

    // 사용자에게 좌표 입력받기
    public static int[][] getUserInput(int attemptNumber, int remainingCards) {
        Scanner scanner = new Scanner(System.in);
        int[][] inputs = new int[2][2];

        System.out.printf("<시도 %d, 남은 카드: %d> 좌표를 입력하세요.\n", attemptNumber, remainingCards);

        for (int i = 0; i < 2; i++) {
            while (true) {
                System.out.print("입력 " + (i + 1) + "? ");
                String input = scanner.nextLine();

                int[] coordinates = validateInput(input);
                if (coordinates != null) {
                    inputs[i] = coordinates;
                    break;
                }
            }
        }
        return inputs;
    }


    // 입력받은 문자열 유효성 검증
    private static int[] validateInput(String input) {
        try {
            input = input.toString().replaceAll("[^0-9,]", ""); // 괄호와 공백 제거
            String[] parts = input.split(",");
            if (parts.length == 2) {
                int row = Integer.parseInt(parts[0]) - 1;
                int col = Integer.parseInt(parts[1]) - 1;

                if (row >= 0 && row < 3 && col >= 0 && col < 6) {
                    return new int[]{row, col}; // 좌표 내에 있는 입력인지
                } else {
                    System.out.println("잘못된 입력입니다. 범위 내의 좌표를 입력하세요.");
                }
            } else {
                System.out.println("잘못된 입력입니다. (행, 열) 형태로 입력해주세요.");
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
        }
        return null;
    }

}
