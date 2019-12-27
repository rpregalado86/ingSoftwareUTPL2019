package proyect_metodos;

import java.io.File;
import java.io.IOException;

public class MetodoUsuario {
    File archivoUser = new File("Usuario.txt");
  
    public MetodoUsuario() throws IOException {
        verificarArchivo();
    }
    @SuppressWarnings("unchecked")

   private void verificarArchivo() throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(!archivoUser.exists()){
            archivoUser.createNewFile();
            System.out.println("Archivo TXT creado localmente en el directorio del proyecto");
        }
        else{
            System.out.println("El archivo existe");
        }
    }
  
}


