public class Leon extends Felino{
    Leon(){
        super("Panthera Leo","Rugido","Carnivoro", "Pradera");
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
