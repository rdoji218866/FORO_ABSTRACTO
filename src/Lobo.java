public class Lobo extends Canino {
    Lobo(){
        super("Canis lupus", "aullido","carnivoro","bosque");
    }

    @Override
    public String getNombreCientifico() {
        return NombreCientifico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimento() {
        return alimento;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

}
