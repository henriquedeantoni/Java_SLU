package Module6;

public class AClass {
    private String nome;

    public AClass(String nome) throws Exception {
        if (nome == null || nome.isEmpty()) {
            throw new Exception("Erro: O nome não pode ser nulo ou vazio!");
        }
        this.nome = nome;
        System.out.println("Objeto OneClass criado com sucesso! Nome: " + this.nome);
    }
}
