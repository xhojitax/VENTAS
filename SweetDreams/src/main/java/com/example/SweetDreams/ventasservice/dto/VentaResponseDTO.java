package com.example.SweetDreams.ventasservice.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class VentaResponseDTO {
    private Long id;
    private Long clienteId;
    private Double montoTotal;
    private String metodoPago;
    private LocalDateTime fecha;
}
