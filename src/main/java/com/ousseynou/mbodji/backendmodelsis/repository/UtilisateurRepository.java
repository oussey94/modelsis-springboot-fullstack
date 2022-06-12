package com.ousseynou.mbodji.backendmodelsis.repository;

import com.ousseynou.mbodji.backendmodelsis.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByUserName(String userName);
}
