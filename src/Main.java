import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario= new Inventario();
        private static ArrayList<Producto> lista = inventario.getListaProductos();
        int opcion;

        do {
            mostrarMenu();
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        agregarProducto();
                        break;
                    case 2:
                        //resarProfesor();
                        break;
                    case 3:
                        //eliminarAlumno();
                        break;
                    case 4:
                        //eliminarProfesor();
                        break;
                    case 5:
                        //desplegarTodo();
                        break;
                    case 6:
                        System.out.println("\n Saliendo de la aplicacion");
                        break;
                    default:
                        System.out.println("\n Opción no válida. Inténtelo de nuevo.");
                }
            } else {
                System.out.println("\n Entrada no válida. Por favor, ingrese un número.");
                sc.nextLine();
                opcion = 0;
            }

            if (opcion != 6) {
                System.out.println("\n-------------------------------------------");
            }

        } while (opcion != 6);

        sc.close();
    }


    public static void mostrarMenu(){
        System.out.println("\n===========================================");
        System.out.println("          SISTEMA DE INVENTARIO");
        System.out.println("===========================================");
        System.out.println("1.  Ingresar Nuevo Producto Perecedero");
        System.out.println("2.  Ingresar Nuevo Producto");
        System.out.println("3.  Eliminar Alumno Producto");
        System.out.println("5.  Desplegar todos los productos");
        System.out.println("6.  Salir");
        System.out.print(">>> Ingrese su opción: ");

    }


    public static void agregarProducto(){


    }

    public static void eliminarProducto(){}

    public static void desplegarTodosProductos(){
        inventario.getListaProductos();

    }


        }

