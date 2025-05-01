package com.example.scolarite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scolarite.entities.Utilisateur;
import com.example.scolarite.entities.Utilisateur.Role;
import com.example.scolarite.services.IUtilisateurService;

@SpringBootApplication
public class ProjetApplication implements CommandLineRunner{
	@Autowired
	IUtilisateurService us;

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Utilisateur etudiant = new Utilisateur();
        etudiant.setUsername("essra_hmida");
        etudiant.setPassword("essra"); 
        etudiant.setEmail("essra@email.com");
        etudiant.setRole(Role.ETUDIANT);
        us.creerUtilisateur(etudiant);
        
		
	}

}
