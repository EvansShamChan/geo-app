package com.esc.geolocationapp.service;

import com.esc.geolocationapp.dto.DistanceDto;
import com.esc.geolocationapp.dto.GeolocationDto;

public interface GeolocationService {
    DistanceDto getShortestDistance(GeolocationDto geolocationDto);
}
