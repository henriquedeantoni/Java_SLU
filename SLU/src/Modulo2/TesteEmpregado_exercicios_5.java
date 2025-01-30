package Modulo2;
import java.util.Scanner;


public class TesteEmpregado_exercicios_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();

        System.out.print("Digite o primeiro nome: ");
        String primeiroNome1 = scanner.nextLine();
        empregado1.setPrimeiroNome(primeiroNome1);

        System.out.print("Digite o sobrenome: ");
        String sobrenome1 = scanner.nextLine();
        empregado1.setSobrenome(sobrenome1);

        System.out.print("Qual o salário mensal: ");
        double salarioMensal1 = scanner.nextDouble();
        empregado1.setSalarioMensal(salarioMensal1);

        
        scanner.nextLine();

        
        System.out.println("\nInforme os dados do segundo empregado:");

        System.out.print("Digite o primeiro nome: ");
        String primeiroNome2 = scanner.nextLine();
        empregado2.setPrimeiroNome(primeiroNome2);

        System.out.print("Digite o sobrenome: ");
        String sobrenome2 = scanner.nextLine();
        empregado2.setSobrenome(sobrenome2);

        System.out.print("Qual o salário mensal: ");
        double salarioMensal2 = scanner.nextDouble();
        empregado2.setSalarioMensal(salarioMensal2);

        System.out.printf("%nSalário anual de %s %s: R$ %.2f%n",
        empregado1.getPrimeiroNome(),
        empregado1.getSobrenome(),
        empregado1.calcularSalarioAnual());

        System.out.printf("Salário anual de %s %s: R$ %.2f%n",
        empregado2.getPrimeiroNome(),
        empregado2.getSobrenome(),
        empregado2.calcularSalarioAnual());

        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        
        System.out.printf("%nO salário anual de %s %s após aumento de 10%: R$ %.2f%n",
        empregado1.getPrimeiroNome(),
        empregado1.getSobrenome(),
        empregado1.calcularSalarioAnual());

        System.out.printf("O salário anual de %s %s após aumentode 10%: R$ %.2f%n",
        empregado2.getPrimeiroNome(),
        empregado2.getSobrenome(),
        empregado2.calcularSalarioAnual());

        
        scanner.close();
    }
}
