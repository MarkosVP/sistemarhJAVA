package rh_java;

/**
 * Classe que contém os dados dos Candidatos
 *
 * @author marco
 */
public class Candidato {
    //Inicializando Variáveis
    private String nome;
    private String sobrenome;
    private String cpf;
    private String pais;
    private String cidade;
    private String estado;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    public static String PROP_NOME = "nome";
    public static String PROP_SOBRENOME = "sobrenome";
    public static String PROP_CPF = "cpf";
    public static String PROP_PAIS = "pais";
    public static String PROP_CIDADE = "cidade";
    public static String PROP_ESTADO = "estado";
    public static String PROP_CEP = "cep";
    public static String PROP_LOGRADOURO = "logradouro";
    public static String PROP_NUMERO = "numero";
    public static String PROP_BAIRRO = "bairro";

    //Getters
    public String getPais() {return pais;}
    public String getNome() {return nome;}
    public String getEstado() {return estado;}
    public String getSobrenome() {return sobrenome;}
    public String getCpf() {return cpf;}
    public String getLogradouro() {return logradouro;}
    public String getCep() {return cep;}
    public String getCidade() {return cidade;}
    public String getNumero() {return numero;}
    public String getBairro() {return bairro;}

    //Setters
    public void setCidade(String cidade) {this.cidade = cidade;}
    public void setNome(String nome) {this.nome = nome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setEstado(String estado) {this.estado = estado;}
    public void setPais(String pais) {this.pais = pais;}
    public void setCep(String cep) {this.cep = cep;}
    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}
    public void setNumero(String numero) {this.numero = numero;}
    public void setBairro(String bairro) {this.bairro = bairro;}
    
}
