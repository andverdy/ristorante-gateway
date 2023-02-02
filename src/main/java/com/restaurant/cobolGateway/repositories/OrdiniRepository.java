package com.restaurant.cobolGateway.repositories;

import com.restaurant.cobolGateway.entities.OrdiniEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdiniRepository extends JpaRepository<OrdiniEntity, Integer> {

}
