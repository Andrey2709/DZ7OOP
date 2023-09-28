package calculate.api;

import calculate.complex_utils.ComplexNumberHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UIStarter {
    private static final Logger LOGGER = LogManager.getLogger(UIStarter.class);
static ComplexNumberHandler handler;

    public static void started() {
        String num1;
        String op;
        String num2;
       UIUtils.info();
       boolean b = true;
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Start program ");
       while (b){
           System.out.println("Нажмити Enter для продолжения или введите stop для завершения");
           if (scanner.nextLine().equals("stop")){
               b = false;
           }
           System.out.println("Введите первое комплексное  число");
           num1 = scanner.nextLine();
           System.out.println("Введите операцию");
           op = scanner.nextLine();
           System.out.println("Введите второе комплексное  число");
           num2 = scanner.nextLine();
           System.out.println("Результат:");
           handler = new ComplexNumberHandler(num1,op,num2);
           System.out.println(handler.calculate());


       }
    }
}
