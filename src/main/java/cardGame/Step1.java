import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Step1 {
    public static void main(String[] args) {
        // 작성예정

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


}