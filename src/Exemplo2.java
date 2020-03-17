import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor pra X e outro pra Y");

        int x = leitor.nextInt();
        int y = leitor.nextInt();

        // Verificando se X é menor que Y
        if (x < y){
            int numeroPar = 0;
            int numeroImpar = 1;

            while(x <= y){

                if(x%2 == 0){
                    numeroPar += x;
                }else{
                    numeroImpar*= x;
                }

                x++;

            }

        }else{
            System.out.println("Para realizar o calculo é necessario que X seja menor do que Y");
            //impar
        }
        System.out.println(x);
        System.out.println(y);
    }
}
