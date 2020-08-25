package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;

import java.math.BigDecimal;

public class ClasseDeTeste {
    @Somar
    private BigDecimal param1;

    @Somar
    private BigDecimal param2;

    @Subtrair
    private BigDecimal param3;

    @Subtrair
    private BigDecimal param4;

@Subtrair
    private Integer param5;

    private BigDecimal param6;

    public ClasseDeTeste( BigDecimal param1, BigDecimal param2, BigDecimal param3, BigDecimal param4, Integer param5, BigDecimal param6 ) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.param6 = param6;
    }

    public BigDecimal getParam1() {
        return param1;
    }

    public void setParam1( BigDecimal param1 ) {
        this.param1 = param1;
    }

    public BigDecimal getParam2() {
        return param2;
    }

    public void setParam2( BigDecimal param2 ) {
        this.param2 = param2;
    }

    public BigDecimal getParam3() {
        return param3;
    }

    public void setParam3( BigDecimal param3 ) {
        this.param3 = param3;
    }

    public BigDecimal getParam4() {
        return param4;
    }

    public void setParam4( BigDecimal param4 ) {
        this.param4 = param4;
    }

    public Integer getParam5() {
        return param5;
    }

    public void setParam5( Integer param5 ) {
        this.param5 = param5;
    }

    public BigDecimal getParam6() {
        return param6;
    }

    public void setParam6( BigDecimal param6 ) {
        this.param6 = param6;
    }
}
