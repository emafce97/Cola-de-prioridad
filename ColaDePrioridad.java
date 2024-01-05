import java.util.PriorityQueue;

public class ColaDePrioridad {

    private PriorityQueue<Persona> personas;

    public ColaDePrioridad(){
        this.personas = new PriorityQueue<Persona>();
    }

    public void agregar(Persona p){
        this.personas.add(p);
    }

    public Persona dejarSalir(){
        return this.personas.poll();
    }

    public Persona getPrimeraPersona(){
        return this.personas.peek();
    }

    public int getCantPersonas(){
        return this.personas.size();
    }

    public String toString(){
        String personas = "";
        for(Persona p: this.personas){
            personas += p.toString() + "\n";
        }
        return personas;
    }
}
