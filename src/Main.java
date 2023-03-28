import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final String TEXT = "Lorem ipsum dolor sit amet, consectetur\n" +
            " adipiscing elit, sed do eiusmod tempor incididunt ut labore\n" +
            " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud \n" +
            "exercitation ullamco laboris nisi ut aliquip ex ea commodo \n" +
            "consequat. Duis aute irure dolor in reprehenderit in voluptate\n" +
            " velit esse cillum dolore eu fugiat nulla pariatur. Excepteur \n" +
            "sint occaecat cupidatat non proident, sunt in culpa qui officia\n" +
            " deserunt mollit anim id est laborum.";


    public static void main(String[] args) {
        char[] symbols = TEXT.toLowerCase().toCharArray();
        Map<Character, Integer> element = new HashMap<>();

        for (int i = 0; i < symbols.length; i++) {
            if (Character.isLetter(symbols[i])) {
                Integer count = element.get(symbols[i]);
                if (count == null) {
                    element.put(symbols[i], 1);
                } else {
                    element.put(symbols[i], ++count);
                }
            }
        }
        System.out.println("Количество каждого символа в тексте : " + element);
        int maxValue = Integer.MIN_VALUE;
        for (int value : element.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Сколько раз используется самый часто встречающийся элемент в тексте: " + maxValue);
        int minValue = Integer.MAX_VALUE;
        for (int value : element.values()) {
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println("Сколько раз используется самый редко встречающийся элемент в тексте: " + minValue);
    }
}
