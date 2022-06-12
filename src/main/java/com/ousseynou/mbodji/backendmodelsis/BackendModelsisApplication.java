package com.ousseynou.mbodji.backendmodelsis;

import com.ousseynou.mbodji.backendmodelsis.entities.Product;
import com.ousseynou.mbodji.backendmodelsis.entities.ProductType;
import com.ousseynou.mbodji.backendmodelsis.entities.Role;
import com.ousseynou.mbodji.backendmodelsis.entities.Utilisateur;
import com.ousseynou.mbodji.backendmodelsis.services.interfaces.ProductService;
import com.ousseynou.mbodji.backendmodelsis.services.interfaces.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class BackendModelsisApplication implements CommandLineRunner {

    private final ProductService productService;
    private final UtilisateurService userService;

    public static void main(String[] args) {
        SpringApplication.run(BackendModelsisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        ProductType t1 = productService.addTypeProduct(new ProductType(null,"Smartphone", new ArrayList<>()));
        ProductType t2 = productService.addTypeProduct(new ProductType(null,"Laptop", new ArrayList<>()));

        productService.addProduct(new Product(null,"iphone",new Date(),t1));
        productService.addProduct(new Product(null,"MacBook Air",new Date(),t2));


        userService.addNewRole(new Role(null,"ADMIN"));
        userService.addNewRole(new Role(null,"USER"));

        userService.addNewUser(new Utilisateur(null,"mbodji","oussey","oussey94","pwd", new ArrayList<>()));
        userService.addNewUser(new Utilisateur(null,"mbodji","mame","safietou01","pwd", new ArrayList<>()));
        userService.addNewUser(new Utilisateur(null,"mbodji","fatou","ouss946","pwd", new ArrayList<>()));

       */

        //userService.addRoleToUser("oussey94","ADMIN");
        //userService.addRoleToUser("oussey94","USER");
        //userService.addRoleToUser("safietou01","ADMIN");

    }
}
