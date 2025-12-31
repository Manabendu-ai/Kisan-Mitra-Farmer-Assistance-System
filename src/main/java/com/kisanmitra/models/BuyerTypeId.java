package com.kisanmitra.models;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuyerTypeId {
    private Integer buyerId;
    private String type;
}
