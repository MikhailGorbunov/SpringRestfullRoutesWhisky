package com.codeclan.example.WhiskyTracker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhiskyController {

    @Getmapping(value = "/whiskies")
    public responseEntity<List<Whisky>> getAllWhiskies(){
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.Ok);
    }
    @Getmapping(value = "/whiskies/{id}")
    public responseEntity<Whisky> getWhisky(@PathVariable Long id){
        return new ResponseEntity<>(whiskyRepository.findById(id), HttpStatus.Ok);
    }

    @PostMapping(value = "/whiskies")
    public repsonseEntity<Whisky> postWhisky(@RequestBody Whisky whisky){
        whiskyRepository.save(whisky);
        return new ResponseEntity<>(whisky, HttpStatus.CREATED);
    }

}
