

import java.awt.Container;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;

import org.json.JSONArray;
import org.json.JSONObject;


import crowly.VideoProcesor;
import crowly.library.FileManager;

import java.io.IOException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;



public class test2 {

	private String HTMLres="";
	private File savefile = new File("E:\\Crowly-GUID.html");

	public static void main(String[] args) throws Exception {
		/*ScatterChartFormat
		ArrayList<ArrayList> array = new ArrayList();
		ArrayList arrayin1 = new ArrayList();
		ArrayList arrayin2 = new ArrayList();
		ArrayList arrayin3 = new ArrayList();
		arrayin1.add("'Tiempo'");
		arrayin1.add("'Personas'");
		arrayin2.add(8);
		arrayin2.add(12);
		arrayin3.add(4);
		arrayin3.add(5);
		array.add(arrayin1);
		array.add(arrayin2);
		array.add(arrayin3);
*//*BarChartFormat
		ArrayList<ArrayList> array = new ArrayList();
		ArrayList arrayin1 = new ArrayList();
		ArrayList arrayin2 = new ArrayList();
		ArrayList arrayin3 = new ArrayList();
		ArrayList arrayin4 = new ArrayList();

		arrayin1.add("'Hora'");
		arrayin1.add("'Personas'");
		arrayin2.add("'Mañana'");
		arrayin2.add(2);
		arrayin3.add("'MedioDia'");
		arrayin3.add(3);
		arrayin4.add("'Noche'");
		arrayin4.add(5);
		array.add(arrayin1);
		array.add(arrayin2);
		array.add(arrayin3);
		array.add(arrayin4);*/
		
		ArrayList<ArrayList> array = new ArrayList();
		ArrayList arrayin1 = new ArrayList();
		ArrayList arrayin2 = new ArrayList();
		ArrayList arrayin3 = new ArrayList();

		arrayin1.add("'tiempo'");
		arrayin1.add("'cuerpos'");

		
		arrayin2.add("'0'");
		arrayin2.add(10);

		arrayin3.add("'5'");
		arrayin3.add(12);
		

		
		array.add(arrayin1);
		array.add(arrayin2);
		array.add(arrayin3);


		FileManager toolfile = new FileManager();
		File Archivo  = new File("E:\\LineChart.txt");
		String  scatter = toolfile.readText(Archivo);
		String primera = scatter.substring(0, 628);
		String segunda = scatter.substring(628);
		String res = primera+array.toString()+segunda;
		System.out.println(array.toString());
		test2 test = new test2();
		test.setHTMLres(res);
		test.SaveChart();
		test.Openinbrowser();
	}
	public String getHTMLres() {
		return HTMLres;
	}
	public void setHTMLres(String hTMLres) {
		HTMLres = hTMLres;
	}
	public File getSavefile() {
		return savefile;
	}
	public void setSavefile(File savefile) {
		this.savefile = savefile;
	}
	public void Openinbrowser() throws IOException {
		Desktop.getDesktop().browse(savefile.toURI());
	}
	public void SaveChart() {
			FileManager toolsave = new FileManager();	
				toolsave.writeText(savefile, HTMLres);

	}
}



