import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 3);
        Matriz orig2 = new Matriz(3, 3);
       
        double[][] m = orig.getMatriz();
        double[][] m2 = orig2.getMatriz();
       
        m[0][0] = 1.0;
        m[0][1] = 1.0;
        m[0][2] = 1.0;
        m[1][0] = 1.0;
        m[1][1] = 1.0;
        m[1][2] = 1.0;
        m[2][0] = 1.0;
        m[2][1] = 1.0;
        m[2][2] = 1.0;
        
        m2[0][0] = 1.0;
        m2[0][1] = 1.0;
        m2[0][2] = 1.0;
        m2[1][0] = 1.0;
        m2[1][1] = 1.0;
        m2[1][2] = 1.0;
        m2[2][0] = 1.0;
        m2[2][1] = 1.0;
        m2[2][2] = 1.0;
        
        System.out.println("Matriz original 1 : " + orig);
        System.out.println("Matriz original 2 : " + orig2);
        
        Matriz Soma = orig.soma(orig2);
        System.out.println("A soma é: " + Soma);
        
        Matriz Produto = orig.prod(orig2);
        System.out.println("O produto é:" + Produto);
      
    }
}
