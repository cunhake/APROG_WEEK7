import java.util.Scanner;

public class EssencialK {
    public static void main(String[] args) {
        int nums;
        int pontuacao;
        Scanner ler = new Scanner(System.in);

        nums = ler.nextInt();
        pontuacao = contarPontos(nums);
        System.out.println("points=" + pontuacao);
    }

    public static int contarPontos(int nums){
        int dig, digAnterior = 0, points = 0, numsInverso = 0, expoente = 0, numsBackup = nums;

        do{
            dig = nums % 10;
            nums = nums / 10;
            expoente++;
        }while (nums != 0);

        nums = numsBackup;

        do{
            dig = nums % 10;
            numsInverso = numsInverso + (int)(dig * Math.pow(10, expoente));
            expoente--;
            nums = nums / 10;
        }while (nums != 0);

        do{
            dig = numsInverso % 10;
            if(dig != digAnterior){
                points += dig;
            } else{
                if(points > 0){
                    points = - points;
                }
                points = points - dig;
            }
            digAnterior = dig;
            numsInverso = numsInverso / 10;
        } while ( numsInverso != 0);

        return points;

    }

}
