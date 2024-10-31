package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrincipalExercicio3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> listaNomes = new ArrayList<String>();
        System.out.print("Digite a quantidade de nomes: ");
        int qtd = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            String nome = teclado.nextLine();
            listaNomes.add(nome);
        }
        
        System.out.println("\nOrdem normal: ");
        System.out.println(listaNomes);
        
        Collections.reverse(listaNomes);
        
        System.out.println("\nOrdem reversa: ");
        System.out.println(listaNomes);
        
        teclado.close();
    }
}
