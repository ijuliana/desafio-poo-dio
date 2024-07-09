import java.util.ArrayList;
import java.util.List;

// Classe Bootcamp
class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Desenvolvedor> desenvolvedores;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.desenvolvedores = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void removerMentoria(Mentoria mentoria) {
        mentorias.remove(mentoria);
    }

    public void registrarDesenvolvedor(Desenvolvedor dev) {
        desenvolvedores.add(dev);
    }

    public void listarCursos() {
        System.out.println("Cursos do Bootcamp " + nome + ":");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNome());
        }
    }

    public void listarMentorias() {
        System.out.println("Mentorias do Bootcamp " + nome + ":");
        for (Mentoria mentoria : mentorias) {
            System.out.println("- " + mentoria.getTitulo());
        }
    }

    public void listarDesenvolvedores() {
        System.out.println("Desenvolvedores participantes do Bootcamp " + nome + ":");
        for (Desenvolvedor dev : desenvolvedores) {
            System.out.println("- " + dev.getNome());
        }
    }
}

// Classe Curso
class Curso {
    private String nome;
    private int duracao; // em semanas
    private String descricao;
    private List<String> modulos;

    public Curso(String nome, int duracao, String descricao) {
        this.nome = nome;
        this.duracao = duracao;
        this.descricao = descricao;
        this.modulos = new ArrayList<>();
    }

    public void adicionarModulo(String modulo) {
        modulos.add(modulo);
    }

    public void removerModulo(String modulo) {
        modulos.remove(modulo);
    }

    public void listarModulos() {
        System.out.println("Módulos do curso " + nome + ":");
        for (String modulo : modulos) {
            System.out.println("- " + modulo);
        }
    }

    public String getNome() {
        return nome;
    }
}

// Classe Mentoria
class Mentoria {
    private String titulo;
    private String descricao;
    String horario;
    private List<String> mentores;

    public Mentoria(String titulo, String descricao, String horario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.horario = horario;
        this.mentores = new ArrayList<>();
    }

    public void adicionarMentor(String mentor) {
        mentores.add(mentor);
    }

    public void removerMentor(String mentor) {
        mentores.remove(mentor);
    }

    public void alterarHorario(String novoHorario) {
        this.horario = novoHorario;
    }

    public void listarMentores() {
        System.out.println("Mentores da mentoria " + titulo + ":");
        for (String mentor : mentores) {
            System.out.println("- " + mentor);
        }
    }

    public String getTitulo() {
        return titulo;
    }
}

// Classe Desenvolvedor
class Desenvolvedor {
    private String nome;
    @SuppressWarnings("unused")
    private int idade;
    @SuppressWarnings("unused")
    private String nivel;
    private List<Curso> cursosEmAndamento;
    private List<Mentoria> mentoriasAgendadas;

    public Desenvolvedor(String nome, int idade, String nivel) {
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
        this.cursosEmAndamento = new ArrayList<>();
        this.mentoriasAgendadas = new ArrayList<>();
    }

    public void matricularEmCurso(Curso curso) {
        cursosEmAndamento.add(curso);
    }

    public void agendarMentoria(Mentoria mentoria) {
        mentoriasAgendadas.add(mentoria);
    }

    public void cancelarMentoria(Mentoria mentoria) {
        mentoriasAgendadas.remove(mentoria);
    }

    public void listarCursosEmAndamento() {
        System.out.println("Cursos em andamento para " + nome + ":");
        for (Curso curso : cursosEmAndamento) {
            System.out.println("- " + curso.getNome());
        }
    }

    public void listarMentoriasAgendadas() {
        System.out.println("Mentorias agendadas para " + nome + ":");
        for (Mentoria mentoria : mentoriasAgendadas) {
            System.out.println("- " + mentoria.getTitulo() + " - Horário: " + mentoria.horario);
        }
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Programação");

        // Criando cursos
        Curso cursoJava = new Curso("Java Básico", 6, "Introdução ao Java");
        cursoJava.adicionarModulo("Introdução ao Java");
        cursoJava.adicionarModulo("Estruturas de Controle");
        cursoJava.adicionarModulo("OOP com Java");

        Curso cursoPython = new Curso("Python Avançado", 8, "Python para desenvolvimento web");
        cursoPython.adicionarModulo("Introdução ao Python");
        cursoPython.adicionarModulo("Manipulação de Dados com Pandas");
        cursoPython.adicionarModulo("Web Scraping com BeautifulSoup");

        // Criando mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Discussões avançadas sobre Java", "Segundas-feiras às 14h");
        mentoriaJava.adicionarMentor("João");
        mentoriaJava.adicionarMentor("Maria");

        Mentoria mentoriaPython = new Mentoria("Mentoria de Python", "Técnicas avançadas em Python", "Quartas-feiras às 16h");
        mentoriaPython.adicionarMentor("Pedro");
        mentoriaPython.adicionarMentor("Ana");

        // Criando desenvolvedores
        Desenvolvedor dev1 = new Desenvolvedor("Carlos", 25, "Intermediário");
        Desenvolvedor dev2 = new Desenvolvedor("Ana", 23, "Iniciante");

        // Registrando cursos, mentorias e desenvolvedores no bootcamp
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoPython);
        bootcamp.adicionarMentoria(mentoriaJava);
        bootcamp.adicionarMentoria(mentoriaJava);
    }
}
