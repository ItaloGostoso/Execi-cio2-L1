package q1;

public class Paciente {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private int planoSaude;
    private String alergia;
    private String tipoSanguineo;
                                    
    public Paciente(int codigo, String nome, String dataNascimento,String sexo,int planoSaude, String alergia, String tipoSanquineo){
        this.codigo = codigo;
        this.nome = nome;
        this.alergia = alergia;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.tipoSanguineo = tipoSanquineo;       
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.cod = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.nome = Nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(int planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getAlergia() {
        return Alergia;
    }

    public void setAlergia(String alergia) {
        this.Alergia = Alergia;
    }

    public String gettipoSanguineo() {
        return tipoSanguineo;
    }

    public void settipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    
}
