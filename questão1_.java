public class Paciente {

   int String codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;	
 
   public Paciente(int codigo, String nome, String dataNasc, String sexo, String planoSaude, String alergia, String tipoSang){

        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNasc;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSang;
     
     public int getCodigo(){
        return this.codigo;
    }

    public String getNome (){
        return this.nome;
    }

    public String getDataNascimento (){
        return this.dataNascimento;
    }

    public String getSexo (){
        return this.dataNascimento;
    }

    public String getPlanoSaude (){
        return this.planoSaude;
    }

    public String getAlergia (){
        return this.alergia;
    }

    public String getTipoSanguineo (){
        return this.tipoSanguineo;
    }

    //Métodos para modificação dos atributos
    public void setCodigo(int cod){
        this.codigo = codigo;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setDataNascimento (String data) {
        this.dataNascimento = data;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }

    public void setAlergia (String alergia) {
        this.alergia = alergia;
    }

    public void setTipoSanguineo (String tipoSang) {
        this.tipoSanguineo = tipoSang;
    }

    public void setPlanoSaude(String planoSaude){
        this.planoSaude = planoSaude;
    }
}
