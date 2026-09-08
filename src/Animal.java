public abstract class Animal {
    protected String NombreCientifico;
    protected String sonido;
    protected String alimento;
    protected String habitat;

    Animal(String NombreCientifico, String sonido, String alimento, String habitat){
        this.NombreCientifico = NombreCientifico;
        this.sonido = sonido;
        this.alimento = alimento;
        this.habitat = habitat;
    }

    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimento();
    public abstract String getHabitat();
}
