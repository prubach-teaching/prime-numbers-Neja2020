package sgh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import sgh.PrimeNumbers;

import java.io.*;

public class TestPrime {

    @Test
    public void testPrimeNumbers()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PrimeNumbers.primes(4);
        assertEquals("2, 3, 5, 7\n", bos.toString());

        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PrimeNumbers.primes(8);
        assertEquals("2, 3, 5, 7, 11, 13, 17, 19\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }
}