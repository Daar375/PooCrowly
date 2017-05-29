package crowly.library;

import java.io.File;
import java.util.ArrayList;

public class LineChart extends Chart{
	
	public void crearChart(ArrayList<ArrayList> videos){
		FileManager toolfile = new FileManager();
		File Archivo  = new File("E:\\LineChart.txt");
		String  scatter = toolfile.readText(Archivo);
		String primera = scatter.substring(0, 628);
		String segunda = scatter.substring(628);
		ArrayList data = new ArrayList();
		int index = 0;
		ArrayList tags = new ArrayList();

		tags.add("'tiempo'");
		tags.add("'cuerpos'");
		data.add(tags);
		double tiempo =0;
		double largodevideo=0;

			while(index!=videos.size()){
				int index2=0;
				ArrayList<TimeLapse> timelapses = videos.get(index);
				while(timelapses.size()!=index2){
					double tiempoanterior = tiempo;
					tiempo=largodevideo+((double)Math.round(timelapses.get(index2).getStart()* 10) / 10);
					if(tiempoanterior!=tiempo){
						ArrayList info = new ArrayList();

						info.add("'"+tiempo+"'");
						info.add(timelapses.get(index2).BodyCount());
						data.add(info);
					}
					index2++;

				}
				largodevideo=tiempo;

				index++;
			}
		
		

		
		String res = primera+data.toString()+segunda;
		setHTMLres(res);
        SaveChart();

	}
	

}
