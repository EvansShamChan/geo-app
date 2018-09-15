package com.esc.geolocationapp.service.impl;

import com.esc.geolocationapp.dto.DistanceDto;
import com.esc.geolocationapp.dto.GeolocationDto;
import com.esc.geolocationapp.service.GeolocationService;
import org.springframework.stereotype.Service;

@Service
public class GeolocationServiceImpl implements GeolocationService {
    @Override
    public DistanceDto getShortestDistance(GeolocationDto geolocationDto) {
        Double lonA = Math.toRadians(geolocationDto.getLonA());
        Double latA = Math.toRadians(geolocationDto.getLatA());
        Double lonB = Math.toRadians(geolocationDto.getLonB());
        Double latB = Math.toRadians(geolocationDto.getLatB());

        double dlon = lonB - lonA;
        double dlat = latB - latA;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(latA) * Math.cos(latB)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        double r = 6000;

        return new DistanceDto(c * r);
    }
}
