package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class CalculadorDeClasses implements Calculavel {
    @Override
    public BigDecimal somar( Object obj ) {
        return operar( Somar.class, obj );
    }

    @Override
    public BigDecimal subtrair( Object obj ) {
        return operar( Subtrair.class, obj );
    }

    @Override
    public BigDecimal totalizar( Object obj ) {
        return subtrair( obj ).subtract( somar( obj ) );
    }

    private BigDecimal operar( Class operacao, Object obj ) {
        Class targetClass = obj.getClass();
        BigDecimal result = new BigDecimal( 0 );

        try {
            for ( Field field : targetClass.getDeclaredFields() ) {
                if ( field.isAnnotationPresent( operacao ) ) {
                    field.setAccessible( true );
                    boolean isBigDecimal = field.getGenericType().getTypeName().endsWith( "BigDecimal" );

                    if ( isBigDecimal ) {
                        BigDecimal value = ( BigDecimal ) field.get( obj );
                        result = result.add( value );
                    }
                }
            }
            if ( result.equals( 0 ) ) {
                return BigDecimal.ZERO;
            }
        } catch ( IllegalAccessException e ) {
            e.printStackTrace();
        }
        return result;
    }
}
