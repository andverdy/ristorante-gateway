package com.restaurant.cobolGateway.controller;


import com.restaurant.cobolGateway.services.CobolGatewayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cobolGateway")
@RequiredArgsConstructor
public class CobolGatewayController {

    private final CobolGatewayService ordiniService;

    @GetMapping("/getCobolGateway")
    public String getCobolGateway(String input) throws Exception {
        return "ok";
    }
}
