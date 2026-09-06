package com.tecsup.service;

import com.tecsup.model.Empleado;
import com.tecsup.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository repo;

    public List<Empleado> ListarEmpleado(){
        return repo.findAll();
    }

    public Empleado guardarEmpleado(Empleado e) {
        return repo.save(e);
    }

    public Empleado obtenerEmpleado(Long idEmpleado) {
        return  repo.findById(idEmpleado).orElse(null);
    }

    public void eliminar(Long idEmpleado) {
        repo.deleteById(idEmpleado);
    }
}
