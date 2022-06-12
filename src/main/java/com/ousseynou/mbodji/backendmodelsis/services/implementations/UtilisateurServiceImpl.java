package com.ousseynou.mbodji.backendmodelsis.services.implementations;

import com.ousseynou.mbodji.backendmodelsis.entities.Role;
import com.ousseynou.mbodji.backendmodelsis.entities.Utilisateur;
import com.ousseynou.mbodji.backendmodelsis.repository.RoleRepository;
import com.ousseynou.mbodji.backendmodelsis.repository.UtilisateurRepository;
import com.ousseynou.mbodji.backendmodelsis.services.interfaces.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
    private final RoleRepository roleRepository;
    @Override
    public Utilisateur addNewUser(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        Utilisateur user = utilisateurRepository.findByUserName(userName);
        Role role = roleRepository.findByRoleName(roleName);
        user.getRoles().add(role);

    }

    @Override
    public Utilisateur findParUserName(String userName) {
        return utilisateurRepository.findByUserName(userName);
    }

    @Override
    public List<Utilisateur> listUsers() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur getUserParId(Long id) {
        return utilisateurRepository.findById(id).get();
    }

    @Override
    public void deleteUser(Long id) {
        utilisateurRepository.deleteById(id);

    }
}
