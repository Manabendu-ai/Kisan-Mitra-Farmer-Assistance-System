package com.kisanmitra.models;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CropsGrown {
    private Integer farmerId;
    private String crop;
}
