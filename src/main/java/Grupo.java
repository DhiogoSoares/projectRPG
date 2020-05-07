public class Grupo {

    //Variable declarations
    private int id;
    private String valor;
    private String nome;

    public Grupo(){
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Constructor
    public Grupo(int id, String valor, String nome) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
