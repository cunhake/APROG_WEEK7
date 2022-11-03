import java.util.Scanner;

public class EssencialZ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aux;

        int limite1 = ler.nextInt();
        int limite2 = ler.nextInt();

        if(limite2 < limite1){
            aux = limite1;
            limite1 = limite2;
            limite2 = aux;
        }

        System.out.println("("+contarPrimosTempoInteiro(limite1,limite2)+")");
    }

    public static int contarPrimosTempoInteiro(int limite1, int limite2){
        int contPrimostempo = 0;
        for (int i=limite1; i <= limite2; i++){
            if(verificarPrimoTempoInteiro(i)){
                contPrimostempo++;
            }
        }
        return contPrimostempo;
    }

    public static boolean verificarPrimoTempoInteiro(int n){
        int nCopia = n,dig, aux, contDig = 0;

        do{
            n/=10;
            contDig++;
        }while(n!=0);

        n = nCopia;
        aux = n;

        if(verificarPrimo(n)){
            for(int i = 1; i < contDig; i++){
                dig = aux % 10;
                aux = aux/10;
                aux = aux + (int)Math.pow(10, contDig-1)*dig;
                if(!verificarPrimo(aux)){
                    return false;
                }
            }
            System.out.println(nCopia);
        }else{
            return false;
        }
        return true;
    }

    public static boolean verificarPrimo(int n){
        int contDivisores = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                contDivisores++;
            }
            if(contDivisores > 2){
                return false;
            }
        }

        if(contDivisores == 2){
            return true;
        }

        return false;
    }
}
