package desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
     private String nome;
     private String descriçao;
     private final LocalDate dataInicial = LocalDate.now();
     private final  LocalDate dataFinal = dataInicial.plusDays(45);
     private Set<Dev> devsIncritos = new HashSet<>();
     private Set<Conteudos> conteudos = new LinkedHashSet<>();

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getDescriçao() {
          return descriçao;
     }

     public void setDescriçao(String descriçao) {
          this.descriçao = descriçao;
     }

     public LocalDate getDataInicial() {
          return dataInicial;
     }

     public LocalDate getDataFinal() {
          return dataFinal;
     }

     public Set<Dev> getDevsIncritos() {
          return devsIncritos;
     }

     public void setDevsIncritos(Set<Dev> devsIncritos) {
          this.devsIncritos = devsIncritos;
     }

     public Set<Conteudos> getConteudos() {
          return conteudos;
     }

     public void setConteudos(Set<Conteudos> conteudos) {
          this.conteudos = conteudos;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Bootcamp bootcamp = (Bootcamp) o;
          return Objects.equals(nome, bootcamp.nome) && Objects.equals(descriçao, bootcamp.descriçao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsIncritos, bootcamp.devsIncritos) && Objects.equals(conteudos, bootcamp.conteudos);
     }

     @Override
     public int hashCode() {
          return Objects.hash(nome, descriçao, dataInicial, dataFinal, devsIncritos, conteudos);
     }
}
