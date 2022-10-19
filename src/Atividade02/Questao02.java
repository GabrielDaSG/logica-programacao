package atividade02;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = ler.nextInt();
        
        System.out.println( "Digite o segundo número:");
        int n2 = ler.nextInt();
        
        System.out.println("x: Digite o terceiro número:");
        int n3 = ler.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + "maior");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + "maior");
        } else (n3 > n2 && n3 > n1) {
            System.out.println(n3 + "maior");
        }
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1 + "menor");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2 + "menor");
        } else (n3 < n2 && n3 < n1) {
            System.out.println(n3 + "menor");
        }

        ler.close();
    }
}