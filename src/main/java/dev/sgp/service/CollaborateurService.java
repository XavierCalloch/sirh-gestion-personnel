package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

/**
 * Représente un service en mode développement qui sauvegarde les données en mémoire uniquement
 * 
 * @author Xavier CALLOCH
 *
 */
public class CollaborateurService {
	
	/** liste de collaborateurs */
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	/** Constructeur
	 * 
	 */
	public CollaborateurService() {
		
	}
	
	/** Constructeur
	 * @param listeCollaborateurs	liste de collaborateurs
	 */
	public CollaborateurService(List<Collaborateur> listeCollaborateurs) {
		this.listeCollaborateurs = listeCollaborateurs;
	}

	/**
	 * 
	 * Méthode qui retourne la liste des collaborateurs
	 * 
	 * @return List<Collaborateur>
	 */
	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}

	/**
	 * 
	 * Méthode qui sauvegarde un collaborateur
	 * 
	 * @param collab
	 */
	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}

}
