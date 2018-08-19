
package ipc1.tarea3_201504436;
//Se importan las librerias.
import java.util.Scanner;
import java.util.Random;
public class IPC1Tarea3_201504436 { 
    public static Scanner scan = new Scanner(System.in); //Se crea el lector de los datos a introducir. 
    public static String nombres[] = new String[5]; //Se crea el vector "nombres" de tamaño 5 y de tipo String debido a que son nombres para el Inciso no. 1
    
    
    public static void IngresarUsuarios(){ 
        nombres[0]=scan.nextLine(); 
        for(int a=0;a<5;a++){ //Se crea un ciclo for para el proceso.
            System.out.print("Ingrese el usuario No. "+(a+1)+": "); //Nos mostrara que ingresemos un usuario secuencialmente.
            nombres[a]=scan.nextLine(); //Despues de pedir los nombres de los usuarios se guarda en la variable "nombres"
            System.out.println(" "); //Se imprime un salto de linea.
        } 
    }
    
    public static void OrdenarAscendente(){
        System.out.println("Orden de Usuarios Ascendente: "); 
        for(int x=4;x>=0;--x){ //Se crea un ciclo for para ordenar los usuarios Ascendentemente.
            System.out.println(nombres[x]); // Y se muestran los usuarios ordenados.
        }
        
    }
    public static void OrdenarDescendente(){
        System.out.println("Orden de Usuarios Descendente: ");
        for(int x=0;x<5;++x){ //Se crea un ciclo for para ordenar los usuarios Descendentemente.
            System.out.println(nombres[x]); // Y se muestran los usuarios ordenados.
        }
    }

    public static void main(String[] args) {
       int opcion=0; //Se crea la variable "opcion" que sera de tipo entero.
        while(opcion!=5){ //Se crea un ciclo while para poder generar el menu principal.
            System.out.print("1. Usuarios \n"
                    + "2. Contador de Digitos \n"
                    + "3. Tres numeros de mayor a menor \n"
                    + "4. Calcular Promedio\n"
                    + "5. Salir\n"); //Nos muestra en pantalla las opciones del menu.
            opcion=scan.nextInt(); //Nos guarda el valor ingresado.
            switch(opcion){ //Los switch nos sirve para desglosar las opciones del menu y que nos genere los submenus.
                case 1: //En los casos iremos llamando al proceso generado en las clases anteriores con su nombre respectivo.
                    int opcion2=0;
                    while(opcion2!=4){ //Se crea otro while para las opciones que nos genera cada submenu del programa.
                     System.out.print("1. Ingreso de Usuario \n"
                    + "2. Mostrar Usuarios Ascendente \n"
                    + "3. Mostrar Usuarios Descendente \n"
                    + "4. Menu Principal\n");  
                     opcion2=scan.nextInt();
                     switch(opcion2){
                         case 1:
                             IngresarUsuarios();
                             break; //Los break nos sirven para salir de esa opcion.
                         case 2:
                             OrdenarAscendente();
                             break;
                         case 3:
                             OrdenarDescendente();
                             break;
                         case 4:
                             
                             break;
                         default:
                             break;
                     }
                    }
                    break;
                case 2:
                    int opcion3=0;
                    while (opcion3 !=4){
                        System.out.print ("1. Ingresar Numero \n"
                                + "2. Mostrar Numero de Digitos \n"
                                + "4. Menu Principal \n");
                        opcion3=scan.nextInt();
                     switch(opcion3){
                         case 1:
                             IngresarNumero();
                             break;
                         case 2:
                             ContadordeDigitosRepetidos();
                             break;
                         case 4:
                             break;
                        default:
                             break;
                     }
                    }
                    break;
                case 3:
                    int opcion4=0;
                    while(opcion4 !=4){
                        System.out.print ("1. Ingresar Numeros \n"
                                + "2.Mostrar Ordenados \n"
                                + "4. Menu Principal \n");
                      opcion4=scan.nextInt();
                     switch(opcion4){
                         case 1:
                             IngresarNumeros();
                             break;
                         case 2:
                             OrdenarNumeros();
                             break;
                         case 4:
                             break;
                        default:
                             break;  
                     }
                    }
                    break;
                case 4:
                        Promedio();
                    break;
                case 5:
                    break;
                default:
                    break;
            
        }
    }
  }
} 
    
    
    
}
