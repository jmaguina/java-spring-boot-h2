package com.srm.test.clientinfo.util;

/**
 * @author Cesar.
 * @version 1.0
 */
public class Utils {

    private Utils() {
    }

    /**
     * Metodo que calcula el interes dependiendo del tipo.
     * @param type
     * @param limitCredit
     * @return
     */
    public static Double interestRate (String type, Float limitCredit) {

        if (type.equalsIgnoreCase("b"))
            return limitCredit.floatValue() * 0.10;
        else
            return limitCredit.floatValue() * 0.20;

    }



}
