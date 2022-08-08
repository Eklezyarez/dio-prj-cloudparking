package com.dio.cloudparking.controller.mapper;

import com.dio.cloudparking.controller.dto.ParkingDTO;
import com.dio.cloudparking.model.Parking;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParkingMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ParkingDTO parkingDTO(Parking parking){
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }
    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        return null;
    }
    //Modelando COnversao
}
