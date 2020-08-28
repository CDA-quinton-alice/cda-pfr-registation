package fr.afpa.projetregistation.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Cette classe regroupe les informations recueillies par les contrôleurs et
 * manipulées dans les interfaces et classe service notamment
 * MaterielSericeImpl.
 * 
 * @author Aurélien
 * @version 1.0
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MaterielDto {

	/**
	 * La ref ou référence sert d'identifiant au MaterielDto. Unique, non
	 * modifiable, auto-implémenté.
	 * 
	 */
	private int ref;

	/**
	 * La marque correspond au constructeur du matériel en cours.
	 */
	private String marque;

	/**
	 * Le modele permet de savoir quelle version du matériel est utilisée.
	 */
	private String modele;

	/**
	 * Le prix correspond au prix d'achat du matériel.
	 */
	private double prix;

	/**
	 * La localisation correspond à la situation précise du matériel dans la
	 * station-service et permet de faciliter la prise en charge lors de certains
	 * évènements.
	 */
	private String localisation;

	/**
	 * L'etat renseigne sur la capacité du matériel à réaliser sa tache. Le chiffre
	 * renseigne sur l'état actuel à savoir 1 = OK, 2 = alerte si le fonctionnement
	 * est possible mais altéré et 3= Hors service.
	 */
	private String etat;

	/**
	 * Date à laquelle le matériel a été acheté.
	 */
	private Date dateAchat;

	/**
	 * Nom du type de matériel auquel le matériel en cours correspond. Exemple :
	 * pompe, cuve, machine à café...
	 */
	private String labelMateriel;

}