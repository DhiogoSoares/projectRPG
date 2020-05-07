public class Atributo {

    //Variable declarations
    private int id;
    private String nome;

    public Atributo(){
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Constructor
    public Atributo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Atributo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
