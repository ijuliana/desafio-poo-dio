import java.util.ArrayList;
import java.util.List;

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
