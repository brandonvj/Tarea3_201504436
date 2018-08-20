
package ipc1.tarea3_201504436;
//Se importan las librerias.
import java.util.Scanner;

public class IPC1Tarea3_201504436 { 
    public static Scanner scan = new Scanner(System.in); //Se crea el lector de los datos a introducir. 
    public static String nombres[] = new String[5]; //Se crea el vector "nombres" de tamaño 5 y de tipo String debido a que son nombres para el Inciso no. 1
    public static int number = 0; //Se crea un int para el inciso No 2.
     public static int nums[] = new int[3]; //Se crea el vector "nums" de tamaño 3 y de tipo int debido a que son valores enteros, para el Inciso no. 3
    public static int promedio[][]=new int[6][6]; //Se crea la matriz "promedio" de 6x6, de tipo int debido a que son valores enteros, para el Inciso no. 4
    
    
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
    
     public static int ContadordeDigitosRepetidos(String numero,String comparador){
         int repetido=0;
         if(numero.equals("0")){
             System.out.println("Debe ingresar un numero primero");
         }else{
             for(int a=0;a<numero.length();a++){
                 if(comparador.equals(Character.toString(numero.charAt(a)))){
                 repetido++;
                 }else{
                     
                 }
             }
         }
         return repetido;
     }
     
     public static void IngresarNumeros(){
        for(int x=0; x<3; ++x){ //Se crea un ciclo for que repetir el proceso cuando se pida.
            System.out.println("Ingrese el numero No. "+(x+1)+": "); //Nos pide en pantalla que ingresemos el No. secuencialmente.
            nums[x]= scan.nextInt(); //Aqui se guardan los numeros ingresados.
        }
    }
    
    public static void OrdenarNumeros(){
        int aux; //Se crea la variable "aux" que sera de tipo Int.
        for(int w=0; w<3; ++w){ //Se crea un ciclo for para repetir el proceso cuando se deba.
            aux=nums[w]; //Se dice que la variable aux sera igual al vector "nums".
            for(int z=w+1; z<3; ++z){ //Se crea un for anidado.
                if(nums[z]>nums[w]){
                    nums[w]=nums[z];
                    nums[z]=aux;
                    aux=nums[w];
                } //Se genera la condicion con un if que nos dice que si nums[z] es mayor a nums[w]
            }
        }
        System.out.println("Los numeros ordenados son: "); //Se mostrara en pantalla los numeros ordenados.
        for(int w=0; w<3; ++w){ 
            System.out.println(nums[w]);
        }
    }
    
    public static void Promedio(){
        for(int fila=0; fila<6; fila++){ //Se crea un ciclo for para que se pueda mover entre las columnas de la matriz.
            
            System.out.println(" "); 
            System.out.println("Ingrese id"); //Nos muestra en pantalla que ingresemos un id.
            promedio[fila][0]=scan.nextInt(); //Se ira guardando los valores del id en la 1ra columna de la matriz promedio.
            for(int columnas=1; columnas<5; columnas++){ //Se crea un for anidado para que se pueda mover entre las columnas de la matriz.
                System.out.println("Ingrese nota"); //Nos pide en pantalla que ingresemos las notas.
                promedio[fila][columnas]=scan.nextInt(); //Nos guarda los valores en las columas que iran desde la 2da hasta la 4ta de la matriz promedio.
            }
        }
        
        int suma1=0,suma2=0,suma3=0,suma4=0,suma5=0,suma6=0; //Se declaran las variables de suma.
        int prom1,prom2,prom3,prom4,prom5,prom6;    //Se declaran las variables de promedio.  
        for(int x=1; x<5; x++){ //Se crea un ciclo for para el proceso.
            suma1+=promedio[0][x]; //Se realiza la suma de las notas que se ingresan en cada id y asi secuencialmente.
            suma2+=promedio[1][x];
            suma3+=promedio[2][x];
            suma4+=promedio[3][x];
            suma5+=promedio[4][x];
            suma6+=promedio[5][x];
        }
        prom1=suma1/4; //Se realiza el promedio de la suma obtenida con todas las notas ingresadas.
        prom2=suma2/4;
        prom3=suma3/4;
        prom4=suma4/4;
        prom5=suma5/4;
        prom6=suma6/4;
        
        promedio[0][5]=prom1; //Nos muestra el resultado en los espacios establecidos en la matriz promedio.
        promedio[1][5]=prom2;
        promedio[2][5]=prom3;
        promedio[3][5]=prom4;
        promedio[4][5]=prom5;
        promedio[5][5]=prom6;
        
        for(int i=0; i<6; i++){ //Se crea otro ciclo for para denominar las posiciones en donde iran los valores ingresados.
            System.out.println(" "); //Se imprime un salto de linea.
            for(int j=0; j<6; j++){ //Se genera un for anidado para poder moverse entre filas y columnas.
                System.out.print(promedio[i][j]+"\t"); //Nos muestra en pantalla los valores obtenidos en las posiciones que se denominaron. El comentario "t" nos sirve para tabular. 
             }
        }
        System.out.println("\n"); //Genera un salto de linea.
        
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
                                + "2. Numero a buscar \n"
                                + "4. Menu Principal \n");
                        opcion3=scan.nextInt();
                     switch(opcion3){
                         case 1:
                              boolean error = true;
                                 while(error){
                                     try {
                                         System.out.print("Ingrese el numero: ");
                                        number = scan.nextInt();
                                        error = false;
                                     } catch (Exception e) {
                                         System.out.println("Ha ingresado una cadena alfanumerica, por favor solo numeros enteros");
                                         System.out.print("Por favor ingrese un nuevo numero: ");
                                     }
                                }
                             
                             System.out.println("Su numero se ha registrado correctamente");
                             break;
                         case 2:
                             boolean err=true;
                             String c="";
                             while(err){
                                System.out.print("Ingrese el numero que desea buscar: ");
                                c = Integer.toString(scan.nextInt());
                                if(c.length()>1){
                                    System.out.println("Usted ha ingresado mas de un numero (Solo numeros entre 0 y 9)");
                                    
                                }else{
                                    err=false;
                                } 
                             }
                             System.out.println("El numero ingresado se ha encontrado repetido: "+ContadordeDigitosRepetidos(Integer.toString(number),c)+" veces\n En la cadena: "+number);
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
    
    
    
