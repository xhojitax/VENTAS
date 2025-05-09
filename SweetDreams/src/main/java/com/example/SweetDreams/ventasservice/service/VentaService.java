package com.example.SweetDreams.ventasservice.service;

import com.example.SweetDreams.ventasservice.dto.*;
import com.example.SweetDreams.ventasservice.model.Venta;
import com.example.SweetDreams.ventasservice.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service

public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public VentaResponseDTO registrarVenta(VentaRequestDTO dto) {
        Venta venta = Venta.builder()
                .clienteId(dto.getClienteId())
                .montoTotal(dto.getMontoTotal())
                .metodoPago(dto.getMetodoPago())
                .fecha(LocalDateTime.now())
                .build();

        Venta saved = ventaRepository.save(venta);
        return VentaResponseDTO.builder()
                .id(saved.getId())
                .clienteId(saved.getClienteId())
                .montoTotal(saved.getMontoTotal())
                .metodoPago(saved.getMetodoPago())
                .fecha(saved.getFecha())
                .build();
    }
}
