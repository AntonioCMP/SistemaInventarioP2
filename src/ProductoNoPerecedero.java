public class ProductoNoPerecedero extends Producto{
    //Atributos de la clase
    private String categoria;


    //Constructor
    public ProductoNoPerecedero(int id, String nombre, double precioBase, int cantidadStock, Proveedor prov, String categoria) {
        super(id, nombre, precioBase, cantidadStock, prov);
        this.categoria = categoria;
    }

    //Metodos adicionales de la clase

}
