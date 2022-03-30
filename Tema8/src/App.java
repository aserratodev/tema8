public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        persona.setNombre("Andrés");
        System.out.println("Soy " + persona.getNombre());
        persona.setEdad(30);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelefono(325968125);
        System.out.println("Mi número telefónico es " + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}