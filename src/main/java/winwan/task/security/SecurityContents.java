package winwan.task.security;

public class SecurityContents {
	
	public static final String SIGN_UP_URLS = "/api/users/**";
	
	public static final String H2_URL = "h2-console/**";
	
	public static final String SECRET = "SecreteKeyToGenJWTs";
	
	public static final String TOKEN_PREFIX ="Bearer ";	
	
	public static final String HEADER_STRING ="Authorization";
	
	public static final long EXPIRATION_TIME = 300000; //  milliseconds
	
}

