import java.util.Scanner;

public class EssencialJ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        System.out.println("triples=" + calcularTriplas(n));
    }

    public static int calcularTriplas(int n){
        int triplas = 0;
        int k = 0;

        for(int i = n-2; i >= n/3; i--){
            for (int j = 1; j <= n/3; j++) {
                k = n - (i+j);
                if(((i+j+k) == n) && k >= 1 && i>=k && k>=j){
                    System.out.println(i + " + " + k +" + " + j);
                    triplas++;
                }
            }
        }

        return triplas;
    }
}
