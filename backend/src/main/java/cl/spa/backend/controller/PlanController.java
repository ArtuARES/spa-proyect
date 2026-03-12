
package cl.spa.backend.controller;

import cl.spa.backend.model.Plan;
import cl.spa.backend.repositorio.PlanRepositorio;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Duoc
 */
@RestController
@RequestMapping("/api/planes")
@CrossOrigin("")
public class PlanController {
    
    private final PlanRepositorio repository;

    public PlanController(PlanRepositorio repository) {
        this.repository = repository;
    }
    
    @GetMapping
    public List<Plan> getPlanes(){
        return repository.findAll();
    }
}
