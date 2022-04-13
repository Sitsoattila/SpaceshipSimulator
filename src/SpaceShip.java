public class SpaceShip {
    private String nombre;
    private String matriculaGalactica;
    private float aceleracion;
    private float velocidadX;
    private float velocidadY;
    private float coordenadaX;
    private float coordanadaY;
    private float direccionX;
    private float direccionY;

    public SpaceShip(String nombre, String matriculaGalactica, float aceleracion) {
        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
        this.velocidadX = 0;
        this.velocidadY = 0;
        this.coordenadaX = 0;
        this.coordanadaY = 0;
        this.direccionX = 0;
        this.direccionY = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaGalactica() {
        return matriculaGalactica;
    }

    public void setMatriculaGalactica(String matriculaGalactica) {
        this.matriculaGalactica = matriculaGalactica;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(float velocidadX) {
        this.velocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(float velocidadY) {
        this.velocidadY = velocidadY;
    }

    public float getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public float getCoordanadaY() {
        return coordanadaY;
    }

    public void setCoordanadaY(float coordanadaY) {
        this.coordanadaY = coordanadaY;
    }

    public float getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(float direccionX) {
        this.direccionX = direccionX;
    }

    public float getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(float direccionY) {
        this.direccionY = direccionY;
    }

    public void speedUp(){
        velocidadX = velocidadX + aceleracion;
        coordenadaX = coordenadaX + velocidadX;
    }
}
