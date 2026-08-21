
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int i=0;
        String star = "*";
        while (i<array.length){
            int in=0;
            for (in=0; in<array[i]; in++){
                System.out.print(star);
            }
            System.out.println("");
            i++;
        }
    }

}
