package com.person.todeploy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "weather")
public class WeatherController {

    @GetMapping
    public ResponseEntity<Object> getWeather (
            @RequestParam(value = "now", defaultValue = "false") boolean now
    ){
        String weather = "Very hot all day";
        if(now) {
            weather = "Very hot today!!";
        }
        return ResponseEntity.status(HttpStatus.OK).body(weather);
    }
}
