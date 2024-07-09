import java.util.ArrayList;
import java.util.List;


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