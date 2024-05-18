package com.labseq.labseqservice.utils;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
@Component
public class CacheMap {
    private final Map<Integer, BigInteger> cache = new HashMap<>();

    public CacheMap() {
        cache.put(0, BigInteger.ZERO);
        cache.put(1, BigInteger.ONE);
        cache.put(2, BigInteger.ZERO);
        cache.put(3, BigInteger.ONE);
    }

    public Map<Integer, BigInteger> getCache() {
        return cache;
    }
}
