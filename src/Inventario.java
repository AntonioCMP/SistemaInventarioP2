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
                System.out.println("ID: " + producto.getId() + " | " + producto.getNombre() +
                        " | Stock: " + producto.getCantidadStock() +
                        " | Precio Venta: " + producto.calcularPrecio());
            }}
    }

    public void eliminarProducto(int idProducto){
        Producto p = buscarPorId(idProducto);
        if (p != null) {
            this.listaProductos.remove(p);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void actualizarInventario(int idProducto, int cantidad){
        Producto p = buscarPorId(idProducto);
        if (p != null) {
            p.aumentarCantidad(cantidad);
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public Producto buscarPorId(int id){
        for(Producto p : listaProductos){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

}
