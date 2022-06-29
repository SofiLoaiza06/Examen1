package Iticket.demo.entity;

import package Iticket.demo.entity.evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofi
 */
@Repository
public interface EventoRepository extends CrudRepository<evento, Long>{
    
}
