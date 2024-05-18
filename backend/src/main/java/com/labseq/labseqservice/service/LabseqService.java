package com.labseq.labseqservice.service;

import com.labseq.labseqservice.exception.InvalidInputException;
import com.labseq.labseqservice.utils.CacheMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class LabseqService {
    @Autowired
    private CacheMap cacheMap;

    @Cacheable("labseq")
    public BigInteger getLabseqValue(int n) {
        validateInputValue(n);

        if (cacheMap.getCache().containsKey(n)) {
            return cacheMap.getCache().get(n);
        } else {
            BigInteger value = getLabseqValue(n - 4).add(getLabseqValue(n - 3));
            cacheMap.getCache().put(n, value);
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
