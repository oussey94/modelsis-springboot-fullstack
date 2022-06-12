package com.ousseynou.mbodji.backendmodelsis.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Utilisateur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String userName;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles;
}
