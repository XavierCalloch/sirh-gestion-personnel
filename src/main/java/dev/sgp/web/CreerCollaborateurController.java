package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/**
 * 
 * Contrôleur qui gère la création d'un collaborateur
 * 
 * @author Xavier CALLOCH
 *
 */
public class CreerCollaborateurController extends HttpServlet {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		String dateNaissParam = req.getParameter("dateNaissance");
		String adresseParam = req.getParameter("adresse");
		String numSecuParam = req.getParameter("numSecu");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		LocalDate localDateNaiss = LocalDate.parse(dateNaissParam, formatter);

		ResourceBundle app = ResourceBundle.getBundle("application");

		StringBuilder debEmailPro = new StringBuilder(prenomParam);
		debEmailPro.append(".");
		debEmailPro.append(nomParam);
		debEmailPro.append("@");
		debEmailPro.append(app.getString("application.suffixe"));
		String emailPro = debEmailPro.toString();
		
		String matricule = String.valueOf(Math.random() * 10);
		
		Collaborateur collab = new Collaborateur(matricule, nomParam, prenomParam, localDateNaiss, adresseParam,
				numSecuParam, emailPro, "photo.jpg", ZonedDateTime.now(), true);

		if (nomParam == null || prenomParam == null || dateNaissParam == null || adresseParam == null
				|| numSecuParam == null) {
			resp.setStatus(400);
			resp.getWriter().write("Veuillez remplir tous les champs");
			req.setAttribute("collaborateur", collab);
			req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
		}
		else if (numSecuParam != null && numSecuParam.length() != 15) {
			resp.setStatus(400);
			resp.getWriter().write("Veuillez saisir un numero de securité sociale à 15 chiffres");
			req.setAttribute("collaborateur", collab);
			req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
		}
		else {
			collabService.sauvegarderCollaborateur(collab);
			resp.sendRedirect(req.getContextPath() + "/lister");
		}

	}

}
