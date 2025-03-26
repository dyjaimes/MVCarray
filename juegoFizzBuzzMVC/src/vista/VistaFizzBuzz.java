
package vista;

import java.util.Scanner;


public class VistaFizzBuzz {
    Scanner input =new Scanner(System.in);
    
    
    public  int menu(){
        System.out.println("1. numeros divisibles por 3");
        System.out.println("2. numeros divisibles por 5");
        System.out.println("3. numeros divisibles por 3 y 5");
        System.out.println("4. numeros no divisibles por 3 y 5");
        System.out.println("5. salir");
        int retorno=input.nextInt();
        return retorno;
    }
    
    public void mostrarnumeros3(int[] resultado){
        for (int i=0; i<resultado.length;i++){
            System.out.println(resultado[i]+" fiz");
        }
    }
        public void mostrarnumeros5(int[] resultado){
        for (int i=0; i<resultado.length;i++){
            System.out.println(resultado[i]+" biz");
        }
    }
            public void mostrarnumeros3y5(int[] resultado){
        for (int i=0; i<resultado.length;i++){
            System.out.println(resultado[i]+" fizbiz");
        }
    }
                public void mostrarnumerosNo(int[] resultado){
        for (int i=0; i<resultado.length;i++){
            System.out.println(resultado[i]);
        }
    }
}
