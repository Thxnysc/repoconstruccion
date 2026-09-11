package pe.edu.uls.demojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ServiceRepuesto {

    @Autowired 
    RepositoryRepuesto repoRepuesto;

    public Repuesto registrarRepuesto(Repuesto nuevo){
        Repuesto repuesto = repoRepuesto.save(nuevo);
        return repuesto;
    }

    public Repuesto consultarRepuesto(int id) {
        return repoRepuesto.findById(id).get();
    }
}