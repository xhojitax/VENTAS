package com.example.SweetDreams.ventasservice.controller;

import com.example.SweetDreams.ventasservice.dto.*;
import com.example.SweetDreams.ventasservice.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @PostMapping
    public VentaResponseDTO registrar(@RequestBody VentaRequestDTO dto) {
        return ventaService.registrarVenta(dto);
    }
}
