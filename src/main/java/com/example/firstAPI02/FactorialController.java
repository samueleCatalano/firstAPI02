package com.example.firstAPI02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping("/{n}")
    public Integer factorial(@PathVariable Integer n) {
       n = 4;
       Integer factorial = n * 3*2*1;
        return factorial;
    }
}
