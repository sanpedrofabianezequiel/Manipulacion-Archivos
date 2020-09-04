package carpetas_archivos;

import java.io.File;

public class AccesoArchivosCarpetas {

	public static void main(String[] args) {
		
		
		File ruta=new File("C:\\Users\\Ezequiel\\Desktop\\Programas\\EducacionIT");
		
		//Imprimimos la ruta absoluta 
		System.out.println(ruta.getAbsolutePath());
		
		//Listamos todo la informacion con var.list() =>extends File
		String[] archivos=	ruta.list();
		
	
		//Recorremos el archivoList() correspondiente a la ubicacion del Path
		for (int i = 0; i < archivos.length; i++) {
			//En primer lugar imprimimimos las carpetas/archivos superiores
			System.out.println(archivos[i]);
			
			//Determinamos una nueva instancia para los directorios
			//(rutaAbsoluta,archivo en cuestion => analizando = carpeta/archivo)
			File carpetas= new File(ruta.getAbsolutePath(),archivos[i]);
			
			//Si es un directorio lo iteramos y obtenemos sus archivos
			if (carpetas.isDirectory()) {
				//si es un Directorio lo almacenamos y Listamos en un array
				String[] subCarpetas=carpetas.list();
				
				//Imprimimos el sbudirectorio iterado
				for (int j = 0; j < subCarpetas.length; j++) {
					System.out.println(subCarpetas[j]);
				}		
			}
			
			
		}
		
		
		
		

	}
	
}
