package com.sudagoarth.airportapi.service;

import com.sudagoarth.airportcore.model.PlaneDto;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {
    public PlaneDto getPlaneDto(){
        return new PlaneDto("Jet Plane", 4);
    }
}
