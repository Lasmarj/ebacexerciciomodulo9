import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um valor numérico
        System.out.print("Por favor, insira um valor numérico: ");

        // Ler o valor inserido pelo usuário como um tipo primitivo int
        int valorPrimitivo = scanner.nextInt();

        // Converter o valor primitivo para um wrapper Integer
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Imprimir o valor convertido
        System.out.println("O valor convertido para wrapper é: " + valorWrapper);

        // Fechar o Scanner
        scanner.close();
    }
}
