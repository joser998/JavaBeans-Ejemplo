package manejojavabeans;
import beans.PersonaBean;
import java.util.Scanner;
public class ManejoJavaBenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        PersonaBean bean = new PersonaBean();
        
        System.out.print("Inserta Nombre: ");
        String nombre=sc.nextLine();
        System.out.print("Inserta Edad: ");
        int edad=sc.nextInt();
        
        bean.setNombre(nombre);
        bean.setEdad(edad);
        
        System.out.println("Nombre: "+bean.getNombre());
        System.out.println("Edad: "+bean.getEdad());
        
        /* Usamos el Constructor de la Clase PersonaBean con 2 parametros 'String nombre, int edad' y le establecemos
            estos dos valores, mediante el metodo toString() mostramos estos mismos 2 atributos.     */
        PersonaBean bean2 = new PersonaBean("Daniel", 21);
        System.out.println(bean2);
    }
}