
import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaracion de variables
        int desde = 2;
        int hasta = 1000;
        boolean esPrimo;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese el valor de n primos que quiere sumar: ");
        int nPrimos = sc.nextInt();
        System.out.println("Los numeros primos son: ");

        for (int i = desde; i <= hasta; i++) {
            esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i) && esPrimo; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            
            if (esPrimo) {               
                if (nPrimos != contador) {                  
                    suma += i;
                    System.out.print(i + " - ");   
                    contador++;
                }
            }
            if(nPrimos == contador){
                break;
            }
        }
        
        System.out.println("");
        System.out.println("La suma de los " + nPrimos + " numeros primos es igual a: " + suma);       
    }
}
