package calculator;

import java.util.List;
import java.util.stream.Collectors;

public class Separators {

    private final List<Separator> separators;

    public Separators(List<Separator> separators) {
        this.separators = separators;
    }

    public void add(Separator separator) {
        separators.add(separator);
    }

    public List<String> split(String input) {
        String delimiters = separators.stream()
                .map(separator -> String.valueOf(separator.getSeparator()))
                .collect(Collectors.joining("|"));

        return List.of(input.split(delimiters));
    }
}
