import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao do curso java ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descricao do curso C#");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do Bootcamp Java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro Alves");
        devLeandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devLeandro.getConteudosInscritos());
        System.out.println();
        devLeandro.progredir();
        devLeandro.progredir();
        System.out.println("Conteudos inscritos: " + devLeandro.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devLeandro.getConteudosConcluidos());
        System.out.println("XP: " + devLeandro.calcularTotalXp());

        System.out.println();
        System.out.println("--------------");
        System.out.println();

        Dev devKarol = new Dev();
        devKarol.setNome("Karol Alves");
        devKarol.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos: " + devKarol.getConteudosInscritos());
        System.out.println();
        devKarol.progredir();
        devKarol.progredir();
        devKarol.progredir();
        System.out.println("Conteudos inscritos: " + devKarol.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devKarol.getConteudosConcluidos());
        System.out.println("XP: " + devKarol.calcularTotalXp());


    }
}