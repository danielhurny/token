package token;

import org.springframework.beans.factory.annotation.Value;

public class TokenProperties {
	
	@Value("${sfdc.auth.url}")
	private String url;
	
	@Value("${sfdc.credential.client.id}")
	private String clientId;
	
	@Value("${sfdc.credential.client.secret}")
	private String clientSecret;
	
	@Value("${sfdc.credential.grant.type}")
	private String type;
	
	@Value("${sfdc.credential.password}")
	private String password;
	
	@Value("${sfdc.credential.username}")
	private String username;
	
	@Value("${sfdc.credential.completeurl}")
	private String completeUrl;
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCompleteUrl() {
		return completeUrl;
	}

	public void setCompleteUrl(String completeUrl) {
		this.completeUrl = completeUrl;
	}
	
	

}
