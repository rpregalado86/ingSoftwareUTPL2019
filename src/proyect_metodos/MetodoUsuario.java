package proyect_metodos;

import java.io.File;
import java.io.IOException;

public class MetodoUsuario {
    File archivoUser = new File("Usuario.txt");//Almacenamiento en el mismo directorio del proyecto
  
    public MetodoUsuario() throws IOException {
        verificarArchivo();
    }
    @SuppressWarnings("unchecked")

   private void verificarArchivo() throws IOException {
        
        if(!archivoUser.exists()){//Verifica si existe el archivo
            archivoUser.createNewFile();// En caso que no exista lo crea.
            System.out.println("Archivo TXT creado localmente en el directorio del proyecto");
        }
        else{
            System.out.println("El archivo existe");
        }
    }
  
}


