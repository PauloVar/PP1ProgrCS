
package progracs.practica1progracs;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Biblioteca {

    
    public static void main(String[] args) {
        
        int opcion;
        List<Autor> listaAutores = new ArrayList<>();
        List<Libros> listaLibros = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        
            do{

                String opcionStr = JOptionPane.showInputDialog
                        ("Escoga la opcion correspondiente a su necesidad: "
                        + "\n1.Agregar un libro al sistema."
                        + "\n2.Ver listado de libros."
                        + "\n3.Agregar autor al sistema."
                        + "\n4.Mostrar lista de autores registrados."
                        + "\n5.Registrar usuario."
                        + "\n6.Ver perfil de usuario."
                        + "\n7.Registrar prestamo de libro.");

                opcion = Integer.parseInt(opcionStr);

                switch (opcion){

                    case 1:
                        Libros.crearLibro(listaLibros);
                        break;
                    case 2:
                        Libros.mostrarListaL(listaLibros);
                        break;
                    case 3:
                        Autor.crearAutor(listaAutores);
                        break;
                    case 4:
                        Autor.mostrarListaA(listaAutores);
                        break;
                    case 5:
                        Usuario.crearUsuario(usuarios);
                        break;
                    case 6:
                        Usuario.mostrarUsuario();
                        break;
                    /*case 7:
                        Libros.buscarYprestarLibro(JOptionPane.showInputDialog("Ingrese el titulo del libro a prestar."));
                        break;*/
                }
            }while (opcion != 7);
        
           
        }
    }    