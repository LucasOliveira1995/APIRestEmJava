package med.voll.API.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.API.endereco.Endereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endereco) {
}
