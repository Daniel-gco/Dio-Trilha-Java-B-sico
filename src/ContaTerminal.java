import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        int numero = scanner.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = scanner.next();

        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu  sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite o valor de seu saldo: ");
        double saldo = scanner.nextDouble();

        String nomeCompleto = nome + " " + sobrenome;
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é" +
                " %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCompleto, agencia, numero, saldo);

        System.out.println(mensagem);
    }
}
