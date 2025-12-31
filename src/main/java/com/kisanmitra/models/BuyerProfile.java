package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "buyers_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuyerProfile {

    @Id
    @Column(name = "buyer_id")
    private Integer buyerId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "buyer_id")
    private User user;

    private String buisnessName;
    private String address;
}
