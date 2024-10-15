package org.example.service;
import org.example.domain.Tenis;
import java.util.List;

public interface TenisService {
    void agregarTenis(Tenis tenis);
    List<Tenis> obtenerTodosLosTenis();
    Tenis buscarTenisPorModelo(String modelo);
    void eliminarTenis(String modelo);
    void guardarCambios();
}
