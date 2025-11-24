public class Producto {

    //Atributos de la clase
    private int id;
    private String nombre;
    private double precioBase;
    private int cantidadStock;
    private Proveedor proveedor;


    //Constructor
    public Producto(int id, String nombre, double precioBase, int cantidadStock, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.cantidadStock = cantidadStock;
        this.proveedor = proveedor;
    }


    //Getters y Setters de la clase producto
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }


    //Metodos adicionales de la clase

}
