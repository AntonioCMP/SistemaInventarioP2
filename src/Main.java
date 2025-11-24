
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**Declaracion de objetos que nos van a ayudar en el programita*/
    static Scanner sc = new Scanner(System.in);
    static Inventario inventario = new Inventario();

    public static void main(String[] args) {

        int opcion;
        /**Menu principal con sus opciones*/
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
                        actualizarInventario();
                        break;
                    case 3:
                        eliminarProducto();
                        break;
                    case 4:
                        buscarProducto();
                        break;
                    case 5:
                        desplegarTodosProductos();
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

    /**Funciones principales del programa, para usar en el switch*/
    public static void mostrarMenu(){
        System.out.println("\n===========================================");
        System.out.println("          SISTEMA DE INVENTARIO");
        System.out.println("===========================================");
        System.out.println("1.  Ingresar Nuevo Producto");
        System.out.println("2.  Actualizar Stock Producto");
        System.out.println("3.  Eliminar Producto");
        System.out.println("4.  Buscar Producto por nombre");
        System.out.println("5.  Desplegar todos los productos");
        System.out.println("6.  Salir");
        System.out.print(">>> Ingrese su opción: ");

    }


    public static void agregarProducto(){
        System.out.println("Ingrese nombre del producto:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese precio base:");
        double precio = sc.nextDouble();
        System.out.println("Ingrese cantidad inicial:");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.println("Nombre del Proveedor:");
        String nomProv = sc.nextLine();
        Proveedor prov = new Proveedor(nomProv, 5);

        System.out.println("Tipo de producto (1: Perecedero, 2: No Perecedero):");
        int tipo = sc.nextInt();
        sc.nextLine();

        if(tipo == 1){
            System.out.println("Ingrese fecha de caducidad:");
            String fecha = sc.nextLine();
            Producto p = new ProductoPerecedero(0, nombre, precio, cantidad, prov, fecha);
            inventario.añadirProducto(p);
        } else {
            System.out.println("Ingrese categoria:");
            String cat = sc.nextLine();
            Producto p = new ProductoNoPerecedero(0, nombre, precio, cantidad, prov, cat);
            inventario.añadirProducto(p);
        }
    }

    public static void buscarProducto(){
        int idaBuscar= sc.nextInt();
        Producto findedprod = inventario.buscarPorId(idaBuscar);
        if(findedprod!= null){
            System.out.println("Producto encontrado");
            System.out.println("Nombre: "+ findedprod.getNombre());
        }else {
            System.out.println("Producto no encontrado ;(");
        };
    }


    public static void eliminarProducto(){
        System.out.println("Ingrese el ID del producto a eliminar:");
        int id = sc.nextInt();
        inventario.eliminarProducto(id);
    }

    public static void actualizarInventario(){
        System.out.println("Ingrese el ID del producto:");
        int id = sc.nextInt();
        System.out.println("Ingrese cantidad a sumar:");
        int cant = sc.nextInt();
        inventario.actualizarInventario(id, cant);
    }

    public static void desplegarTodosProductos(){
        inventario.mostrarProductosDisponibles();
    }
}

