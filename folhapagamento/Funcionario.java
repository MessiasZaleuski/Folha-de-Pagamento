
package folhapagamento;

/**
 *
 * @author messias
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    protected double salario;
    

    public Funcionario(String nome, String cpf, String telefone) {//método construtor
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public double getsalario(){
        return this.salario;
        
    }
    public String getDados(){
        return "Nome: " + this.getNome()+"\nTelefone: "+this.getTelefone()+"\nSalário: "+ String.format("%.2f", this.getsalario());
    }
}

