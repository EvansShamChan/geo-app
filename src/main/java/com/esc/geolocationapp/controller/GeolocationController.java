package com.esc.geolocationapp.controller;

import com.esc.geolocationapp.dto.DistanceDto;
import com.esc.geolocationapp.dto.GeolocationDto;
import com.esc.geolocationapp.service.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/geolocation")
public class GeolocationController {

    @Autowired
    private GeolocationService geolocationService;

    @PostMapping
    public DistanceDto getShortestDistance(@RequestBody GeolocationDto geolocationDto) {
        return geolocationService.getShortestDistance(geolocationDto);
    }
}
