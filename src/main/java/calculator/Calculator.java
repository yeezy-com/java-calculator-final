package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private Numbers numbers;
    private Separators separators;

    public Calculator() {
        List<Separator> sepas = new ArrayList<>();
        sepas.add(new Separator(':'));
        sepas.add(new Separator(','));
        separators = new Separators(sepas);
    }

    public void input(String input) {
        // 커스텀 구분자가 존재하나?
        String custom = input.substring(0, 5);
        if (custom.startsWith("//") && custom.endsWith("\\n")) {
            separators.add(new Separator(custom.charAt(2)));
            input = input.substring(5);
        }

        // 없다면 기본 구분자로 구분!
        List<String> rawSplit = separators.split(input);
        List<Number> nums = new ArrayList<>();
        for (String s : rawSplit) {
            nums.add(new Number(s));
        }
        numbers = new Numbers(nums);
    }

    public int sum() {
        return numbers.sum();
    }
}
