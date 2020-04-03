package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
		ServletException, IOException {
		
		String matriculeParam = req.getParameter("matricule");
		
		resp.setContentType("text/html");
		
		if (matriculeParam == "") {
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu");
		}
		else if (!matriculeParam.isEmpty()) {
			resp.setStatus(200);
			resp.getWriter().write("<!doctype html><html><body>" + "<h1>Edition de collaborateur</h1>"
					+ "<p>Matricule : " + matriculeParam + "</p></body>");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
		ServletException, IOException {
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		if (matriculeParam.isEmpty() || titreParam.isEmpty() || nomParam.isEmpty()
				|| prenomParam.isEmpty()) {
			resp.setStatus(400);
			resp.getWriter().write("Les paramètres suivants sont incorrects : ");
		}
		else if (matriculeParam.isEmpty() || titreParam.isEmpty() || nomParam.isEmpty()
				|| prenomParam.isEmpty()) {
			resp.setStatus(201);
			resp.getWriter().write("Creation d’un collaborateur avec les informations suivantes :\n" +
					"matricule=" + matriculeParam + ",titre=" + titreParam + ",nom=" + nomParam
					+ ",prenom=" + prenomParam);
		}
	}

}
