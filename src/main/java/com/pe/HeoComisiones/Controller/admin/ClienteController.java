package com.pe.HeoComisiones.Controller.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.HeoComisiones.Services.admin.AdminClientesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/clientes")
@PreAuthorize("hasRole('ADMIN')")
public class ClienteController {
    private final AdminClientesService adminClientesService;
    @GetMapping
    public ResponseEntity<?> getClientes(){
      
       
        return ResponseEntity.ok().body(adminClientesService.getcliente());
    }

}
