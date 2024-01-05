public class Persona implements Comparable<Persona>{

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public String toString(){
        return this.nombre + " -> " + this.edad + " años";
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.edad, o.getEdad());
    }

}
