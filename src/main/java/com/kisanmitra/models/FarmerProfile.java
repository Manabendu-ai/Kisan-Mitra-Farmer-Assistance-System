package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "farmers_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FarmerProfile {

    @Id
    @Column(name = "farmer_id")
    private Integer farmerId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "farmer_id")
    private User user;

    private String village;
    private String district;
    private String state;
}
