package com.challenge.forohub.topicos;

import jakarta.validation.constraints.NotBlank;

public record TopicoDTO(@NotBlank
                        Long id,
                        @NotBlank
                        String mensaje,
                        @NotBlank
                        String nombreCurso,
                        @NotBlank
                        String  titulo) {
}
