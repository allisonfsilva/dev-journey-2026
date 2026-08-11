package opternario;


public class OpTernario {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        int n1, n2, r,r1,r2;
        
        /* Gera valores aleatórios entre 0 e 99 para n1 e n2
        int n1 = (int) (Math.random() * 100);
        int n2 = (int) (Math.random() * 100);
*/
        n1 = 14;
        n2 = 8;
        r = (n1>n2)?0:1;
        r1 = (n1>n2)?n1+n2:n1-n2;
        r2 = (n1>n2)?n1*n2:n1/n2;
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
    }

}
