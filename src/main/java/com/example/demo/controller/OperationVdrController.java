package com.example.demo.controller;


import com.example.demo.dto.OperationVdrDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Create Operation Controller
 * @author OscarxTeam
 */
@RestController
@RequestMapping("/operationVdr")
@Validated
public class OperationVdrController {

    @PostMapping("/create")
    public ResponseEntity createOperation(@Valid @RequestBody OperationVdrDto operationDto){
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
