package desafio.dominio;

public class Curso extends Conteudos {

    private int cargaHoraria;

    public Curso() {
    }
    @Override
    public double CaucularXp() {
        return xp_padra * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descriçao='" + getDescriçao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}

