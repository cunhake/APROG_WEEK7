import java.util.Scanner;

public class EssencialL {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;

        frase = ler.nextLine();

        System.out.println(contaPalavras(frase));
    }

    public static int contaPalavras(String frase){
        boolean flag = false;
        int nPalavras = 0;

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) != ' '){
                if(!flag){
                    nPalavras++;
                    flag = true;
                }
            }else{
                flag = false;
            }
        }

        return nPalavras;
    }
}
