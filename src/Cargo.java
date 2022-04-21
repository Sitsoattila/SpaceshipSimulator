public class Cargo extends SpaceShip{
    final int CARGA_MAXIMA = 5;
    private int[] carga = new int [CARGA_MAXIMA];

    public Cargo(String nombre, String matriculaGalactica, float aceleracion, int[] carga) {
        super(nombre, matriculaGalactica, aceleracion);
        this.carga = carga;
    }

    public int getCARGA_MAXIMA() {
        return CARGA_MAXIMA;
    }

    public int[] getCarga() {
        return carga;
    }

    public void setCarga(int[] carga) {
        this.carga = carga;
    }

    public void load(){
        int container = 1;
        for (int i = 0; i >= CARGA_MAXIMA; i++){
            if(carga[i]!= 0){
                carga[i] = container;
            }else{
                System.out.println("Está lleno");
            }
        }
    }

    public void unload(){
        for (int i = 0; i >= CARGA_MAXIMA; i++ ){

        }
    }
}
