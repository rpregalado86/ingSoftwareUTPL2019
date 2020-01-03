package proyect_metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodoBoleto {
    File archivo = new File("Boleto.txt");
    String resultadoBoleto [] = new String [8];
    String [][]datos;
    
        
    //guarda datos en el vector
    public MetodoBoleto () throws IOException{
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
    
    private void leerArchivo() throws FileNotFoundException, IOException{
        String linea = null;
        int numeroRegistros=0;
        BufferedReader leerFicheroBoleto = new BufferedReader(new FileReader(archivo));
        while ((linea = leerFicheroBoleto.readLine()) != null) { 
            numeroRegistros+=1;
        }
        leerFicheroBoleto.close();
        if(numeroRegistros==0)
            System.out.println("ARCHIVO BOLETO.TXT VACIO");
        else{
            datos = new String[numeroRegistros][8];
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
                datos[posicion][5] = mistokens.nextToken().trim();
                datos[posicion][6] = mistokens.nextToken().trim();
                datos[posicion][7] = mistokens.nextToken().trim();
                posicion+=1;
            }
            leerArchivo.close();       
        } 
    }
}
