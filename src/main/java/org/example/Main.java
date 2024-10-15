package org.example;
import org.example.repository.TenisRepository;
import org.example.repository.TenisRepositoryImpl;
import org.example.domain.Tenis;
import java.util.List;
import org.example.service.TenisServiceImpl;
import org.example.service.TenisService;

public class Main {
    public static void main(String[] args) {
        TenisRepository tenisRepository = new TenisRepositoryImpl();
        TenisService tenisService = new TenisServiceImpl(tenisRepository);

        tenisRepository.limpiarTenis();

        tenisService.agregarTenis(new Tenis("Nike", "Air Max", 38.0, 120.0));
        tenisService.agregarTenis(new Tenis("Asics", "Gel-Dedicate 8", 38.0, 210.0));
        tenisService.agregarTenis(new Tenis("Adidas", "Superstar", 40.0, 90.0));

        tenisService.guardarCambios();

        List<Tenis> tenis = tenisService.obtenerTodosLosTenis();
        tenis.forEach(System.out::println);

        Tenis tenisBuscado = tenisService.buscarTenisPorModelo("Air Max");
        System.out.println("Tenis buscado: " + tenisBuscado);
    }
}