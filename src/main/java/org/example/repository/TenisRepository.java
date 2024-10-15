package org.example.repository;
import java.util.List;
import org.example.domain.Tenis;

public interface TenisRepository {

    void agregarTenis(Tenis tenis);
    List<Tenis> obtenerTodosLosTenis();
    Tenis buscarTenisPorModelo(String modelo);
    void eliminarTenis(String modelo);
    void guardarCambios();
    void limpiarTenis();
    void cargarTenis();

}
