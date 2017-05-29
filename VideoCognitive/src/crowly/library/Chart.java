package crowly.library;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Chart {
	private File savefile = new File("E:\\Crowly-GUID.html");
	private String HTMLres="";

	public File getSavefile() {
		return savefile;
	}

	public void setSavefile(File savefile) {
		this.savefile = savefile;
	}

	public String getHTMLres() {
		return HTMLres;
	}

	public void setHTMLres(String hTMLres) {
		HTMLres = hTMLres;
	}

	public void Openinbrowser() throws IOException {
		Desktop.getDesktop().browse(savefile.toURI());
	}

	public void crearChart(ArrayList<ArrayList> data) {
	}

	public void SaveChart() {
		if (HTMLres.length() != 0) {
			FileManager toolsave = new FileManager();
			savefile.delete();
			
			try {
				savefile.createNewFile();
				toolsave.writeText(savefile, HTMLres);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
