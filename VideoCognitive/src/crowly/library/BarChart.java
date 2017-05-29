package crowly.library;

import java.io.File;
import java.util.ArrayList;

public class BarChart extends Chart{
	
	public void crearChart(ArrayList<ArrayList> videos){
		FileManager toolfile = new FileManager();
		File Archivo  = new File("E:\\BarChart.txt");
		String  scatter = toolfile.readText(Archivo);
		String primera = scatter.substring(0, 326);
		String segunda = scatter.substring(326);
		
		System.out.println("Creadando bar");
		ArrayList<ArrayList> data = new ArrayList();
		ArrayList arrayin1 = new ArrayList();
		ArrayList arrayin2 = new ArrayList();
		ArrayList arrayin3 = new ArrayList();
		ArrayList arrayin4 = new ArrayList();

		arrayin1.add("'Hora'");
		arrayin1.add("'Personas'");

		arrayin2.add("'Primera hora'");
		int index= 0;
		int personas = 0;
		double tiempo =0;
		double largodevideo=0;
		while(index!=3){
			int index2=0;
			ArrayList<TimeLapse> timelapses = videos.get(index);
			while(timelapses.size()!=index2){
				double tiempoanterior = tiempo;
				tiempo=largodevideo+((double)Math.round(timelapses.get(index2).getStart()* 10) / 10);
				if(tiempoanterior!=tiempo){
				personas= personas+ timelapses.get(index2).BodyCount();
				
				}
				index2++;
			}
			index++;
			largodevideo=tiempo;

		}
		arrayin2.add(personas);

		arrayin3.add("'Segunda hora'");
		personas = 0;

		while(index!=6){
			int index2=0;
			ArrayList<TimeLapse> timelapses = videos.get(index);
			while(timelapses.size()!=index2){
				double tiempoanterior = tiempo;
				tiempo=largodevideo+((double)Math.round(timelapses.get(index2).getStart()* 10) / 10);
				if(tiempoanterior!=tiempo){
				personas= personas+ timelapses.get(index2).BodyCount();
				}
				index2++;

			}
			index++;
			largodevideo=tiempo;


		}
		arrayin3.add(personas);

		
		
		
		arrayin4.add("'Tercera hora'");
		personas = 0;

		while(index!=9){
			int index2=0;
			ArrayList<TimeLapse> timelapses = videos.get(index);
			while(timelapses.size()!=index2){
				double tiempoanterior = tiempo;
				tiempo=largodevideo+((double)Math.round(timelapses.get(index2).getStart()* 10) / 10);
				if(tiempoanterior!=tiempo){
				personas= personas+ timelapses.get(index2).BodyCount();
				}
				index2++;

			}
			index++;
			largodevideo=tiempo;


		}
		arrayin4.add(personas);


		
		data.add(arrayin1);
		data.add(arrayin2);
		data.add(arrayin3);
		data.add(arrayin4);
		
		
		
		
		String res = primera+data.toString()+segunda;
		setHTMLres(res);

        SaveChart();

	}
	

}
