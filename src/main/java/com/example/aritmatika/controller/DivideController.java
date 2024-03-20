package com.example.aritmatika.controller;

import com.example.aritmatika.dto.Aritmatika;
import com.example.aritmatika.dto.ResponseHasil;
import com.example.aritmatika.service.AritmatikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/div")
public class DivideController {

    @Autowired
    private AritmatikaService arService;
    @PostMapping("/bagi")
    @ResponseBody
    public ResponseHasil division (@RequestBody Aritmatika ar){
        int ok = HttpStatus.OK.value();
        String msg=HttpStatus.OK.getReasonPhrase();
        try {
            return new ResponseHasil(ok, msg, arService.division(ar.getA(), ar.getB()));
        }
        catch (ArithmeticException e){
            return new ResponseHasil(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), 0);
        }
    }

}
