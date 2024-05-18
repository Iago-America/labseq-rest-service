package com.labseq.labseqservice.controller;

import com.labseq.labseqservice.service.LabseqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("labseq")
public class LabseqRestController {

    @Autowired
    private LabseqService labseqService;

    @GetMapping("/{number}")
    public ResponseEntity<String> getLabseqResult(@PathVariable("number") int number) {
        BigInteger result = labseqService.getLabseqValue(number);
        return new ResponseEntity<>(result.toString(), HttpStatus.OK);
    }

}
