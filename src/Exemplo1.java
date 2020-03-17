public class Exemplo1 {
    public static void main(String[] args) {
        //algoritmo para contar de 1 até 1000

       int contador = 1 ;

       while (contador<= 10){
           System.out.println(contador);
           contador++; //contador+'; contador = contador + 1;
       }
       do {
           System.out.println(contador);
           contador++;
       }while (contador <= 10);
    }
}
