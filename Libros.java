
package progracs.practica1progracs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;


public class Libros {
    
    private String titulo;
    private String autor;
    private String fechaPubli;
    private String genero;
    private boolean dispo;
    private String tipo;
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getFechaPubli(){
        return fechaPubli;
    }
    
    public void setFechaPubli(String fechaPubli){
        this.fechaPubli = fechaPubli;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public boolean getDispo(){
        return dispo;
    }
    
    public void setDispo(boolean dispo){
    this.dispo = dispo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public Libros(){
        this.titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro.");
        this.autor = JOptionPane.showInputDialog("Ingrese el nombre del autor del libro.");
        this.fechaPubli = JOptionPane.showInputDialog("Ingrese la fecha de publicacion.");
        this.genero = JOptionPane.showInputDialog("Ingrese el genero.");
        this.dispo = true;
        this.tipo = JOptionPane.showInputDialog("Ingrese el tipo de libro. ");
    }
    
    public static void crearLibro(List<Libros> libros){
        
        JOptionPane.showMessageDialog(null, "Ingrese los siguientes datos para agregar un libro al sistema. ");
        Libros libro = new Libros();
        libros.add(libro);
        
        
        JOptionPane.showMessageDialog(null, "Libro agregado correctamente.");
    }
    
    @Override
    public String toString(){
        return "Titulo: " + titulo + "\nAutor: "+ autor + "\nFecha de publicacion: " + fechaPubli + "\nGenero:" + genero + "\nTipo: " + tipo + "\nDisponible: " + dispo;
    }
    
    public static void mostrarListaL(List<Libros> libros){
        
        for (Libros libro : libros){
            JOptionPane.showMessageDialog(null,libro);
        }
    }
    
   /* public static void buscarYprestarLibro(String titulo){
        int token;
        String tokenStr = JOptionPane.showInputDialog("Ingrese la ID del usuario solicitante: ");
        
        
        List<Libros> listaLibros = new ArrayList<>();
        for (Libros libro : listaLibros ){
            if (libro.getTitulo().equals(titulo)){
                libro.setDispo(false);
                HashMap<Integer, Libros> hashU = new HashMap<>();
                token = Integer.parseInt(tokenStr);
                hashU.put(token, libro);   
                JOptionPane.showMessageDialog(null,"El libro ha sido prestado.");
            }else{
                JOptionPane.showMessageDialog(null, "El libro no esta disponible para prestar: ");
            }
            if (libro != null){
                JOptionPane.showMessageDialog(null, "El libro no existe en la biblioteca, no puede ser prestado.");
            }*/
    
    
    
}
        


