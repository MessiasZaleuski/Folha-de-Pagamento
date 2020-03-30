
package folhapagamento;

/**
 *
 * @author messi
 */
public class Vendedor extends Funcionario {
    
    private int quantvendas;
    private double comissao;
    
    public Vendedor(String nome, String cpf, String telefone) {//Método construtor
        super(nome, cpf, telefone);
    }
    
    @Override
    public double getsalario(){
        return this.salario + (this.quantvendas * this.comissao);
        
    }

    public int getQuantvendas() {
        return quantvendas;
    }

    public void setQuantvendas(int quantvendas) {
        this.quantvendas = quantvendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
}
