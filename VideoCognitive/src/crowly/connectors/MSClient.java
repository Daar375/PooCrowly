package crowly.connectors;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import crowly.library.*;

public class MSClient implements IConstants {
	private ArrayList<ArrayList> Videos;
	private ArrayList<VideoResponse> VideosPendientes;

	public ArrayList<ArrayList> getVideos() {
		return Videos;
	}

	public ArrayList<VideoResponse> getVideosPendientes() {
		return VideosPendientes;
	}

	public MSClient() {
		Videos = new ArrayList<ArrayList>();
		VideosPendientes = new ArrayList<VideoResponse>();
	}

	public void procesarVideo(String pURLVideo) {
		// puedo tener el URL hardcoded y aqui armo el PayLoad
		String payload = POST_BODY.replace("@@URL@@", pURLVideo);
		VideoResponse videoResp = HttpRequestor.post(MCS_URL, payload, MCS_IDKEY);
		if (videoResp != null) {
			VideosPendientes.add(videoResp);
		}
	}

	public void procesarRespuestaVideo(VideoResponse videoResponse) {
		HttpRequestor.get(videoResponse, MCS_IDKEY);
	}

	public void cargarCuerpos() {
		int index = 0;
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;
		System.out.println("CargandoCuerpos..");

		while (VideosPendientes.size() != index) {
			ArrayList<TimeLapse> VideoTiempos = new ArrayList();
			JSONObject json = new JSONObject(VideosPendientes.get(index).getContent());
			JSONArray arrayjson = new JSONArray();
			double x = 0;
			double y = 0;
			System.out.println(json);

			double timesacle = json.getInt("timescale");
			System.out.println(index);
			if (json.has("fragments")) {
				arrayjson = json.getJSONArray("fragments");
				while (index2 != arrayjson.length()-1) {
					double start = (int) arrayjson.getJSONObject(index2).get("start");
					double duration = (int) arrayjson.getJSONObject(index2).get("duration");
					TimeLapse time = new TimeLapse();
					time.setStart(start/timesacle/60);
					System.out.println(time.getStart());
					time.setEND(((start+duration)/timesacle)/60);
					VideoTiempos.add(time);
					
					
					if (arrayjson.getJSONObject(index2).has("events")) {
						while (index3 != arrayjson.getJSONObject(index2).getJSONArray("events").length()-1) {

							
							
						
							
							if (arrayjson.getJSONObject(index2).getJSONArray("events").getJSONArray(index3).length()!=0) {
								if (arrayjson.getJSONObject(index2).getJSONArray("events").getJSONArray(index3).getJSONObject(0).has("locations")) {
									
									x = (double) arrayjson.getJSONObject(index2).getJSONArray("events")
											.getJSONArray(index3).getJSONObject(0).getJSONArray("locations")
											.getJSONObject(0).get("x");
									y = (double) arrayjson.getJSONObject(index2).getJSONArray("events")
											.getJSONArray(index3).getJSONObject(0).getJSONArray("locations")
											.getJSONObject(0).get("y");
									Cuerpo cuerpo = new Cuerpo(x, y,(((duration+start))+(index3*1000))/timesacle );
									time.getBodies().add(cuerpo);
									break;
								}
							}
							index3++;
						}
						
					}
					index2++;
					index3=0;
				}


			}
			index++;
			index2=0;
			Videos.add(VideoTiempos);
		}
	}
}
