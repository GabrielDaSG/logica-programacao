package Atividade03;

import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        //Ativar Scanner.
        Scanner ler = new Scanner(System.in);

        //Mensagem qie irá aparecer para o usuário.
        System.out.println ("Digiteum numero:");
        int n1 = ler.nextInt();
        String msg = ler.nextLine();

        //Adição.
        for (int i = 1; i <= 10; i = i + n1) {
            System.out.println(i);
          }
        //Subtração
        for (int i = 1; i <= 10; i = i - n1) {
            System.out.println(i);
        }
        //Multiplicação.
        for (int i = 1; i <= 10; i = i * n1) {
            System.out.println(i);
    }
        //Divisão
        for (int i = 1; i <= 10; i = i / n1) {
        System.out.println(i);
    }
}
} 
