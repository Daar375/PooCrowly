package crowly.library;

import java.util.Date;
import java.util.UUID;

public class Cuerpo {
	private double PosX;
	private double PosY;
	private double segundo;
	private UUID Id;

	public Cuerpo(double pX, double pY, double videoTime)
	{
		Id = UUID.randomUUID();
		segundo = videoTime;
		PosY = (double) Math.round(pY * 2) / 2.0;;
		PosX = (double) Math.round(pX * 2) / 2.0;;
	}






	public double getSegundo() {
		return segundo;
	}






	public void setSegundo(double segundo) {
		this.segundo = segundo;
	}






	public double getPosX() {
		return PosX;
	}




	public void setPosX(double posX) {
		PosX = (double)Math.round(posX * 2) / 2.0;
	}



	public double getPosY() {
		return PosY;
	}



	public void setPosY(double posY) {
		PosY = (double) Math.round(posY * 2) / 2.0;
	} 



	public UUID getId() {
		return Id;
	}

	public void setId(UUID id) {
		Id = id;
	}
	
	
}
