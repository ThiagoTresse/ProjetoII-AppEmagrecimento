import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação do IMC:");

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if (imc < 39.9) {
            System.out.println("Obesidade Grau 2");
        } else {
            System.out.println("Obesidade Grau 3");
        }

        scanner.close();
    }
}
