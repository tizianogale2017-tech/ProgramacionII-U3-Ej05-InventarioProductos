package Ejercicio5_inventarioProductos;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("P-001", "Auriculares Bluetooth", 35000.0, 10);
        System.out.println(producto.getNombre() + " - stock inicial: " + producto.getStock());

        System.out.println("Venta de 4 unidades: " + (producto.registrarVenta(4) ? "OK" : "RECHAZADA"));
        System.out.println("Venta de 20 unidades: " + (producto.registrarVenta(20) ? "OK" : "RECHAZADA (stock insuficiente)"));
        System.out.println("Ingreso de 15 unidades: " + (producto.registrarIngresoStock(15) ? "OK" : "RECHAZADO"));
        System.out.println("Venta de 20 unidades: " + (producto.registrarVenta(20) ? "OK" : "RECHAZADA (stock insuficiente)"));

        System.out.println("Stock final: " + producto.getStock());
    }
}
