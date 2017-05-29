package crowly.library;

import java.io.File;
import java.util.ArrayList;

public class ScatterChart extends Chart {
	String HTMLpart1;

	public void crearChart(ArrayList<ArrayList> videos) {
		FileManager toolfile = new FileManager();
		File Archivo = new File("E:\\ScatterChart.txt");
		String scatter = toolfile.readText(Archivo);
		String primera = scatter.substring(0, 338);
		String segunda = scatter.substring(338);
		ArrayList<ArrayList> data = new ArrayList();
		ArrayList tags = new ArrayList();

		tags.add("'Tiempo'");
		tags.add("'Cuerpo'");
		data.add(tags);
		double tiempo = 0;
		int index = 0;
		double largodevideo=0;

		while (index != videos.size()) {
			int index2 = 0;
			ArrayList<TimeLapse> timelapses = videos.get(index);
			while (timelapses.size() != index2) {
				if (timelapses.get(index2).BodyCount() != 0) {
					double tiempoanterior = tiempo;

					tiempo=largodevideo+((double)Math.round(timelapses.get(index2).getStart()* 10) / 10);

					if(tiempoanterior!=tiempo){
						ArrayList info = new ArrayList();

					info.add(tiempo);
					info.add(timelapses.get(index2).BodyCount());
					data.add(info);
					}
				}
				index2++;

			}
			largodevideo=tiempo;

			index++;
		}

		String res = primera + data.toString() + segunda;
		System.out.println(res);

		setHTMLres(res);
		SaveChart();

	}

}
