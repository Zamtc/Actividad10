package Enunciado1;
import java.util.Scanner;

public class AplicaEnunciado1 {
  static Scanner teclado=new Scanner(System.in);
    public static Lista lista=new Lista();
    static Nodo nodo;
    
    public static void main (String args[]){
    MenuNodo();
}

    static void MenuNodo(){
        int opcion; 
        
        do{
            System.out.println("========================");
            System.out.println("\nMenú de Opciones");
            System.out.println("===========================");
            System.out.println("[1] Insertar al Inicio");
            System.out.println("[2] Mostrar los Elementos");
            System.out.println("[3] Eliminar Lista");
            System.out.println("=============================");
            System.out.println("[0] Salir");
            
            System.out.print("\nIngrese una Opción: ");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1 : 
                    ingreso();
                    break;
                case 2 : 
                    lista.listar();
                    break;
                 case 3 : 
                    lista.eliminar();
                    System.out.println("Lista Eliminada con éxito....");
                    break;
                 
                case 0 : 
                    System.out.println("Saliendo del sistema....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese Opción Correcta....");
                    System.out.println("\n");
            }
        } while (opcion!=0);
    }
    static void ingreso(){
        System.out.println("Ingrese un nombre: ");
        String name=teclado.next();
         lista.agregarInicio(name);
    }
}
