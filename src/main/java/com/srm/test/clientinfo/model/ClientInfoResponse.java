package com.srm.test.clientinfo.model;

import java.io.Serializable;

/**
 * @author Cesar.
 * @version 1.0
 */
public class ClientInfoResponse implements Serializable {

    private String result;


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
