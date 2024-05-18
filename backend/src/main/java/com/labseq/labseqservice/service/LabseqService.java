package com.labseq.labseqservice.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class LabseqService {

    private final Map<Integer, Long> cache;

    public LabseqService() {
        cache = new HashMap<>();
        cache.put(0, 0L);
        cache.put(1, 1L);
        cache.put(2, 0L);
        cache.put(3, 1L);
    }
    public Long getLabseqValue(int n) {
        validateInputValue(n);

        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {

            Long value = getLabseqValue(n - 4) + (getLabseqValue(n - 3));

            cache.put(n, value);

            return value;
        }
    }

    private void validateInputValue(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The index may be any non negative integer number.");
        }
        if (n > 10000) {
            throw new IllegalArgumentException("The index can be any number less than 10000.");
        }
    }

}
