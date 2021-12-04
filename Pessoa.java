import java.util.Calendar;

public class Pessoa {

    private String nome, numeroDoCpf, codigoDeAreaDaOperadoraDeTelefone, numeroDotelefone, operadoraDeTelefone;
    private Calendar dataDeNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDoCpf() {
        return numeroDoCpf;
    }

    public void setNumeroDoCpf(String numeroDoCpf) {
        this.numeroDoCpf = numeroDoCpf;
    }

    public String getCodigoDeAreaDaOperadoraDeTelefone() {
        return codigoDeAreaDaOperadoraDeTelefone;
    }

    public void setCodigoDeAreaDaOperadoraDeTelefone(String codigoDeAreaDaOperadoraDeTelefone) {
        this.codigoDeAreaDaOperadoraDeTelefone = codigoDeAreaDaOperadoraDeTelefone;
    }

    public String getNumeroDotelefone() {
        return numeroDotelefone;
    }

    public void setNumeroDotelefone(String numeroDotelefone) {
        this.numeroDotelefone = numeroDotelefone;
    }

    public String getOperadoraDeTelefone() {
        return operadoraDeTelefone;
    }

    public void setOperadoraDeTelefone(String operadoraDeTelefone) {
        this.operadoraDeTelefone = operadoraDeTelefone;
    }

    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}

