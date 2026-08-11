package funcao01;


public class Funcao01 {
 
    /*
    static  void soma (int a, int b) {
        int  s = a + b;
        System.out.println("A soma é " + s);
    }*/
    
      static  int soma (int a, int b) {
        int  s = a + b;
        return s;
    }

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
       int sm = soma (5,2);
        System.out.println("A soma é " + sm);  
    }

}
