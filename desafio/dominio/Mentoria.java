package desafio.dominio;

import java.time.LocalDate ;

public class Mentoria extends  Conteudos {

    private LocalDate date;


    @Override
    public double CaucularXp() {
        return 0;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate() {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descriçao='" + getDescriçao() + '\'' +
                ", date=" + date +
                '}';
    }

    public void setDate(LocalDate now) {
    }


}
