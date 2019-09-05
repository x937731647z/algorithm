package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTest {
    Prime prime;

    @Before
    public void setPrime(){
        prime = new Prime();
    }

    @Test
    public void isPrime() {
        boolean flagTrue = true;
        boolean flagFalse = false;
        assertEquals(flagFalse, prime.isPrime(4));
        assertEquals(flagTrue, prime.isPrime(31));
    }

    @Test
    public void findPrime() {
        int[] primeList = {2,3,5,7,11,13,17,19,23,29,31};
        assertArrayEquals(primeList,prime.findPrime(33));
//        assertEquals(primeList, prime.findPrime(33));
    }

    @Test
    public void rangePrime() {
        int[] primeRangeList = {11,13,17,19,23,29,31};
//        assertEquals(primeRangeList,prime.rangePrime(9,36));
        assertArrayEquals(primeRangeList, prime.rangePrime(9, 36));

    }
    @Test
    public void FactorTest(){
        prime.Factor(8);
        prime.Factor(1);
        prime.Factor(180);

    }
    @Test
    public void FactorTest97532468(){
        prime.Factor(97532468);
    }
}