package crowly.library;


public interface IConstants {
	public final String POST_BODY = "{ \"url\":\"@@URL@@\" }";
	
	public final String MCS_URL = "https://westus.api.cognitive.microsoft.com/video/v1.0/detectmotion?sensitivityLevel=low&frameSamplingValue=20";
	
	public final String[] LISTA_VIDEOS = {"http://gdurl.com/wUKE",
			"http://gdurl.com/0mzl",
			"http://gdurl.com/3RaA",
			"http://gdurl.com/jOyZ",
			"http://gdurl.com/1fNL",
			"http://gdurl.com/EZQX",
			"http://gdurl.com/fU4G",
			"http://gdurl.com/XgbG",
			"http://gdurl.com/cJnN"
			
	};
	
	public final String LOCATION_RESULT_URL_KEY = "Operation-Location";
	public final String LOCATION_RESULT_ACCESS_KEY = "apim-request-id";
	public final String CAMBIO_LINEA = "\n";
	
	public final int ESPERA_ENTRE_LLAMADAS = 60000;
	
	public final String MCS_IDKEY = "567860a309a34928859a9deeafe8dd9b";
}
