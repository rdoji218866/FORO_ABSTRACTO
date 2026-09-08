public class Perro extends Canino{
    Perro(){
        super("Canis lupus familiaris", "ladrido","carnivoro","domestico");
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
