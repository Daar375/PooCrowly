package crowly;

import java.util.ArrayList;

import crowly.connectors.MSClient;
import crowly.library.Cuerpo;
import crowly.library.IConstants;
import crowly.library.VideoResponse;

public class VideoProcesor implements IConstants
{
	private MSClient MsClient;
	private ArrayList<ArrayList> CuerposTodosLosVideos;
	
	public VideoProcesor()
	{
		MsClient = new MSClient();
	}
	
	public void analizarVideos()
	{
		try 
		{
			for(String urlVideo : LISTA_VIDEOS) {
				MsClient.procesarVideo(urlVideo);
				Thread.sleep(ESPERA_ENTRE_LLAMADAS);
				System.out.println("Analizando videos...");

			}
			
			Thread.sleep(6000);
			
			for(VideoResponse video : MsClient.getVideosPendientes()) {
				Thread.sleep(ESPERA_ENTRE_LLAMADAS);
				System.out.println("Analizando respuesta...");

				MsClient.procesarRespuestaVideo(video);
			}
			
			for(VideoResponse video : MsClient.getVideosPendientes()) {
				System.out.println(video.getContent());
				System.out.println();

			}
			MsClient.cargarCuerpos();
			
			CuerposTodosLosVideos = MsClient.getVideos();
			

		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	

	public MSClient getMsClient() {
		return MsClient;
	}

	public void setMsClient(MSClient msClient) {
		MsClient = msClient;
	}

	public ArrayList<ArrayList> getCuerposTodosLosVideos() {
		return CuerposTodosLosVideos;
	}

	public void setCuerposTodosLosVideos(ArrayList<ArrayList> cuerposTodosLosVideos) {
		CuerposTodosLosVideos = cuerposTodosLosVideos;
	}
}
