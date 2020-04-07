package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/**
 * 
 * Contrôleur qui gère l'affichage de la liste des collaborateurs
 * 
 * @author Xavier CALLOCH
 *
 */
public class ListerCollaborateursController extends HttpServlet {
	
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// utilisation du service
		List<Collaborateur> listeCollabs = collabService.listerCollaborateurs();
		
		req.setAttribute("listeCollaborateurs", listeCollabs);
		
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
		
	}

}

