package com.ousseynou.mbodji.backendmodelsis.services.interfaces;

import com.ousseynou.mbodji.backendmodelsis.entities.Role;
import com.ousseynou.mbodji.backendmodelsis.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur addNewUser(Utilisateur utilisateur);
    Role addNewRole(Role role);
    void addRoleToUser(String userName,String roleName);
    Utilisateur findParUserName(String userName);
    List<Utilisateur> listUsers();
    Utilisateur getUserParId(Long id);
    void deleteUser(Long id);
}
