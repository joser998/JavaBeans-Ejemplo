package beans;

import java.io.Serializable;

public class PersonaBean implements Serializable{
    /* Un Java Bean es una clase normal de Java, pero cada miembro debe de ser de tipo privado */
    private String nombre;
    private int edad;
    
    /* Debe de tener siempre un Constructor Vacio, es posible tambien tener mas Constructores, no es necesario pero 
        podemos tenerlos.  */
    public PersonaBean(){
    }
    
    /*  Constructor para inicializar los atributos */
    public PersonaBean(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /* Por cada atributo privado, es necesario tener los metodos Getters y Setters */
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    /* Se debe tambien de implementar la interface Serializable, esto solo es necesario si enviaremos nuestra clase
        mediante la red. 
        Lo que hace esta interfaz es convertir nuestro objeto en unos y ceros.  */

    @Override
    public String toString() {
        return "\n\nPersonaBean " + "Nombre: " + nombre + ", Edad: " + edad;
    }   
}