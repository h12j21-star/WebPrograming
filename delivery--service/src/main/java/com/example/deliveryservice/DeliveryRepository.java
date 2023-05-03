package com.example.deliveryservice;

import com.example.deliveryservice.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orderdeilvery", path="orderdelivery")
public interface DeliveryRepository extends JpaRepository<Delivery, Long>, CrudRepository<Delivery, Long> {
//    List<Member> findAllById(@Param("id") Long id);
}