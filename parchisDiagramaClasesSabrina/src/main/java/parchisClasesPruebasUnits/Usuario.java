package parchisClasesPruebasUnits;

public class Usuario {
	
	private String nombreUsuario;
	
	private String email;
	
	public Usuario(String nombreUsuario, String email) {
		
	       this.nombreUsuario = nombreUsuario;
	       this.email = email;
	}

    public String getNombreUsuario() {
    	
        return nombreUsuario;
    }

    public String getEmail() {
    	
        return email;
    }

}
