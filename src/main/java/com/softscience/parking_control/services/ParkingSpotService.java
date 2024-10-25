package com.softscience.parking_control.services;

import com.softscience.parking_control.models.ParkingSpotModel;
import com.softscience.parking_control.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    @Autowired
    ParkingSpotRepository parkingRepository;

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
        return parkingRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String licensePlateCar){
        return parkingRepository.existsByParkingSpotNumber(licensePlateCar);
    }
    public boolean existsByApartmentAndBlock(String apartment, String block){
        return  parkingRepository.existsByApartmentAndBlock(apartment, block);
    }

    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return  parkingRepository.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id){
        return  parkingRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingRepository.delete(parkingSpotModel);
    }
}
