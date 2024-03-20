package com.example.aritmatika.controller;

import com.example.aritmatika.dto.Aritmatika;
import com.example.aritmatika.dto.ResponseHasil;
import com.example.aritmatika.service.AritmatikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/mult")
public class MultiplyController {

    @Autowired
    private AritmatikaService arService;
    @PostMapping("/kali")
    @ResponseBody

    public ResponseHasil multiply(@RequestBody Aritmatika ar){
        int ok = HttpStatus.OK.value();
        String msg=HttpStatus.OK.getReasonPhrase();
        return new ResponseHasil(ok,msg,arService.multiply(ar.getA(),ar.getB()));
    }
}
