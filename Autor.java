
package progracs.practica1progracs;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Autor extends Persona{
    
    private String fechaNac;
    private String nacionalidad;
    
    public String getFechaNac(){
        return fechaNac;
    }
    
    public void setFechaNac(String fechaNac){
        this.fechaNac = fechaNac;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    
    public  Autor(){
        
        super();
        this.fechaNac = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento: ");
        this.nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad: ");
        
    }
    
    public static void crearAutor(List<Autor> autores){
        Autor autor = new Autor();
        autores.add(autor);
        
        JOptionPane.showMessageDialog(null, "Autor agregado correctamente.");
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + " "+ apellido + " \nFecha de Nacimiento: " + fechaNac + " " + "\nNacionalidad: " + nacionalidad;
    }
    
    public static void mostrarListaA(List<Autor> autores){
        
        for (Autor autor : autores){
            JOptionPane.showMessageDialog(null,autor);
        }
    }
    
    
}
    

