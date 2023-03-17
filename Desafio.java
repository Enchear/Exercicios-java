import java.util.Scanner;
public class Desafio{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.println("digite seu antepenultimo salario");
        String valor1 = dd.nextLine().replace(",", ".");
        System.out.println("digite seu penultino salario");
        String valor2 =dd.nextLine().replace(",", ".");
        System.out.println("digite seu ultimo salario");
        String valor3 =dd.nextLine().replace(",", ".");

        dd.close();
             double salario1 = Double.parseDouble(valor1);
             double salario2 = Double.parseDouble(valor2);
             double salario3 = Double.parseDouble(valor3);
             double soma = (salario1+ salario2 + salario3);
             double media= soma/3;

            System.out.println("A media entre os salarios e de: " + media);
    }
}