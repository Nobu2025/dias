import java.util.Scanner;
public class Dias{
    public static void main(String[] args){
        Scanner almacenar = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int numero1 = almacenar.nextInt();
        if(numero1 == 1){
            System.out.println("hoy es lunes");
        }else if(numero1 == 2){
            System.out.println("hoy es martes");

        }else if(numero1 == 3){
            System.out.println("hoy es miercoles");

        }else if(numero1 == 4){
            System.out.println("hoy es jueves");

        }else if(numero1 == 5){
            System.out.println("hoy es viernes");

        }else if(numero1 == 6){
            System.out.println("hoy es sabado");

        }else if(numero1 == 7){
            System.out.println("hoy es domingo");

        }
    }
   
            
            
            
    }
