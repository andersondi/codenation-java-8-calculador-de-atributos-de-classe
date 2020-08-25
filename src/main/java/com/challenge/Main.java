package com.challenge;

import com.challenge.desafio.CalculadorDeClasses;
import com.challenge.desafio.ClasseDeTeste;
import com.challenge.interfaces.Calculavel;

import java.math.BigDecimal;

public class Main {
    public static void main( String[] args ) {
        Calculavel calculadorDeClasses = new CalculadorDeClasses();
        ClasseDeTeste classeDeTeste = new ClasseDeTeste(
                new BigDecimal( 10),
                new BigDecimal( 30),
                new BigDecimal( 10),
                new BigDecimal( 20),
                new Integer( 5),
                new BigDecimal( 20 )
                );

        System.out.println("Metodo somar --> " + calculadorDeClasses.somar( classeDeTeste ));
        System.out.println("Metodo subtrair --> " + calculadorDeClasses.subtrair( classeDeTeste ));
        System.out.println("Metodo total --> " + calculadorDeClasses.totalizar( classeDeTeste ));
    }
}
