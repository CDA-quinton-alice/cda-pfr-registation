package fr.afpa.projetregistation.service;

import java.util.List;

import fr.afpa.projetregistation.dto.UtilisateurDto;

public interface IUtilisateurService {

	UtilisateurDto create(UtilisateurDto pUtilisateur);

	UtilisateurDto updateUtilisateur(UtilisateurDto pUtilisateur);

	UtilisateurDto getUtilisateurByMatricule(String pMatricule);

	UtilisateurDto getUtilisateurByName(String pNom);

	/**
	 * Retourne la liste de tous les utilisateurs
	 * 
	 * @return List de UtilisateurDto
	 */
	List<UtilisateurDto> getAllUtilisateurs(int pPageEnCours);

	/**
	 * Permet de retourner une liste de tous les emlpoyés (boolean responsable =
	 * false)
	 * 
	 * @return List de UtilisateurEntity qui sont des employés
	 */
	List<UtilisateurDto> getAllEmployes(int pPageEnCours);

	/**
	 * Permet de retourner une liste de tous les responsables (boolean responsable =
	 * true)
	 * 
	 * @return List de UtilisateurEntity qui sont des responsables
	 */
	List<UtilisateurDto> getAllResponsables(int pPageEnCours);

	public void deleteUtilisateurByMatricule(String pMatricule);

	public boolean authentification(String login, String motdepasse);

//	public boolean validerEvenement(EvenementEntity pEvent);
}