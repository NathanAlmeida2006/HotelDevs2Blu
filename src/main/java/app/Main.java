package app;

import repository.impl.HotelRepositoryImpl;
import service.HotelService;

public class Main {
    public static void main(String[] args) {
        // Inicializa o serviço com a implementação do repositório
        HotelService hotelService = new HotelService(new HotelRepositoryImpl());

        // Listar os quartos e seus estados iniciais
        System.out.println("Quartos iniciais:");
        hotelService.listarQuartos().forEach(quarto ->
                System.out.println("Quarto " + quarto.getNumero() + ": " + quarto.getEstadoAtual().getEstado())
        );

        // Alterar o estado do quarto 3
        System.out.println("\nMudando estado do quarto 3...");
        hotelService.mudarEstadoQuarto(3);

        // Listar os quartos e seus estados após a mudança
        System.out.println("\nQuartos após mudança:");
        hotelService.listarQuartos().forEach(quarto ->
                System.out.println("Quarto " + quarto.getNumero() + ": " + quarto.getEstadoAtual().getEstado())
        );
    }
}
