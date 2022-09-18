public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(42);
        cliente.setNombre("Maximiliano");
        cliente.setTelefono(685718796);
        cliente.setCredito(100.000);
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.printf("Credito: " + "%.3f", cliente.getCredito());
        System.out.printf("%n");
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(42);
        trabajador.setNombre("Maximiliano");
        trabajador.setTelefono(685718796);
        trabajador.setSalario(2000);
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

class Persona{
    int Edad;
    String Nombre;
    int Telefono;

    public Persona(){

    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
}

class Cliente extends Persona{
    double Credito;
    public Cliente(){

    }
    public double getCredito() {
        return Credito;
    }

    public void setCredito(double credito) {
        Credito = credito;
    }
}

class Trabajador extends Persona{
    int salario;

    public Trabajador(){

    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
class DecimalFormat{

     DecimalFormat(){

    }
}