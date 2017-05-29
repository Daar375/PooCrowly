

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



public class test {



	public static void main(String[] args) throws Exception {


		FileManager toolfile = new FileManager();
		File Archivo  = new File("E:\\test.txt");
		String  jsonString = toolfile.readText(Archivo);
		JSONObject json = new JSONObject(jsonString);
		JSONArray arrayjson = new JSONArray();
		arrayjson = json.getJSONArray("fragments");
		int index=0;
		double timesacle = json.getInt("timescale");
		double start = (int) arrayjson.getJSONObject(0).get("start");
		System.out.println(start);
		// arrayjson=json.getJSONArray("fragments");
		 double i =  0.004184;
		 
		// System.out.println((double) Math.round(i * 2) / 2.0);
		 
		 
		//System.out.println(arrayjson.getJSONObject(1).getJSONArray("events").getJSONArray(2));
		//System.out.println(arrayjson.getJSONObject(0).getJSONArray("events").getJSONArray(0).length());
		
		//System.out.println("x:"+arrayjson.getJSONObject(20).getJSONArray("events").getJSONArray(0).getJSONObject(0).getJSONArray("locations").getJSONObject(0).get("x"));
		//System.out.println("y:"+arrayjson.getJSONObject(20).getJSONArray("events").getJSONArray(0).getJSONObject(0).getJSONArray("locations").getJSONObject(0).get("y"));
		//System.out.println("x:"+arrayjson.getJSONObject(20).getJSONArray("events").getJSONArray(2).getJSONObject(0).getJSONArray("locations").getJSONObject(0).get("x"));
		//System.out.println("y:"+arrayjson.getJSONObject(20).getJSONArray("events").getJSONArray(2).getJSONObject(0).getJSONArray("locations").getJSONObject(0).get("y"));

	}

}

