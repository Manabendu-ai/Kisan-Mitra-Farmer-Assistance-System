package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "driver_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverProfile {
    @Id
    @Column(name = "driver_id")
    private Integer driverId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "driver_id")
    private User user;

    private String vehicleType;
    private Double maxLoadKg;
    private Double serviceRadiusKm;
    private Boolean availabilityStatus;
}
