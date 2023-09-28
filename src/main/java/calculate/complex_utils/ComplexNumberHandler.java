package calculate.complex_utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComplexNumberHandler {
    private static final Logger LOGGER = LogManager.getLogger(ComplexNumberHandler.class);
    String num1;
    String op;
    String num2;


    public ComplexNumberHandler(String num1, String op, String num2) {
        this.num1 = num1;
        this.op = op;
        this.num2 = num2;
    }

    public String calculate() {
        LOGGER.info("Началось вычисление...");
        ComplexNumber number1 = ComplexNumberUtil.reverse(this.num1);
        ComplexNumber number2 = ComplexNumberUtil.reverse(this.num2);
        Operation operation = Operation.getOperation(this.op);
        String result = ComplexNumberUtil.back(operation.apply(number1, number2));
        LOGGER.info("Вычисление завершено. Результат: "+ result );
        return result;
    }

}
