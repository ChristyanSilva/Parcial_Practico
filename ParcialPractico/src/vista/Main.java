package vista;

import java.util.Scanner;
import modelo.*;


public class Main {
    public static void main(String[] args) {
        int eleccion = 0;
        Scanner entrada = new Scanner(System.in); 

        while(eleccion<7){
            switch (eleccion) {
                case 0:
                    System.out.println("MENU"+
                    "\n1. Crear banco"+
                    "\n2. Crear sedes bancarias"+
                    "\n3. Consultar sedes bancarias"+
                    "\n4. Consultar cuenta"+
                    "\n5. Salir");
                    System.out.println("Digite un numero a continuacion");
                    eleccion=entrada.nextInt();
                    break;                    
                case 1:
                    Banco banco = new Banco(""); //se digita el nombre del banco 
                    System.out.println("El banco se ha creado exitosamente...");
                    banco.mostrarSedes() ;
                    eleccion=6;
                    break;                    
                case 2:
                    Sede sede =new Sede() ;
                    System.out.println("La sede se ha creado con exito...");
                    eleccion=6;
                    break;
                case 3:
                    
                    eleccion=6;
                    break;
                case 4:
                    eleccion=6;
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Presione la tecla 0 y luego enter para volver al menu principal");
                    eleccion=entrada.nextInt();
                    break;
                
                default:
                    System.out.println("El numero seleccionado es invalido");
                    break;
                    
            }
            
 
        }
          
    }

}
