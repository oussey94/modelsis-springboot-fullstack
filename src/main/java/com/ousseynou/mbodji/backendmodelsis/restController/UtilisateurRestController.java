package com.ousseynou.mbodji.backendmodelsis.restController;

import com.ousseynou.mbodji.backendmodelsis.entities.Role;
import com.ousseynou.mbodji.backendmodelsis.entities.Utilisateur;
import com.ousseynou.mbodji.backendmodelsis.services.interfaces.UtilisateurService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UtilisateurRestController {
    private final UtilisateurService userService;

    @GetMapping
    public List<Utilisateur> getAllUsers(){
        return userService.listUsers();
    }

    @GetMapping("/{id}")
    public Utilisateur getUser(@PathVariable("id") Long id){
        return userService.getUserParId(id);
    }

    @PutMapping("/{id}")
    public Utilisateur updateUser(@PathVariable("id") Long id, @RequestBody Utilisateur user){
        Utilisateur u = userService.getUserParId(id);

        u.setPrenom(user.getPrenom());
        u.setNom(user.getNom());
        u.setPassword(user.getPassword());
        u.setUserName(user.getUserName());

        return userService.addNewUser(user);
    }

    @GetMapping(path ="/login/{userName}")
    public Utilisateur getUserByUsername(@PathVariable("userName") String userName){
        return userService.findParUserName(userName);
    }

    @PostMapping
    public Utilisateur addUser(@RequestBody Utilisateur user){
        return userService.addNewUser(user);
    }

    @PostMapping("/roles")
    public Role addRole(@RequestBody Role role){
        return userService.addNewRole(role);
    }

    @PostMapping("/addRoleUser")
    public void addRoleUser(@RequestBody AddRoleUser addRoleUser){
        userService.addRoleToUser(addRoleUser.getUserName(), addRoleUser.getRoleName());

    }
}

@Data
class AddRoleUser{
    private String userName;
    private String roleName;
}