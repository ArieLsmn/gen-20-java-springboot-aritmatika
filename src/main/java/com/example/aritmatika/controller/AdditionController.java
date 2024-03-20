package com.example.aritmatika.controller;

import com.example.aritmatika.dto.Aritmatika;
import com.example.aritmatika.dto.ResponseHasil;
import com.example.aritmatika.service.AritmatikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/add")
public class AdditionController {

    @Autowired
    private AritmatikaService arService;

    @PostMapping("/tambah")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ResponseHasil addition(@RequestBody Aritmatika ar){
        int ok = HttpStatus.OK.value();
        String msg=HttpStatus.OK.getReasonPhrase();
        return new ResponseHasil(ok,msg,arService.addition(ar.getA(), ar.getB()));
    }
}
