package TP8;

public class Browser {
	public String navigate(String url) {
		//Résolution de nom
		String ip = retrieveIP(url);
		//Aller chercher la page web
		String html = fetchWebPage(ip);
		return html;
	}
	private String retrieveIP(String url) {
		return "127.0.0.1";
	}
	
	private String fetchWebPage(String ip) {
		return "<html><head></head><body></body></html>";
	}
	
	
	
	
}
