package oplogicos;


public class OpLogicos {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui
        int x,y,z;
        x=4;
        y=7;
        z=12;
        boolean r;
        r =(x<y && y==z)?true:false;
        System.out.println(r);
        r =(x<y || y==z)?true:false;
        System.out.println(r);
        r =(x<y ^ y==z)?true:false;
        System.out.println(r);
    }

}
