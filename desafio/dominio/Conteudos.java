package desafio.dominio;

public abstract class Conteudos {
    protected static final double xp_padra = 10d;


    private String titulo;
    private  String descriçao;

    public abstract  double CaucularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
}
