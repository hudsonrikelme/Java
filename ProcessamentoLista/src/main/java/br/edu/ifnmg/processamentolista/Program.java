package br.edu.ifnmg.processamentolista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rikelme
 */
public class Program {

    public static void main(String[] args) {
        List<Double> ins = new ArrayList<Double>();
        List<Double> outs = new ArrayList<Double>();

//     --==Teste 1 ==--
//        ins.add(1.0);
//        ins.add(3.0);
//        ins.add(5.0);
//
//        outs.add(1.0);
//        outs.add(3.0);
//        outs.add(5.0);
        
        
//     --==Teste 2 ==--        
//        ins.add(1.0);
//        ins.add(3.0);
//        ins.add(5.0);
//        
//        outs.add(2.0);
//        outs.add(4.0);
//        outs.add(6.0);
        

//     --==Teste 3 ==--
//        ins.add(1.0);
//        ins.add(3.0);
//        ins.add(5.0);
//        
//        outs.add(3.0);
//        outs.add(7.0);
//        outs.add(11.0); 

        
//     --==Teste 4 ==--
//        ins.add(1.0);
//        ins.add(3.0);
//        ins.add(5.0);
//        
//        outs.add(4.5);
//        outs.add(12.5);
//        outs.add(20.5); 


//        --==Teste 5 ==--
          ins.add(2.900000095);
          ins.add(6.699999809);
          ins.add(4.900000095);
          ins.add(7.900000095);
          ins.add(9.800000191);
          ins.add(6.900000095);
          ins.add(6.099999905);
          ins.add(6.199999809);
          ins.add(6.000000000);
          ins.add(5.099999905);
          ins.add(4.699999809);
          ins.add(4.400000095);
          ins.add(5.800000191);
          
          outs.add(4.000000000);
          outs.add(7.400000095);
          outs.add(5.000000000);
          outs.add(7.199999809);
          outs.add(7.900000095);
          outs.add(6.099999905);
          outs.add(6.000000000);
          outs.add(5.800000191);
          outs.add(5.199999809);
          outs.add(4.199999809);
          outs.add(4.000000000);
          outs.add(4.400000095);
          outs.add(5.199999809);
          

//        Dupla teste1;
//
//        
//        teste1 = RegressaoLinear.metodo(ins, outs);
//
//        System.out.println("W1: " + String.format("%.3f", teste1.getX())
//                + "\nW0: " + String.format("%.3f", teste1.getY())
//                + "\n");
//        
        
//        --==Teste 2 ==--

//        Dupla teste2;
//
//        teste2 = RegressaoLinear.metodo1(ins, outs, 2000);
//        
//        System.out.println("W1: " + String.format("%.3f", teste2.getX())
//                + "\nW0: " + String.format("%.3f", teste2.getY())
//                + "\n");
        


//        --==Teste 3 ==--

//        Dupla teste3;
//        
//        
//         teste3 = RegressaoLinear.metodo2(ins, outs, 2000, 0.025);
//        
//        System.out.println("W1: " + String.format("%.3f", teste3.getX())
//                + "\nW0: " + String.format("%.3f", teste3.getY())
//                + "\n");


//        --==Teste 4 ==--

//        Dupla teste4;
//        
//        
//        teste4 = RegressaoLinear.metodo2(ins, outs,2000, 0.025);
//        System.out.println("W1: " + String.format("%.3f", teste4.getX())
//                + "\nW0: " + String.format("%.3f", teste4.getY())
//                + "\n");

        
//        --==Teste 5 ==--

        Dupla teste5;
        
        
        teste5 = RegressaoLinear.metodo2(ins, outs,2000, 0.025);
        System.out.println("W1: " + String.format("%.3f", teste5.getX())
                + "\nW0: " + String.format("%.3f", teste5.getY())
                + "\n");
        
        
        
    }
}
