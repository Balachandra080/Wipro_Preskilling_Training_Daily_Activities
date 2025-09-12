package com.gl.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CalculatorController {
    
    //  http://localhost:8081/add?a=10&b=20
    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) 
    {
        int c = a + b;
        return "Addition : " + c;
    }
    
    //  http://localhost:8081/addnew?a=10&b=20
    @GetMapping("/addnew")
    public ResponseEntity<String> addnew(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.status(HttpStatus.OK).body("Add: " + (a + b));
    }

    
    //  http://localhost:8081/sub?a=10&b=20
    @GetMapping("/sub")
    public String sub(@RequestParam int a, @RequestParam int b)
    {
    	return "Sub :" + (a-b);
    }
    
    // http://localhost:8081/subnew?a=10&b=20
    @GetMapping("/subnew")
    public ResponseEntity<String> subnew(@RequestParam int a, @RequestParam int b) {
        if (a < b) 
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("B must be bigger than A");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Sub: " + (a - b));
    }

    
    //  http://localhost:8081/mul/10/20
    @GetMapping("/mul/{a}/{b}")
    public String mul(@PathVariable int a, @PathVariable int b)
    {
    	return "Mul : " + (a * b);
    }
    
 // http://localhost:8081/div/20/5
    @GetMapping("/div/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b) {
        if (b == 0) {
            return "Error: Division by zero not allowed!";
        }
        return "Div: " + (a / b);
    }

    // http://localhost:8081/divnew?a=20&b=5
    @GetMapping("/divnew")
    public ResponseEntity<String> divnew(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("B can't be zero");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Div: " + (a / b));
    }

    
}
