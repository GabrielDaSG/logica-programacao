package Atividade03;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        //Ativar o Scanner.
        Scanner ler = new Scanner(System.in);

        //Mensagem que vai aparecer pro usuário.
        System.out.println("Escreva uma mensagem:");
        String msg = ler.nextLine();
        
        System.out.println("Escreva um numero:");
        int n1 = ler.nextInt();
        
        //Condições.
        for (int i = 0; i <=n1; i = i + 1) {
            System.out.println(msg);
    }
}
}
