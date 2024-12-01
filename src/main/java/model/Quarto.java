package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.state.EstadoQuarto;

/**
 * Classe que representa um quarto e seu estado atual.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quarto {
    private int numero;
    private EstadoQuarto estadoAtual;
}