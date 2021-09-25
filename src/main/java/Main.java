import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.converter.Converter;

import java.util.Locale;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Converter converter = context.getBean("converter",Converter.class);
        System.out.print("Введите количество градусов Цельсия ");
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        System.out.println(converter.getResult(converter.convert(amount)));

    }
}