package ADVENTUREGAME;

public class coordenadas {
	private static final int x = 0 ; 
	private static final int y = 1; 
	
	private String heroes ; 
	private String enemigos;
	private String Objinmuebles ; 
	private String Objmuebles;
	
	
	public coordenadas(String heroes , String Objmuebles , String Objinmuebles ) {
		
		this.heroes= heroes ;
		this.enemigos = enemigos ; 
		this.Objinmuebles = Objinmuebles;
		this.Objmuebles = Objmuebles;
		
		
	

}


	public String getHeroes() {
		return heroes;
	}


	public void setHeroes(String heroes) {
		this.heroes = heroes;
	}


	public String getEnemigos() {
		return enemigos;
	}


	public void setEnemigos(String enemigos) {
		this.enemigos = enemigos;
	}


	public String getObjinmuebles() {
		return Objinmuebles;
	}


	public void setObjinmuebles(String objinmuebles) {
		Objinmuebles = objinmuebles;
	}


	public String getObjmuebles() {
		return Objmuebles;
	}


	public void setObjmuebles(String objmuebles) {
		Objmuebles = objmuebles;
	}


	public static int getX() {
		return x;
	}


	public static int getY() {
		return y;
	}
