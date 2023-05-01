// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona user1 = new Persona();
        user1.setEdad(24);
        user1.setNombre("Carlos Matías");
        user1.setTelefono("+59587261546");

        System.out.println("El nombre del usuario es " + user1.getNombre() + ". " + "Tiene " + user1.getEdad() + " años, y su teléfono es el " + user1.getTelefono() + "." );
    }
    }

    class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getEdad() {
            return this.edad;
        }

        public String getNombre() {
            return this.nombre;
        }

        public String getTelefono() {
            return this.telefono;
        }

    }