/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author aluno
 */
public class ExemploBigDecimal {

    public static void main(String[] args) {
        
            
        new FrameCadastro().setVisible(true);
        
        BigDecimal valor = new BigDecimal("1.0");
        
        //Somar
        valor = valor.add(new BigDecimal("2.00"));
        System.out.println("soma: " + valor);
        
        //subtrair
        valor = valor.subtract(new BigDecimal("2.00"));
        System.out.println("Subtração: " + valor);
        
        //Divisão
        valor = valor.divide(new BigDecimal("2.00"));
        System.out.println("Divisão: " + valor);
        
        //Multiplicação
        valor = valor.multiply(new BigDecimal("2.00"));
        System.out.println("Multiplicação: " + valor);
        
        //Compare
        /*
        -1 = menor
         0 = igual
         1 = mario       
        */
        
        valor = new BigDecimal("3");
        int compara = valor.compareTo(new BigDecimal("2"));
        System.out.println("Compare: " + compara);
        
        valor = new BigDecimal("2"); 
        BigDecimal max = valor.max(new BigDecimal("5"));
        System.out.println("Maior: " + max);
        
        valor = new BigDecimal("2"); 
        BigDecimal min = valor.min(new BigDecimal("5"));
        System.out.println("Maior: " + min);
        
        /*************************Arredondamento*****************************/
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.CEILING);
        System.out.println("CEILING: " + valor);
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.DOWN);
        System.out.println("DOWN: " + valor);
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.UP);
        System.out.println("UP: " + valor);
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.HALF_UP);
        System.out.println("HALF_UP: " + valor);
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.HALF_DOWN);
        System.out.println("HALF_DOWN: " + valor);
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.HALF_EVEN);
        System.out.println("HALF_EVEN: " + valor);
        
        System.out.println("Hello your computer has virus");
    }
}
