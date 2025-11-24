public class ProductoPerecedero extends Producto{

    //Atributos de la clase
    private String fechaCaducidad;


    //Constructor
    public ProductoPerecedero(int id, String nombre, double precioBase, int cantidadStock, Proveedor prov, String fecha) {
        super(id, nombre, precioBase, cantidadStock, prov);
        this.fechaCaducidad = fecha;
    }

    //Metodos adicionales de la clase
}
