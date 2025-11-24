public class ProductoPerecedero extends Producto{

    /**Atributos de la clase*/
    private String fechaCaducidad;


    /**Constructor*/
    public ProductoPerecedero(int id, String nombre, double precioBase, int cantidadStock, Proveedor prov, String fecha) {
        super(nombre, precioBase, cantidadStock, prov);
        this.fechaCaducidad = fecha;
    }

    public double calcularPrecio() {
        return getPrecioBase() * 0.90; // Descuento por perecedero
    }

    /**Metodos adicionales de la clase*/
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
}
