package com.senai.apiValidation.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record CadastroClienteRequest(
        @NotNull(message = "O ID é obrigatório")
        @Positive(message = "O ID deve ser um número positivo")
        Long id,

        @NotBlank(message = "O nome é obrigatório")
        @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
        @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ\\s]+$", message = "O nome deve conter apenas letras")
        String name,

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "O e-mail deve ser válido (exemplo@email.com)")
        String email,

        @Min(value = 18, message = "O cliente deve ter no mínimo 18 anos")
        @Max(value = 120, message = "Idade inválida")
        Integer age,

        @NotNull(message = "A data de agendamento é obrigatória")
        @FutureOrPresent(message = "A data de agendamento deve ser hoje ou uma data futura")
        LocalDate appointmentDate
) {
}