import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número maior que zero: ");
        float valor1 = sc.nextFloat();
        while (valor1 <= 0) {
            System.out.println("Este número é menor que zero. Tente novamente!");
            System.out.println("Digite um número maior que zero:");
            valor1 = sc.nextFloat();
        }

        System.out.println("Digite outro número maior que zero: ");
        float valor2 = sc.nextFloat();
        while (valor2 <= 0) {
            System.out.println("Este número é menor que zero. Tente novamente!");
            System.out.println("Digite um número maior que zero:");
            valor2 = sc.nextFloat();
        }

        System.out.println("Que operação você deseja realizar? \nDigite 1 para soma, 2 para subtração, 3 para divisão e 4 para multiplicação.");
        calcular(sc, valor1, valor2);

    }
    public static void calcular(Scanner sc, float valor1, float valor2){
        int operacao = sc.nextInt();
        switch (operacao){
            case 1:
                float soma = valor1 + valor2;
                System.out.println("O valor da soma é " + new DecimalFormat("#.##").format(soma));
                break;
            case 2:
                float subtracao = valor1 - valor2;
                System.out.println("O valor da subtração é " + new DecimalFormat("#.##").format(subtracao));
                break;
            case 3:
                float divisao = valor1 / valor2;
                System.out.println("O valor da divisão é " + new DecimalFormat("#.##").format(divisao));
                break;
            case 4:
                float multiplicacao = valor1 * valor2;
                System.out.println("O valor da multiplicação é :" + new DecimalFormat("#.##").format(multiplicacao));
                break;
            default:
                System.out.println("Essa opção não é válida. Tente novamente uma opção entre 1 e 4:");
                calcular(sc, valor1, valor2);
        }
    }
}


