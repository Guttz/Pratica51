/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1654314
 */
public class MatrizInvalidaException extends Exception{
    private final Matriz m1;
    
    public MatrizInvalidaException(Matriz m1){
        super(String.format(
        "Matriz de %dx%d não pode ser criada",
        m1.getMatriz().length, m1.getMatriz()[0].length));
        this.m1 = m1;
    }
    
    public int getNumLinhas(){
        return m1.getMatriz().length;
    }
    
    public int getNumColunas(){
        return m1.getMatriz()[0].length;
    }
    
}
