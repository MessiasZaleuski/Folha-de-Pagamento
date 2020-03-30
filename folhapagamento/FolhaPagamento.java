
package folhapagamento;

/**
 *
 * @author messi
 */
public class FolhaPagamento {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("lurdes","11111111111","999999999");
        v1.setSalario(1500);
        v1.setComissao(50);
        v1.setQuantvendas(20);
        System.out.println(v1.getDados()+"\n");
        
        Motorista m1 = new Motorista("João","22222222222","888888888");
        m1.setSalario(2000);
        System.out.println(m1.getDados());
        
    }
    
}
