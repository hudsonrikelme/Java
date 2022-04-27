package br.edu.ifnmg.processamentolista;

import java.util.List;

/**
 *
 * @author Rikelme
 */
public class RegressaoLinear {
    
    private static Double w0 = 0.0;
    private static Double w1 = 0.0;
    private static Double p;
    private static Double dif;
    private static Integer e = 2000;
    private static Double lr = 0.025;
    
    private static Dupla<Double, Double> imp = new Dupla<>(w0,w1);
    
    
    public static Dupla metodo(List<Double> ins, List <Double> outs){
        for(int i = 1; i<=2000;i++){
    
        if((i%10)==0){
        
            System.out.printf("%d %.3f %.3f \n", i,w1,w0);
            
        }
        for(int j=0; j<ins.size();j++){
        
            p = w1 * ins.get(j) + w0;
            dif  = outs.get(j) - p;
            w0 += dif * lr;
            w1 += dif * lr * ins.get(j);
        
        }
    
    }
        imp.setX(w1);
        imp.setY(w0);

    return imp;
        
    }
    
}
