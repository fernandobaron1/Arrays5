
package arrays5;

import java.util.Random;
import java.util.Scanner;


public class Arrays5 {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Quantas pessoas irão participar?");
        int numeroPessoas = leia.nextInt();
        
        String [] nomes = new String[numeroPessoas];
        
        //Preenche o array
        for (int i = 0; i < nomes.length; i++) {
        System.out.println ("Informe o nome do participante "+(i+1)+":");
        nomes[i] = leia.next();
        }
        
        //Sorteio um nome com base no índice do array.
        Random r = new Random();
        int idx = r.nextInt(nomes.length);
        System.out.println ("Ganhador(a):");
        System.out.println (nomes [idx]);
    }
    
}
