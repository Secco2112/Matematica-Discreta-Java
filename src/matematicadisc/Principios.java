package matematicadisc;

import java.math.BigInteger;

public class Principios {

    public BigInteger fatorial(int n){
        if (BigInteger.ONE.equals(BigInteger.valueOf(n)) || BigInteger.ZERO.equals(BigInteger.valueOf(n))) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(fatorial(n - 1));
        }
    }
    
    public BigInteger PrincipioMultiplicativo(int n, int vetor[]){
        BigInteger mult = BigInteger.ONE;
        for(int i=0; i<n; i++){
            mult=mult.multiply(BigInteger.valueOf(vetor[i]));
        }
        return mult;
    }
    
    public BigInteger PrincipioAditivo(int n, int vetor[]){
        BigInteger add = BigInteger.ZERO;
        for(int i=0; i<n; i++){
            add=add.multiply(BigInteger.valueOf(vetor[i]));
        }
        return add;
    }
}
