package token.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import token.TokenProperties;
import token.dto.TokenDTO;

@Component
public class TokenServiceImpl implements TokenService {

	@Autowired
	TokenProperties tokenProperties;
	
	RestTemplate restTemplate = new RestTemplate();
	String url = "https://test.salesforce.com/services/oauth2/token";
	 
	
	public TokenDTO getToken() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
//		params.add("grant_type", tokenProperties.getType());
		params.add("client_id",	tokenProperties.getClientId());
		params.add("client_secret",	tokenProperties.getClientSecret());
//		params.add("redirect_uri",	tokenProperties.getUrl());
		params.add("username",	tokenProperties.getUsername());
		params.add("password",	tokenProperties.getPassword());
		
		
		System.out.println(tokenProperties.getPassword());
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(params, headers);
		TokenDTO token = restTemplate.postForObject(tokenProperties.getCompleteUrl(),params,TokenDTO.class);
		return token;
		
	}
	
}
