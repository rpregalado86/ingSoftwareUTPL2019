
package proyect_metodos;


import java.io.BufferedReader;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MetodoPasajero {
    File archivo = new File("Pasajero.txt");
    String resultadoPasajero [] = new String [5];
    String [][]datos;
    
        
    //guarda datos en el vector
    public MetodoPasajero () throws IOException{
        verificarArchivo(); 
    }
    
    private void verificarArchivo() throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(!archivo.exists()){
            archivo.createNewFile();
            System.out.println("Archivo TXT creado en el Directorio local del proyecto");
        }
        else
        {
            System.out.println("El archivo ya existe");
            leerArchivo();
        }
    }
    //guardar archivo txt
    private void leerArchivo() throws FileNotFoundException, IOException{
        String linea = null;
        int numeroRegistros=0;
        BufferedReader leerFicheroPasajero = new BufferedReader(new FileReader(archivo));
        while ((linea = leerFicheroPasajero.readLine()) != null) { 
            numeroRegistros+=1;
        }
        leerFicheroPasajero.close();
        if(numeroRegistros==0)
            System.out.println("ARCHIVO PASAJERO.TXT VACIO");
        else{
            datos = new String[numeroRegistros][5];
            int posicion=0;
            String line = null;
            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
            while ((line = leerArchivo.readLine()) != null) {   
                StringTokenizer mistokens = new StringTokenizer(line,"\t");
                datos[posicion][0] = mistokens.nextToken().trim();
                datos[posicion][1] = mistokens.nextToken().trim();
                datos[posicion][2] = mistokens.nextToken().trim();
                datos[posicion][3] = mistokens.nextToken().trim();
                datos[posicion][4] = mistokens.nextToken().trim();
                posicion+=1;
            }
            leerArchivo.close();       
        } 
    }
    
    public String [] ObtenerPasajero(String cedula) throws IOException{
        
        leerArchivo();
        int encontrado=0;
        boolean enc=false;
        for (int i = 0; i < datos.length; i++) {
                if(datos[i][0].equals(cedula)){
                    encontrado=i;
                    enc=true;
                    break;
                }
        }     
        
        if(enc!=false){
            resultadoPasajero [0] =datos[encontrado][0];
            resultadoPasajero [1] =datos[encontrado][1];
            resultadoPasajero [2] =datos[encontrado][2];
            resultadoPasajero [3] =datos[encontrado][3];
            resultadoPasajero [4] =datos[encontrado][4];
        }else{
            resultadoPasajero [0] =null;
        }
        return resultadoPasajero;
    }
}
