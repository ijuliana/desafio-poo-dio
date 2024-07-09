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