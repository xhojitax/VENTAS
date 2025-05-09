package com.example.SweetDreams.ventasservice.dto;

import lombok.Data;

@Data
public class VentaRequestDTO {
    private Long clienteId;
    private Double montoTotal;
    private String metodoPago;
}
