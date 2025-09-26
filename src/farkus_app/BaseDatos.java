package farkus_app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private static final String CLIENTES_FILE = "clientes.json";
    private static final String AUTOS_FILE = "autos_taller.json";
    private static final String INVENTARIO_FILE = "inventario.json";
    private static final String BOLETAS_FILE = "boletas.json";

    public List<Clases.Cliente> clientes;
    public List<Clases.Auto> autosTaller;
    public List<Clases.Repuesto> inventario;
    public List<Clases.Boleta> boletas;

    private Gson gson;

    public BaseDatos() {
        gson = new GsonBuilder().setPrettyPrinting().create();
        clientes = new ArrayList<>();
        autosTaller = new ArrayList<>();
        inventario = new ArrayList<>();
        boletas = new ArrayList<>();
    }

    // Cargar todos los datos desde JSON
    public void cargarDatos() {
        clientes = cargarLista(CLIENTES_FILE, new TypeToken<List<Clases.Cliente>>(){}.getType());
        autosTaller = cargarLista(AUTOS_FILE, new TypeToken<List<Clases.Auto>>(){}.getType());
        inventario = cargarLista(INVENTARIO_FILE, new TypeToken<List<Clases.Repuesto>>(){}.getType());
        boletas = cargarLista(BOLETAS_FILE, new TypeToken<List<Clases.Boleta>>(){}.getType());
    }

    // Guardar todos los datos en JSON
    public void guardarDatos() {
        guardarLista(CLIENTES_FILE, clientes);
        guardarLista(AUTOS_FILE, autosTaller);
        guardarLista(INVENTARIO_FILE, inventario);
        guardarLista(BOLETAS_FILE, boletas);
    }

    // Métodos genéricos para cargar/guardar listas
    private <T> List<T> cargarLista(String filename, Type type) {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, type);
        } catch (IOException e) {
            return new ArrayList<>(); // Si no existe el archivo, retorna lista vacía
        }
    }

    private <T> void guardarLista(String filename, List<T> lista) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(lista, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
