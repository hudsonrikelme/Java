
package br.edu.ifnmg.processamentolista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rikelme
 */
public class Program {
    public static void main(String[] args) {
        List<Double> ins =  new ArrayList<Double>();
        List<Double> outs = new ArrayList<Double>();
        
        ins.add(1.0);
        ins.add(3.0);
        ins.add(5.0);
        
        outs.add(1.0);
        outs.add(3.0);
        outs.add(5.0);
        
        
        Dupla teste;
        
        teste = RegressaoLinear.metodo(ins, outs);

        System.out.println("W1: " + String.format("%.3f", teste.getX())
                + "\nW0: " + String.format("%.3f", teste.getY()));
        
    }
}
