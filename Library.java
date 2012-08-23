class  Library{
    String nombre;
    String codigo;
	int cantidad;
    boolean disponibilidad;
    Books[] basedatoslibros;

    Library (){
    }

    Library( String _nombre,
                String _codigo,int _cantidad,
                boolean _disponibilidad,
                Books[] _basedatoslibros){
        nombre = _nombre;
        codigo = _codigo;
        cantidad = _cantidad;
		disponibilidad = _disponibilidad;
        basedatoslibros = _basedatoslibros;
    }

    void imprimirLibreria(){
        System.out.println("Base de datos libros");
        
        for(int i=0; i<basedatoslibros.length; i++){
            Books temporal = basedatoslibros[i];
            System.out.println(temporal.nombre + temporal.codigo + temporal.cantidad + temporal.disponibilidad);
        }
    }

    public static void main(String[] args){
        Books[] temas = new Books[5];
        temas[0] = new Books("Matematicas Discretas-ROSEN", " 111  ", 3, true);
        temas[1] = new Books("Logica de Programacion y algoritmos", " 112 ", 1 , true);
        temas[2] = new Books("Software Engineering", " 113 ", 2 , true);
        temas[3] = new Books("Introduccion a la Teoria general de sistemas", " 114 ", 2 , true);
        temas[4] = new Books("Modelacion de Sistemas de Informacion", " 115 ", 3  , true );
	
	temas[0].setNombre("Teoria de grafos");//cambie nombre primer libro funcion setnombre en libros esta definida
    temas[1].prestar(false);//preste Logica de Programacion y algoritmos posicion 1
	temas[0].prestar(false);//preste Matematicas Discretas-ROSEN que ahora es Teoria de Grafos
        Library ejemplar = new Library("Christian", "625156",6, true, temas);//creacion ejemplo ejemplar
temas[0].devolver(true);//se devuelve Teoria de Grafos

        ejemplar.imprimirLibreria();
      
    }
}
  