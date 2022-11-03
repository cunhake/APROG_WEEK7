import java.util.Scanner;

public class EssencialY {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2, aux;
        n1 = readPositiveValue();
        n2 = readPositiveValue();

        if(n1 > n2){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        showTablesInRange(n1 , n2);

    }

    public static int readPositiveValue(){
        int n;
        do{
            n = ler.nextInt();
        }while (n <= 0);
        return n;
    }

    public static void showTablesInRange(int limite1, int limite2){
        for(int i = limite1; i <= limite2; i++){
            showTableOfNumber(i);
        }
    }

    public static void showTableOfNumber(int number) {
        System.out.println("Multiplication table of " + number);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
