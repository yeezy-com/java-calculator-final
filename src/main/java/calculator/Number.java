package calculator;

public class Number {

    private int num;

    public Number(String raw) {
        validate(raw);
        num = Integer.parseInt(raw);
    }

    private void validate(String raw) {
        int n;
        try {
            n = Integer.parseInt(raw);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }

        if (n < 1) {
            throw new IllegalArgumentException();
        }
    }

    public int getNum() {
        return num;
    }
}
