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
	
	public Jugador(String nombre, Tablero tablero) {
		
		this.nombre = nombre;
		this.tablero = tablero;
		
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
	
	public void moverFicha(int cs) {
		
		int origen = consultarTablero();
		tablero.cambiarFicha(origen, origen+cs);;
		
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
}
