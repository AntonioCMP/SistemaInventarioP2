public class ProductoNoPerecedero extends Producto{
    //**Atributos de la clase*/
    private String categoria;


    /**Constructor*/
    public ProductoNoPerecedero(int id, String nombre, double precioBase, int cantidadStock, Proveedor prov, String categoria) {
        super(nombre, precioBase, cantidadStock, prov);
        this.categoria = categoria;
    }

    public double calcularPrecio() {
        return getPrecioBase(); // Precio normal
    }

    /**Metodos adicionales de la clase*/
    public String getCategoria() {
        return categoria;
    }
}
