import java.time.LocalDate;

import DesafioDio.Bootcamp;
import DesafioDio.Curso;
import DesafioDio.Dev;
import DesafioDio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Maria" + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());

        System.out.println("------");

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Vinicius" + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Vinicius" + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Vinicius" + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devVinicius.calcularTotalXp());

        System.out.println("------");

        Dev devJucelio = new Dev();
        devJucelio.setNome("Jucelio");
        devJucelio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jucelio" + devJucelio.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Jucelio" + devJucelio.getConteudosInscritos());
        devJucelio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Jucelio" + devJucelio.getConteudosConcluidos());
        System.out.println("XP:" + devJucelio.calcularTotalXp());

    }

    private static void devJuceliosetNome(String string) {
    }
}