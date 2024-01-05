public class Main {
    public static void main(String[] args) {
        ColaDePrioridad cq = new ColaDePrioridad();
        cq.agregar(new Persona("Mia",15));
        cq.agregar(new Persona("Ema", 26));
        cq.agregar(new Persona("Gaby", 22));
        System.out.println(cq);
        System.out.println("Se dejo salir a: " + cq.dejarSalir());
    }
}