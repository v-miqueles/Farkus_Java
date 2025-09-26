package farkus_app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clases {
    // Clase Auto
    public static class Auto {
        public String marca;
        public String modelo;
        public int anio;
        public String patente;
        public String clienteAsociado; // RUN del cliente o referencia

        public Auto(String marca, String modelo, int anio, String patente, String clienteAsociado) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.patente = patente;
            this.clienteAsociado = clienteAsociado;
        }
    }

    // Clase Repuesto
    public static class Repuesto {
        public String nombre;
        public String codigo;
        public double precioUnitario;
        public int stock;

        public Repuesto(String nombre, String codigo, double precioUnitario, int stock) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.precioUnitario = precioUnitario;
            this.stock = stock;
        }
    }

    // Clase Cliente
    public static class Cliente {
        public String run;
        public String nombre;
        public String telefono;
        public List<String> autosAsociados; // Patentes

        public Cliente(String run, String nombre, String telefono) {
            this.run = run;
            this.nombre = nombre;
            this.telefono = telefono;
            this.autosAsociados = new ArrayList<>();
        }
    }

    // Clase Boleta
    public static class Boleta {
        public int numero;
        public Date fecha;
        public String runCliente;
        public String tipo; // Venta implementos / Servicio taller
        public List<DetalleProducto> detalleProductos;
        public String detalleServicio; // Opcional
        public double valorServicio;
        public double total;

        public Boleta(int numero, Date fecha, String runCliente, String tipo, List<DetalleProducto> detalleProductos,
                String detalleServicio, double valorServicio, double total) {
            this.numero = numero;
            this.fecha = fecha;
            this.runCliente = runCliente;
            this.tipo = tipo;
            this.detalleProductos = detalleProductos;
            this.detalleServicio = detalleServicio;
            this.valorServicio = valorServicio;
            this.total = total;
        }
    }

    // Clase DetalleProducto
    public static class DetalleProducto {
        public String codigoRepuesto;
        public int cantidad;
        public double precioUnitario;
        public double subtotal;

        public DetalleProducto(String codigoRepuesto, int cantidad, double precioUnitario) {
            this.codigoRepuesto = codigoRepuesto;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
            this.subtotal = cantidad * precioUnitario;
        }
    }
}