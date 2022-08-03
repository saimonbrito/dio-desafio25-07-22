import desafio.dominio.*;

import javax.xml.bind.SchemaOutputResolver;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso2 = new Curso();
        curso2.setDescriçao("AWM");
        curso2.setTitulo("banco de dados");
        curso2.setCargaHoraria(20);

        Curso curso1 = new Curso();

        curso1.setTitulo("java");
        curso1.setDescriçao(" API");
        curso1.setCargaHoraria(90);
        Conteudos conteudos1 = new Curso();




        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("web");
        mentoria1.setDescriçao("criando uma pagina");
        mentoria1.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp butcamp1 = new Bootcamp();
        butcamp1.setNome("treinamento java ");
        butcamp1.setDescriçao("dsenvolvimento java fex");
        butcamp1.getConteudos().add(curso1);
        butcamp1.getConteudos().add(curso2);
        butcamp1.getConteudos().add(mentoria1);

        Dev devmauricio = new Dev();
        devmauricio.setNome(" saimom");
        devmauricio.inscreverBootcamp(butcamp1);

        System.out.println("conteudo inscrito Saimon:" + devmauricio.getConteudosIncritos());
        devmauricio.progredir();
        System.out.println("-");
        System.out.println("conteudo inscrito Saimon:" + devmauricio.getConteudosIncritos());
        System.out.println("conteudos concluidos Saimon" + devmauricio.getConteudosConcluidos());
        System.out.println("XP:" + devmauricio.calcularTotalXp());

        System.out.println("---------");

        Dev devsaimom = new Dev();
        devsaimom.setNome("mauricio");
        devsaimom.inscreverBootcamp(butcamp1);

        System.out.println("conteudo inscrito Mauricio:" + devsaimom.getConteudosIncritos());
        devsaimom.progredir();
        System.out.println("-");
        System.out.println("conteudo inscrito Mauricio:" + devsaimom.getConteudosIncritos());
        System.out.println("conteudos concluidos Mauricio" + devsaimom.getConteudosConcluidos());
        System.out.println("XP:" + devsaimom.calcularTotalXp());


    }
}
