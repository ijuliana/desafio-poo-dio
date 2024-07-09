import java.util.ArrayList;
import java.util.List;

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