package token.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import token.dto.MapDTO;

@Component
public class MapServiceImpl implements MapService {
	
	
	/* (non-Javadoc)
	 * @see token.service.MapService#getMap()
	 */
	@Override
	public MapDTO getMap() {
		Map<String, String> keys = new HashMap<>();
		keys.put("a", "b");
		keys.put("c", "d");
		keys.put("e", "f");
		keys.put("g", "h");
		
		MapDTO mapDTO = new MapDTO();
		
		mapDTO.setAge(35);
		mapDTO.setName("Alfa");
		mapDTO.setKeys(keys);
		
		return mapDTO;
	}

}
