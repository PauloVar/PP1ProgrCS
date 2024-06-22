
package progracs.practica1progracs;

import javax.swing.JOptionPane;


public class Persona {
    protected String nombre;
    protected String apellido;
   
    
    public Persona(){
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        this.apellido = JOptionPane.showInputDialog("Ingrese el apellido: ");
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = JOptionPane.showInputDialog("Ingrese el apellido: ");
    }
}
