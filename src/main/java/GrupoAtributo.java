public class GrupoAtributo{

    //Variable declarations
    private int id;
    private int idGrupoPai;
    private int idGrupoFilho;
    private int idAtributo;

    public GrupoAtributo(){
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdGrupoPai() {
        return idGrupoPai;
    }

    public void setIdGrupoPai(int idGrupoPai) {
        this.idGrupoPai = idGrupoPai;
    }

    public int getIdGrupoFilho() {
        return idGrupoFilho;
    }

    public void setIdGrupoFilho(int idGrupoFilho) {
        this.idGrupoFilho = idGrupoFilho;
    }

    public int getIdAtributo() {
        return idAtributo;
    }

    public void setIdAtributo(int idAtributo) {
        this.idAtributo = idAtributo;
    }

    //Constructor
    public GrupoAtributo(int id, int idGrupoPai, int idGrupoFilho, int idAtributo) {
        this.id = id;
        this.idGrupoPai = idGrupoPai;
        this.idGrupoFilho = idGrupoFilho;
        this.idAtributo = idAtributo;
    }

    @Override
    public String toString() {
        return "GrupoAtributo{" +
                "id=" + id +
                ", idGrupoPai=" + idGrupoPai +
                ", idGrupoFilho=" + idGrupoFilho +
                ", idAtributo=" + idAtributo +
                '}';
    }
}
