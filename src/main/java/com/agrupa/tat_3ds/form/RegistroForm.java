package com.agrupa.tat_3ds.form;

import jakarta.validation.constraints.*;
import lombok.Getter;
import java.util.List;

@Getter
public class RegistroForm {

    @NotBlank(message = "A descrição da atividade é obrigatória")
    public String descricaoAtividade;

    @NotNull(message = "A quantidade de alunos é obrigatória")
    @Min(value = 1, message = "A quantidade de alunos deve ser pelo menos 1")
    public Integer quantidadeTotalAlunosSala;

    @NotEmpty(message = "Você deve enviar pelo menos um grupo")
    public List<GrupoForm> grupoForm;
}