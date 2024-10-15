package org.example.repository;
import org.example.domain.Tenis;
import org.example.repository.TenisRepository;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TenisRepositoryImpl implements TenisRepository {

    private List<Tenis> tenisList;
    private String archivo = "tenis.dat";

    public TenisRepositoryImpl() {
        this.tenisList = new ArrayList<>();
        cargarTenis();
    }

    @Override
    public void agregarTenis(Tenis tenis) {
        if (buscarTenisPorModelo(tenis.getModelo()) == null) {
            tenisList.add(tenis);
            System.out.println("Agregado: " + tenis);
        } else {
            System.out.println("El modelo " + tenis.getModelo() + " ya existe.");
        }
    }

    @Override
    public List<Tenis> obtenerTodosLosTenis() {
        return tenisList;
    }

    @Override
    public Tenis buscarTenisPorModelo(String modelo) {
        return tenisList.stream()
                .filter(t -> t.getModelo().equalsIgnoreCase(modelo)) // Compara sin distinción de mayúsculas
                .findFirst()
                .orElse(null);

    }

    @Override
    public void eliminarTenis(String modelo) {
        tenisList.removeIf(t -> t.getModelo().equals(modelo));
    }

    @Override
    public void guardarCambios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(tenisList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarTenis() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            tenisList = (List<Tenis>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            tenisList = new ArrayList<>();
        }
    }

    public void limpiarTenis() {
        tenisList.clear();
    }
}



