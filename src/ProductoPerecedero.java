public class ProductoPerecedero extends Producto{

    private String fechaCaducidad;

    public ProductoPerecedero(int id, String nombre, double precioBase, int cantidadStock, Proveedor prov, String fecha) {
        super(id, nombre, precioBase, cantidadStock, prov);
        this.fechaCaducidad = fecha;
    }
}
