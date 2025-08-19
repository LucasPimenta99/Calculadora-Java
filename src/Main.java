import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner numero1Scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        double numero1 = numero1Scanner.nextDouble();
        Scanner numero2Scanner = new Scanner(System.in);
        System.out.println("digite o segundo numero:");
        double numero2 = numero1Scanner.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println(" O resultado e: " + resultado);

        //System.out.println(numero1);
        //System.out.println(numero2);
        //
        //System.out.println("digite sua idade");
        //byte idadeCliente = idadeScanner.nextByte();
        //System.out.println(idadeCliente);

    }
}