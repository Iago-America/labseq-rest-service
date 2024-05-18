package com.labseq.labseqservice.helper;

import com.labseq.labseqservice.exception.InvalidInputException;

public class InputValidationHelper {
    public static void checkInput(int number) {
        if (number < 0) {
            throw new InvalidInputException("The index may be any non negative integer number.");
        }
        if (number > 10000) {
            throw new InvalidInputException("The index can be any number less than 10000.");
        }
    }
}
