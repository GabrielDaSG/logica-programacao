package Atividade03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        
        //Ativar o Scanner.
        Scanner ler = new Scanner(System.in);

        //Mensagem que vai aparecer para o usuário.
        System.out.println("Digite um numero:");
        int n1 = ler.nextInt();

        System.out.println("Digite outro numero:");
        int n2= ler.nextInt();
        
        //Condição.
        for (int i = n1; i >= n1 && i < n2; i = i + 1) {
            System.out.println(i);
        }
        
    }
    
}
