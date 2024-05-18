package com.labseq.labseqservice.controller;

import com.labseq.labseqservice.service.LabseqService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("labseq")
public class LabseqRestController {

    @Autowired
    private LabseqService labseqService;


    @Operation(
            summary = "Retrieve a Number of Labseq.",
            description =
                    "Get a Number of Labseq and published status.")
    @ApiResponses({
            @ApiResponse( responseCode = "200", content = { @Content(schema = @Schema(implementation = String.class)) }),
            @ApiResponse( responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse( responseCode = "500",content = { @Content(schema = @Schema()) })
    })
    @GetMapping("/{number}")
    public ResponseEntity<String> getLabseqResult(@PathVariable("number") int number) {
        BigInteger result = labseqService.getLabseqValue(number);
        return new ResponseEntity<>(result.toString(), HttpStatus.OK);
    }

}
