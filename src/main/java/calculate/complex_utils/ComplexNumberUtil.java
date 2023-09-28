package calculate.complex_utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Stack;

/**
 * Класс для преобразования строки в обьект типа ComplexNumber и обратно
 * Не следует забывть что в данном классе из комплексного числа удаляется i
 * а также на текущий момент никак не разделяются мнимая и реальная части  комплексного числа.
 */
public  class ComplexNumberUtil {
    private static final Logger LOGGER = LogManager.getLogger(ComplexNumberUtil.class);
    private static ComplexNumber number;


    /**
     * Страшный метод. Пока незнаю как сделать его безопасней. Пока так...
     * Разбирает строку, отбрасывает i  и преобразует в обьект ComplexNumber
     * @param reverse
     */
    public static ComplexNumber reverse(String reverse) {
        LOGGER.info("Вызван метод reverse");
        reverse = reverse.replace("i", "");
        String[] tokens = reverse.split(" ");
        Stack<Integer> stack = new Stack<>();
        String operation = null;
        int imangenary = 0;
        int real = 0;

        for (String token : tokens) {
            if (token.matches("[0-9]+")) {
                stack.push(Integer.parseInt(token));
            }
            if (token.matches("\\p{Punct}")) {
                operation = token;

            }

        }

        String s = operation + stack.pop();
        imangenary = Integer.parseInt(s);
        real = stack.pop();

        number = new ComplexNumber(real,imangenary);
        return number;
    }

    public  static String back(ComplexNumber number){
        LOGGER.info("Вызван метод back");
        String answer = number.getReal()+" + "+number.getImangenary() + "i";
        return answer;
    }

}

