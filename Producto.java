package Ejercicio5_inventarioProductos;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException("El precio y el stock no pueden ser negativos.");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean registrarIngresoStock(int cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        stock += cantidad;
        return true;
    }

    public boolean registrarVenta(int cantidad) {
        if (cantidad <= 0 || cantidad > stock) {
            return false;
        }
        stock -= cantidad;
        return true;
    }

    public int getStock() {
        return stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
