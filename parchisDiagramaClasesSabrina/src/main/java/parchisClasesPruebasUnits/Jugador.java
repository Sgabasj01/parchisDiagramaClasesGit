/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Jugador {

	private String nombre;
	private Tablero tablero;
	private Usuario usuario;
    private Ficha[] fichas = new Ficha[2];
	
	public Jugador(String nombre, Tablero tablero, Usuario usuario) {
		
		this.nombre = nombre;
		this.tablero = tablero;
		this.usuario = usuario;
	    this.fichas[0] = new Ficha(0); 
	    this.fichas[1] = new Ficha(0);
		
	}
	
	 public Usuario getUsuario() {
		 
	        return usuario;
	    }

     public Ficha[] getFichas() {
    	 
        return fichas;
    }
	
	
	public void tirarDado(Dado d) {
		
		d.tirar();
		
	}
	
	public int consultarDado(Dado d) {
		
		return d.mostrarTirada();
		
	}
	
	public int consultarTablero() {
		
		boolean[] casillas = tablero.consultarCasillas();
		
		int posicion = 0;
		
		for (int i = 0; i<tablero.consultarNumCasillas(); i++) {
			
			if (casillas[i]==true) {
				
				posicion = i;
				break;
				
			}
			
		}
		
		return posicion;
		
	}
	 public void moverFicha(Ficha ficha, int casillas) {
		  
		 int posicionActual = ficha.getPosicion();
	        int nuevaPosicion = posicionActual + casillas;

	        if (nuevaPosicion >= tablero.consultarNumCasillas()) {
	            nuevaPosicion = tablero.consultarNumCasillas() - 1; 
	        }

	        ficha.setPosicion(nuevaPosicion);
	        tablero.cambiarFicha(posicionActual, nuevaPosicion);
	    }
	    
	
	public String getNombre(){
		
		return nombre;
		
	}
	
}
