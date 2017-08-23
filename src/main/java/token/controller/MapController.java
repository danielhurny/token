package token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import token.dto.MapDTO;
import token.service.MapService;

@RestController
@RequestMapping("/map")
public class MapController {
	
	@Autowired
	MapService mapService;
	
	@GetMapping
	public MapDTO getMap() {
		
		return mapService.getMap();
	}

}
