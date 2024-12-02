package repository.impl;

import model.Quarto;
import model.state.impl.EstadoDisponivel;
import repository.HotelRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação do repositório para gerenciamento de quartos do hotel.
 * Esta classe armazena a lista de quartos e gerencia a transição de estados.
 */
public class HotelRepositoryImpl implements HotelRepository {
    private final List<Quarto> quartos;

    /**
     * Construtor padrão que inicializa a lista de quartos do hotel.
     * Cada quarto é criado com um número único e estado inicial "Disponível".
     */
    public HotelRepositoryImpl() {
        quartos = new ArrayList<>();
        // Inicializando com alguns quartos de exemplo, estado inicial é "Disponível"
        for (int i = 1; i <= 6; i++) {
            quartos.add(new Quarto(i, new EstadoDisponivel()));
        }
    }

    /**
     * Lista todos os quartos atualmente registrados no repositório.
     *
     * @return Uma nova lista contendo os quartos e seus estados.
     */
    @Override
    public List<Quarto> listarQuartos() {
        // Retorna uma cópia da lista de quartos para evitar mutações externas
        return new ArrayList<>(quartos);
    }

    /**
     * Altera o estado do quarto identificado pelo número.
     * O estado do quarto é transitado para o próximo estado conforme a lógica do padrão State.
     *
     * @param numeroQuarto O número do quarto que terá o estado alterado.
     *                     Caso o número não exista, nenhuma ação será tomada.
     */
    @Override
    public void mudarEstadoQuarto(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                // Transita para o próximo estado do quarto
                quarto.getEstadoAtual().proximaEstado(quarto);
                break;
            }
        }
    }
}