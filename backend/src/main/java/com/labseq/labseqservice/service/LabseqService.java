package com.labseq.labseqservice.service;

import static com.labseq.labseqservice.helper.InputValidationHelper.checkInput;

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
    public BigInteger getLabseqValue(int number) {
        checkInput(number);

        if (cacheMap.getCache().containsKey(number)) {
            return cacheMap.getCache().get(number);
        } else {
            BigInteger value = getLabseqValue(number - 4).add(getLabseqValue(number - 3));
            cacheMap.getCache().put(number, value);
            return value;
        }
    }

}
