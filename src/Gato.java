public class Gato extends Felino{
    Gato(){
        super("Felis silvestris catus", "maullido","Ratones","domestico");
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

