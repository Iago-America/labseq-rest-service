package com.labseq.labseqservice.controller;

import com.labseq.labseqservice.service.LabseqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("labseq")
public class LabseqRestController {

    @Autowired
    private LabseqService labseqService;

    @GetMapping("/{number}")
    public ResponseEntity<BigInteger> getLabseqResult(@PathVariable("number") int number) {
        BigInteger result = labseqService.getLabseqValue(number);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
