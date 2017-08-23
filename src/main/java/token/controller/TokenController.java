package token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import token.dto.TokenDTO;
import token.service.TokenService;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	@Autowired
	TokenService service;
	
	@PostMapping("/grant")
	public TokenDTO sendToken() {
		return service.getToken();
	} 
	

}
