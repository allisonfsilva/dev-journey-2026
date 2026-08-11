package vetor04;

import java.util.Arrays;


public class Vetor04 {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        int vet[] = {3,6,2,1,8,7,9};
        Arrays.sort(vet);
        
        for (int v:vet){
            System.out.print(v +" | ");
        }
        System.out.println("");
        
        int  p = Arrays.binarySearch(vet,6);
        
        System.out.println("Encontrei o valor na posição " + p);
    }

}
