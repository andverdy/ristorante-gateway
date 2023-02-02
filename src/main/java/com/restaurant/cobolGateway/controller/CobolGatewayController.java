package com.restaurant.cobolGateway.controller;


import com.restaurant.cobolGateway.entities.OrdiniEntity;
import com.restaurant.cobolGateway.repositories.OrdiniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cobolGateway")
public class CobolGatewayController {

    @Autowired
    private OrdiniRepository ordiniRepository;

    @GetMapping("/getCobolGateway")
    public List<OrdiniEntity> getCobolGateway() throws Exception {
        return ordiniRepository.findAll();
    }
}
