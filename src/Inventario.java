import java.util.ArrayList;

public class Inventario {

    //Atributos de la clase
    private ArrayList<Producto> listaProductos;

    //Constructor
    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    //Metodos adicionales de la clase

    public void añadirProducto(Producto producto){
        this.listaProductos.add(producto);
        System.out.println("Producto añadido: " + producto.getNombre());
    }

    public void mostrarProductosDisponibles(){
        if (this.listaProductos.isEmpty()){
            System.out.println("Lista vacia");
        }else{
        for(Producto producto: listaProductos){
            System.out.println("Producto: " + producto.getNombre() + "\n" +
                    "Cantidad disponible: " + producto.getCantidadStock() + "\n" +
                    "Costo producto: " + producto.getPrecioBase());

        }}
    }

    public void eliminarProducto(Producto productoEliminado){
        this.listaProductos.remove(productoEliminado);
        System.out.println("Producto eliminado: " + productoEliminado.getNombre());
    }

    public void actualizarInventario(int idProducto, int cantidad){
        Producto producto = this.listaProductos.get(idProducto);
        producto.aumentarCantidad(cantidad);
    }

}
