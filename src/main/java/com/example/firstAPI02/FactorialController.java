package com.example.firstAPI02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping("/{n}")
    public int factorial(@PathVariable int n) {
       int factorial = 1;
        if(n < 0){
            factorial = 0;
        }else{
            for(int i=0; i<n; i++){
                factorial *= (i+1);
            }
        }return factorial;
    }
}
