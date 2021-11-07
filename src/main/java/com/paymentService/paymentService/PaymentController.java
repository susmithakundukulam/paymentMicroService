package com.paymentService.paymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${service.welcome.message}")
    private String message;

    @Autowired
    private Environment env;

    @RequestMapping("/init")
    public String getPayment(){
        return "payment succcessful" + message + " : "+ env.getProperty("local.server.port");
    }
    
}
