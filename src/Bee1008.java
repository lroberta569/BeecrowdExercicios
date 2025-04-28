import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionario = sc.nextInt();
        double horas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();

    }
}
