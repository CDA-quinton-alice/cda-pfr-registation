package fr.afpa.projetregistation.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;

import fr.afpa.projetregistation.dto.UtilisateurDto;
import fr.afpa.projetregistation.utils.Constantes;

public class LoginController {

	@GetMapping("/user")
	public ResponseEntity<UtilisateurDto> currentUser(HttpSession session) {
		UtilisateurDto userDto = (UtilisateurDto) session.getAttribute(Constantes.UTILISATEUR_EN_COURS);
		if (userDto == null) {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			userDto = new UtilisateurDto();
			userDto.setMatricule(authentication.getName());
			for (GrantedAuthority role : authentication.getAuthorities()) {
				String roleEnt = role.getAuthority();

				if (roleEnt == "ROLE_RESPONSABLE") {
					userDto.setResponsable(true);
				} else {
					userDto.setResponsable(false);
				}

				break;
			}
		}
		session.setAttribute(Constantes.UTILISATEUR_EN_COURS, userDto);
		return ResponseEntity.ok(userDto);
	}
}