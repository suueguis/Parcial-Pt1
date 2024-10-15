package org.example.service;
import java.util.List;
import org.example.domain.Tenis;
import org.example.repository.TenisRepository;

public class TenisServiceImpl implements TenisService {
    private TenisRepository tenisRepository;

    public TenisServiceImpl(TenisRepository tenisRepository) {
        this.tenisRepository = tenisRepository;
    }

    @Override
    public void agregarTenis(Tenis tenis) {
        tenisRepository.agregarTenis(tenis);
    }

    @Override
    public List<Tenis> obtenerTodosLosTenis() {
        return tenisRepository.obtenerTodosLosTenis();
    }

    @Override
    public Tenis buscarTenisPorModelo(String modelo) {
        return tenisRepository.buscarTenisPorModelo(modelo);
    }

    @Override
    public void eliminarTenis(String modelo) {
        tenisRepository.eliminarTenis(modelo);
    }

    @Override
    public void guardarCambios() {
        tenisRepository.guardarCambios();
    }
}