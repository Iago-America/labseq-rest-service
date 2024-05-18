package com.labseq.labseqservice.controller;

import com.labseq.labseqservice.service.LabseqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("labseq")
public class LabseqRestController {

    @Autowired
    private LabseqService labseqService;

    @GetMapping("/{number}")
    public Long getLabseqResult(@PathVariable("number") int number) {
        Long result = labseqService.getLabseqValue(number);
        return result;
    }

}
