import java.util.Scanner;
//WAZAAAA
public class Proveedor {
    /**
     * Atributos de la Clase Proveedor
     */
    private String nombreProveedor;
    private Integer tiempoEntregaDias;
    int nPedido=0;
    Scanner sc = new Scanner(System.in);
/**Constructores y Destructores*/
    public Proveedor(String nombreProveedor, Integer tiempoEntregaDias) {
        this.nombreProveedor = nombreProveedor;
        this.tiempoEntregaDias = tiempoEntregaDias;
    }
/**Mètodos de Java*/
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Integer getTiempoEntregaDias() {
        return tiempoEntregaDias;
    }

    public void setTiempoEntregaDias(Integer tiempoEntregaDias) {
        this.tiempoEntregaDias = tiempoEntregaDias;
    }
/**Métodos Propios*/
    public void realizarPedido(Integer cantidad, Integer idProducto ){
        nPedido=nPedido+1;
        boolean loop1 = false;
        boolean loop2 = false;

        System.out.println("-----Realizar Pedido Producto-----");
        do {
        System.out.println("Ingrese la ID del producto: ");
        if (sc.hasNextInt()||sc.nextInt()>0) {    // ver si el ID es entero
            idProducto = sc.nextInt();
            loop1 = true;
        } else {
            System.out.println("Error: debe ingresar un número entero.");
            sc.nextLine();
        }}while(loop1 == false);
        do {
            System.out.println("Ingrese la cantidad del producto "+idProducto+" para su pedido: ");
            if (sc.hasNextInt()||sc.nextInt()>0) {    // ver si el ID es entero
                cantidad = sc.nextInt();
                loop2 = true;
            } else {
                System.out.println("Valor incorrecto,ingrese de nuevo.");
                sc.nextLine();
            }}while(loop2 == false);
        System.out.println("Pedido #"+nPedido+" ha sido creado con éxito");
        System.out.println("Producto: "+idProducto);
        System.out.println("Cantidad: "+cantidad);
    }
    }
    private String nombre;

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }
}
