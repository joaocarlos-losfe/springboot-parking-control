package com.softscience.parking_control.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ID;

    @Column(nullable = false, unique = true, length = 10)
     private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7)
     private String licensePlateCar;

    @Column(nullable = false, length = 70)
     private String brandCar;

    @Column(nullable = false,  length = 70)
     private String modelCar;

    @Column(nullable = false, length = 70)
     private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false, length = 130)
    private String responsibleName;

    @Column(nullable = false, length = 30)
    private  String apartment;

    @Column(nullable = false, length = 30)
    private  String block;
}
