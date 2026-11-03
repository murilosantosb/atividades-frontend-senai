package com.senai.apiValidation.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CadastroEventoRequest(
        @NotBlank(message = "O nome é obrigatório")
        @Size(min = 5, max = 80, message = "O nome deve ter entre 5 e 80 caracteres")
        String nome,

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "Formato de e-mail inválido")
        String emailContato,

        @NotNull(message = "A data de início é obrigatória")
        @Future(message = "A data de início deve ser no futuro")
        LocalDateTime dataInicio,

        @NotNull(message = "A quantidade de vagas é obrigatória")
        @Min(value = 10, message = "O mínimo de vagas permitido é 10")
        @Max(value = 5000, message = "O máximo de vagas permitido é 5000")
        Integer vagas,

        @NotNull(message = "O preço do ingresso é obrigatório")
        @PositiveOrZero(message = "O preço do ingresso deve ser um valor positivo ou zero")
        BigDecimal precoIngresso,

        @NotBlank(message = "O logradouro é obrigatório")
        String logradouro,

        @NotBlank(message = "O número é obrigatório")
        String numero,

        @NotBlank(message = "O CEP é obrigatório")
        @Pattern(regexp = "\\d{5}-\\d{3}", message = "O CEP deve seguir o padrão XXXXX-XXX")
        String cep
) {
}