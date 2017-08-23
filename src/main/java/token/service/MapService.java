package token.service;

import org.springframework.stereotype.Component;

import token.dto.MapDTO;

@Component
public interface MapService {

	MapDTO getMap();

}