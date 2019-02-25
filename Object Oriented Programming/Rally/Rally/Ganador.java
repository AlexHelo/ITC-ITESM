class Ganador extends Usuario {
    @Override
    public void avanzar(String a, int cuanto) {
        System.out.println("Hola soy " + nombre + " y gané.");
    }
}