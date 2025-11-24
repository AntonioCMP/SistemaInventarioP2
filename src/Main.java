import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario= new Inventario();
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


    public static void mostrarMenu(){}

    public static void agregarProducto(){


    }

        }

