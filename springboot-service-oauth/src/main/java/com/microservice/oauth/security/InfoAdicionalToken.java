package com.microservice.oauth.security;

import org.springframework.stereotype.Component;

import com.microservice.commons.users.entity.Usuario;
import com.microservice.oauth.service.UsuarioService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
@Component
public class InfoAdicionalToken implements TokenEnhancer{

	@Autowired
	private UsuarioService service;
		
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication){
		Map<String, Object> info = new HashMap<>();
		
		Usuario user = service.findByUsername(authentication.getName());
		info.put("nombre", user.getNombre());
		info.put("apellido", user.getApellido());
		info.put("correo", user.getEmail());
		info.put("claimPrueba", "Valor de prueba");
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}
