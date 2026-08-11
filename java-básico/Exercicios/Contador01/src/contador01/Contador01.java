package contador01;

public class Contador01 {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        /*   int c = 1;
        while (c<=15) {
            System.out.println(c);
            c++;
        }*/

       /*
        int c =0;
        while (c <10) {
            c++;
            if (c==5 || c==7 || c==9) {
                continue;
            }
            System.out.println(c); 
            
        }*/
       
       int c =0;
        while (c <10) {
            c++;
            if (c==5 || c==7 || c==9) {
                continue;
            }
            if (c==8){
                break;
            }
            System.out.println(c);
            
        }
    }

}
