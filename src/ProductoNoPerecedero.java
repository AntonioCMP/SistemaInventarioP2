public class ProductoNoPerecedero extends Producto{

    private String categoria;

    public ProductoNoPerecedero(int id, String nombre, double precioBase, int cantidadStock, Proveedor prov, String categoria) {
        super(id, nombre, precioBase, cantidadStock, prov);
        this.categoria = categoria;
    }

}
