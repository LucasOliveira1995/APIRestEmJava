package med.voll.API.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.API.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
