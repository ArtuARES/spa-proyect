
package cl.spa.backend.repositorio;

import cl.spa.backend.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Duoc
 */
public interface PlanRepositorio extends JpaRepository<Plan, Long>{
    
}
