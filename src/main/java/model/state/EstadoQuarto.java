package model.state;

import model.Quarto;

/**
 * Interface que define o contrato para os estados do quarto
 */
public interface EstadoQuarto {
    void proximaEstado(Quarto quarto);

    String getEstado();
}