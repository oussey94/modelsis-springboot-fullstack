package com.ousseynou.mbodji.backendmodelsis.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "type")
    private Collection<Product> products;
}
