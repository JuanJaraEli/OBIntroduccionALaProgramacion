public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(24);
        cliente1.setNombre("Fernando");
        cliente1.setTelefono("+54 894 789 888");
        cliente1.setCredito(1000);

        System.out.println("Nuestro primer cliente se llama " + cliente1.getNombre() + ", tiene " + cliente1.getEdad() + " años y su crédito es de " + cliente1.getCredito() + " euros. \n" + "Su número de teléfono es: " + cliente1.getTelefono() + ".");
        System.out.println("\n");
        
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(42);
        trabajador1.setNombre("Juan");
        trabajador1.setTelefono("+54 789 336 212");
        trabajador1.setSalario(2600);

        System.out.println("Nuestro primer empleado se llama " + trabajador1.getNombre() + ", tiene " + trabajador1.getEdad() + " años y su salario es de " + trabajador1.getSalario() + " euros. \n" + "Su número de teléfono es: " + trabajador1.getTelefono() + ".");
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
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

class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}