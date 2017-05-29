package crowly.library;

import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class VideoResponse {
	private String VideoResponseURL;
	private String VideoKey;
	private String Content;
	private boolean Procesado;
	
	public VideoResponse(String pURL, String pKey, String pContent)
	{
		VideoResponseURL = pURL;
		VideoKey = pKey;
		Content = pContent;
		Procesado = false;
	}


	public String getVideoResponseURL() {
		return VideoResponseURL;
	}

	public void setVideoResponseURL(String videoResponseURL) {
		VideoResponseURL = videoResponseURL;
	}

	public String getVideoKey() {
		return VideoKey;
	}

	public void setVideoKey(String videoKey) {
		VideoKey = videoKey;
	}

	public boolean isProcesado() {
		return Procesado;
	}

	public void setProcesado(boolean procesado) {
		Procesado = procesado;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	
	
}
