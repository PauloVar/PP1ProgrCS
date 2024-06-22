
package progracs.practica1progracs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;


public class Usuario extends Persona{
    
    private String direccion;
    private int telefono;
    private int id;
    public static HashMap<Integer, Usuario> hashU = new HashMap<>();
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDirecciono(String direccion){
        this.direccion = direccion;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public Usuario(){
        super();
        this.direccion = JOptionPane.showInputDialog("Ingrese su direccion(Ciudad, Pais): ");
        String telefonoStr = JOptionPane.showInputDialog("Ingrese su numero de telefono: ");
        this.telefono = Integer.parseInt(telefonoStr);
        String idStr = JOptionPane.showInputDialog("Ingrese su numero de identificacion: ");
        this.id = Integer.parseInt(idStr);
        
    }
    
    public static void crearUsuario(List<Usuario> usuarios){
        
        JOptionPane.showMessageDialog(null, "Ingrese los siguientes datos para registrar un usuario al sistema. ");
        Usuario usuario = new Usuario();
        usuarios.add(usuario);
        
        
        hashU.put(usuario.getID(), usuario);
        
        JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + " "+ apellido + " \nDireccion: " + direccion + " " + "\nTelefono: " + telefono + "\nID: " + id;
    }
    
    public static void mostrarUsuario(){
        int token;
        
        String tokenStr = JOptionPane.showInputDialog("Ingrese la ID del usuario a consultar: ");
        
        token = Integer.parseInt(tokenStr);
        
        JOptionPane.showMessageDialog(null, "Informacion del usuario: "+ token + "\n" + hashU.get(token));
        }
}

