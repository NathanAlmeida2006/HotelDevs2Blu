package repository;

import model.Quarto;

import java.util.List;

/**
 * Interface para o repositório de gerenciamento de quartos do hotel.
 */
public interface HotelRepository {
    List<Quarto> listarQuartos();

    void mudarEstadoQuarto(int numeroQuarto);
}