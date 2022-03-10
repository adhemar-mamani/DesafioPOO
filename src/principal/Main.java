package principal;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();

		curso1.setTitulo("Curso SQL");
		curso1.setDescricao("Manipulando dados...");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();

		curso1.setTitulo("Curso Spring Boot");
		curso1.setDescricao("Criando um microoserviço");
		curso1.setCargaHoraria(10);
		
		Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria SQL");
        mentoria.setDescricao("Professor Barcellos");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Desenvolvendo com java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devMe = new Dev();
        devMe.setNome("Camila");
        devMe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Adhemar:" + devMe.getConteudosInscritos());
        devMe.progredir();
        devMe.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Adhemar:" + devMe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Adhemar:" + devMe.getConteudosConcluidos());
        System.out.println("XP:" + devMe.calcularTotalXp());
        
        System.out.println("===============================================");

        Dev devIsa = new Dev();
        devIsa.setNome("Isabella");
        devIsa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Isabella:" + devIsa.getConteudosInscritos());
        devIsa.progredir();
        devIsa.progredir();
        devIsa.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Isabella:" + devIsa.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Isabella:" + devIsa.getConteudosConcluidos());
        System.out.println("XP:" + devIsa.calcularTotalXp());
        
	}

}
