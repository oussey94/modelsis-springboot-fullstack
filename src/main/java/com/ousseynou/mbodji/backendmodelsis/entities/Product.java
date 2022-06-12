package com.ousseynou.mbodji.backendmodelsis.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date created_at;
    @ManyToOne
    private ProductType type;
}
