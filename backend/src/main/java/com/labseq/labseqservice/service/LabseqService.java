package com.labseq.labseqservice.service;

import com.labseq.labseqservice.exception.InvalidInputException;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
@Service
public class LabseqService {

    private static final Map<Integer, BigInteger> cache = new HashMap<>();

    static {
        cache.put(0, BigInteger.ZERO);
        cache.put(1, BigInteger.ONE);
        cache.put(2, BigInteger.ZERO);
        cache.put(3, BigInteger.ONE);
    }

    public BigInteger getLabseqValue(int n) {
        validateInputValue(n);

        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            BigInteger value = getLabseqValue(n - 4).add(getLabseqValue(n - 3));
            cache.put(n, value);
            return value;
        }
    }

    private void validateInputValue(int n) {
        if (n < 0) {
            throw new InvalidInputException("The index may be any non negative integer number.");
        }
        if (n > 10000) {
            throw new InvalidInputException("The index can be any number less than 10000.");
        }
    }
}
