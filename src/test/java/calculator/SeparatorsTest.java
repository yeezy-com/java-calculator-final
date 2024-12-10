package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SeparatorsTest {

    @Test
    @DisplayName("기본 구분자 테스트")
    void basicSplitTest() {
        String input = "1,2:3";

        List<Separator> separatorList = new ArrayList<>();
        separatorList.add(new Separator(':'));
        separatorList.add(new Separator(','));
        Separators separators = new Separators(separatorList);

        List<String> split = separators.split(input);

        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        org.assertj.core.api.Assertions.assertThat(expected)
                .isEqualTo(split);
    }

}