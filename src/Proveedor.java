//WAZAAAA
public class Proveedor {
    /**
     * Atributos de la Clase Proveedor
     */
    private String nombreProveedor;
    private Integer tiempoEntregaDias;
    int nPedido=0;

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
        nPedido = nPedido + 1;
        System.out.println("-----Realizar Pedido Producto-----");
        System.out.println("Pedido #"+nPedido+" ha sido creado con éxito");
        System.out.println("Producto ID: "+idProducto);
        System.out.println("Cantidad solicitada: "+cantidad);
        System.out.println("Tiempo estimado: " + tiempoEntregaDias + " dias.");
    }
}
