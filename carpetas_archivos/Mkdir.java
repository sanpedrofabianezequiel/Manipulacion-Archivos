package carpetas_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Mkdir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos una nueva Carpeta y con el metodo escribir lo rellanamos de informacion
		File  ruta=new File("C:"+File.separator+"Users"+File.separator+"Ezequiel"+File.separator+"Desktop"+File.separator+"Programas"+File.separator+"Java"+File.separator+"NuevoDirectorio");
		
		
		//Creamos la carpeta
			if(!ruta.exists()) {
				
				ruta.mkdir();
			}
				
		
		//Creamos un nuevo archivo
		File  rutaFile=new File("C:"+File.separator+"Users"+File.separator+"Ezequiel"+File.separator+"Desktop"+File.separator+"Programas"+File.separator+"Java"+File.separator+"NuevoDirectorio"+File.separator+"ezequiel.txt");
			try {
				rutaFile.createNewFile();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}			
		//Escribimos dentro del archivo creado
		String rutaFileCasteada=rutaFile.getAbsolutePath();//Devuelve String de la Ruta absoluta
		Escribiendo mivar=new Escribiendo();
	
			mivar.escribiendo(rutaFileCasteada);
		//----------------------------------------------------------------DELETE
			
		
		File rutaDelete =new File("C:"+File.separator+"Users"+File.separator+"Ezequiel"+File.separator+"Desktop"+File.separator+"Programas"+File.separator+"Java"+File.separator+"NuevoDirectorio"+File.separator+"borrado.txt");
	
		try {
			rutaDelete.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		rutaDelete.delete();	//Borramos en la ruta seleccionada
		
	
	}

}

class Escribiendo {
	
	//Recibe un paramatro respecto al archivo a escribir en cuestion
	public void escribiendo(String URL) {
		String parrafo="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint obcaecat cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		
		try {
			FileWriter cursor=new FileWriter(URL);	//Creamos una instancia para escribir
			
			//Escribimos caracter a caracter
				for (int i = 0; i< parrafo.length();i++) {
					
					cursor.write(parrafo.charAt(i));
						
				}
			
				cursor.close();//Siempre cerrar la conexion
					
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}








