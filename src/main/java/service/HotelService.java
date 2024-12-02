package service;

import model.Quarto;
import repository.HotelRepository;

import java.util.List;

/**
 * Serviço que abstrai a lógica de manipulação de quartos.
 */
public class HotelService {
    private final HotelRepository repository;

    public HotelService(HotelRepository repository) {
        this.repository = repository;
    }

    /**
     * Lista todos os quartos e seus estados.
     *
     * @return Lista de quartos.
     */
    public List<Quarto> listarQuartos() {
        return repository.listarQuartos();
    }

    /**
     * Altera o estado de um quarto específico pelo número.
     *
     * @param numeroQuarto Número do quarto.
     */
    public void mudarEstadoQuarto(int numeroQuarto) {
        repository.mudarEstadoQuarto(numeroQuarto);
    }
}