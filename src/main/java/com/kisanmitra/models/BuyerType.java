package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "buyer_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuyerType {

    @EmbeddedId
    private BuyerTypeId id;

    @ManyToOne
    @MapsId("buyerId")
    @JoinColumn(name = "buyer_id")
    private BuyerProfile buyerProfile;
}
