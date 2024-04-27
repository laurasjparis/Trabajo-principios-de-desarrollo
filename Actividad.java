package com.mycompany.calendapp ;


public class Actividad
{
	private String nombreDia;
	private int tipoPrioridad;
	private int horaActividad;
        private String nombreActividad;
    public Actividad(String nombreDia, int tipoPrioridad, int horaActividad,String nombreActividad) {
        this.nombreDia = nombreDia;
        this.tipoPrioridad = tipoPrioridad;
        this.horaActividad = horaActividad;
        this.nombreActividad = nombreActividad;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTipoPrioridad() {
        return tipoPrioridad;
    }

    public void setTipoPrioridad(int tipoPrioridad) {
        this.tipoPrioridad = tipoPrioridad;
    }
    
    public void setHoraActividad(int horaActividad){
        this.horaActividad = horaActividad;
    }
    
    public int getHoraActividad(){
        return horaActividad;
    }
    
    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }
        public void ingresarActividad(String nombreActividad, String nombreDia, String horaActividad, int tipoPrioridad) {
            
	}

	public void borrarActividad(String nombreActividad) {
	}
	
	public String modificarActividad(String nombreActividad) {
		return "";	
	}
	
	public void remplazarActividad(String nombreActividad) {
            
	}
	public void guardarCambioActividad(String nombreActividad) {

	}
	
	
	
}

