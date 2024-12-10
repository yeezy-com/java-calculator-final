package calculator;

import java.util.List;

public class Numbers {

    private List<Number> numbers;

    public Numbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    public int sum() {
        return numbers.stream()
                .mapToInt(Number::getNum)
                .sum();
    }
}
