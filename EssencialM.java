import java.util.Scanner;

public class EssencialM {

    static int flag = 1;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n, nCopia,nCopia2, dig;
        int uniqueDig = 0, contPositivo = 0, contNegativo = 0, contNum = 0;

        n = ler.nextInt();
        nCopia = n;
        while(n != 0){
            contNum++;
            if(VerificarPositivo(n) == 1){
                contPositivo++;
            }else{
                n = n - (2*n);
                contNegativo++;
            }
            if(dividirNumero(n) == 1){
                System.out.println(nCopia);
                uniqueDig++;
            }
            n = ler.nextInt();
            nCopia = n;
            flag = 1;
        }

        if(contNum>0){
            System.out.printf("negatives: " + "%.2f%%%n", (double)(contNegativo * 100)/contNum);
            System.out.printf("positives: " + "%.2f%%%n", (double)(contPositivo * 100)/contNum);
            System.out.printf("with unique digits: " + "%.2f%%%n", (double)(uniqueDig * 100)/contNum);
        }
    }

    public static int dividirNumero(int n){
        int contDig = 0;
        int nCopia2 = n;
        int dig;

        do{
            contDig++;
            dig = n % 10;
            if(VerificarRepetidos(nCopia2, dig, contDig) == 0){
                flag = 0;
            }
            n = n / 10;
        }while (n != 0);

        return flag;
    }

    public static  int VerificarPositivo(int n){
        int value = 0;
        if(n > 0){
            value = 1;
        }else{
            value = 0;
        }
        return value;
    }

    public static int VerificarRepetidos(int nCopia2, int dig, int contDig){
        int dig2;
        nCopia2 = nCopia2 / (int)Math.pow(10, contDig);
        do{
            dig2 = nCopia2 % 10;
            if(dig == dig2)
            {
                return 0;
            }
            nCopia2 = nCopia2 / 10;
        }while(nCopia2 != 0);
        return 1;
    }
}
