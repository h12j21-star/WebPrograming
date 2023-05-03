package gcu.backend.orderservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "order", path="order")
public interface OrderRepository extends JpaRepository<Order, Long>, CrudRepository<Order, Long> {
//    List<Member> findAllById(@Param("id") Long id);
        }
