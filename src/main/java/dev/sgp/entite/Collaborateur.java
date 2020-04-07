package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * Représente un collaborateur
 * 
 * @author Xavier CALLOCH
 *
 */
public class Collaborateur {

	/** matricule */
	private String matricule;

	/** nom */
	private String nom;

	/** prénom */
	private String prenom;

	/** date de naissance */
	private LocalDate dateNaissance;

	/** adresse */
	private String adresse;

	/** numéro de sécurité sociale */
	private String numSecu;

	/** email professionnel */
	private String emailPro;

	/** photo */
	private String photo;

	/** date-heure de création */
	private ZonedDateTime dateHeureCreation;

	/** statut actif ou non */
	private Boolean actif;

	/** Constructeur
	 * @param matricule			matricule
	 * @param nom				nom
	 * @param prenom			prénom
	 * @param dateNaissance		date de naissance
	 * @param adresse			adresse
	 * @param numSecu			numéro de sécurité sociale
	 * @param emailPro			email professionnel
	 * @param photo				photo
	 * @param dateHeureCreation	date-heure de création
	 * @param actif				statut actif ou non
	 */
	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateNaissance, String adresse,
			String numSecu, String emailPro, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numSecu = numSecu;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}

	/** Getter
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/** Setter
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/** Setter
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return the numSecu
	 */
	public String getNumSecu() {
		return numSecu;
	}

	/** Setter
	 * @param numSecu the numSecu to set
	 */
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}

	/** Getter
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}

	/** Setter
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	/** Getter
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/** Setter
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/** Getter
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	/** Setter
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	/** Getter
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}

	/** Setter
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}

}
