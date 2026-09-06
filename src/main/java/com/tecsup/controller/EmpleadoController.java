package com.tecsup.controller;

import com.tecsup.model.Empleado;
import com.tecsup.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService service;

    @GetMapping
    public List<Empleado> Listar() {
        return service.ListarEmpleado();
    }

    @PostMapping
    public ResponseEntity<Empleado> guardar(@RequestBody Empleado empleado) {
        return ResponseEntity.status(201).body(service.guardarEmpleado(empleado));
    }

    @GetMapping("/{idEmpleado}")
    public ResponseEntity<Empleado> obtener(@PathVariable Long idEmpleado) {
        Empleado e = service.obtenerEmpleado(idEmpleado);
        if (e == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(e);
    }

    @PutMapping("/{idEmpleado}")
    public ResponseEntity<Empleado> actualizar(@PathVariable Long idEmpleado, @RequestBody Empleado e) {
        Empleado existente = service.obtenerEmpleado(idEmpleado);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        existente.setNombre(e.getNombre());
        existente.setApellido(e.getApellido());
        existente.setCargo(e.getCargo());
        existente.setNumero(e.getNumero());
        return ResponseEntity.ok(service.guardarEmpleado(existente));
    }

    @DeleteMapping("/{idEmpleado}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idEmpleado) {
        Empleado e = service.obtenerEmpleado(idEmpleado);
        if (e == null) {
            return ResponseEntity.notFound().build();
        }
        service.eliminar(idEmpleado);
        return ResponseEntity.noContent().build();
    }
}