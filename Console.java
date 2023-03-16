import java.util.Scanner;
public class Console{
    public static void main(String[] args) {
        System.out.printf("bom");
        System.out.printf("dia");
        
        System.out.println("bom");
        System.out.println("dia");
        System.out.printf(" Megasena %d %d %d %d %d %d", 1,2,3,4,5,6);
        System.out.printf("Salario: %1f", 1235.5678);
        System.out.printf("Nome: %s%n", "Jão");

        Scanner dd = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = dd.nextLine().toUpperCase();;

        System.out.println("digite seu Sobrenome:");
        String sobrenome = dd.nextLine().toUpperCase();

        System.out.println("digite idade: ");
        int idade = dd.nextInt();

        System.out.printf("O aluno %s %S da idade de %d esta matriculado nesta instituição.", nome, sobrenome, idade);
        dd.close();
    }
}