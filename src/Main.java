/*Para practicar la encapsulación:

        Crear clase Persona.

        Crear variables las privadas edad, nombre y telefono de la clase Persona.

        Crear gets y sets de cada propiedad.

        Crear un objeto persona en el main.

        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.*/
public class Main {

    public static void main(String[] args) {
        int num1, num2;
        Persona persona = new Persona();
        persona.setEdad(37);
        persona.setNombre("Carlos Hernandez");
        persona.setTelefono(941105432);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
    static class Persona{
        //Declaracion de variable privadas
        private int Edad;
        private String Nombre;
        private int Telefono;

        //Implementacion de setters para la clase persona
        public void setEdad(int Edad){this.Edad = Edad;}
        public void setNombre(String Nombre){this.Nombre=Nombre;}
        public void setTelefono(int telefono) {this.Telefono = telefono;}

        //Implementacion de getters para la clase persona
        public int getEdad(){return Edad;}
        public String getNombre(){return Nombre;}
        public int  getTelefono(){return Telefono;}
    }
    }