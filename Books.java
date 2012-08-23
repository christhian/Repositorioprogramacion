class Books{
    String nombre;
    String codigo;
    int cantidad;
    boolean disponibilidad;
    

    Books(String nombre, String codigo, int cantidad, boolean disponibilidad){
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.disponibilidad = disponibilidad;
      
    }

    void setNombre(String nombreNuevo){
		this.nombre = nombreNuevo;
	}
	 void prestar(boolean disponibilidad){
		this.disponibilidad = false;
		System.out.println("Temporalmente no esta disponible el libro   "+nombre);
		
	}
	 void devolver(boolean disponibilidad){
		this.disponibilidad = true;
		
		System.out.println("A partir de este momento esta disponible el libro  "+nombre);
	}

}