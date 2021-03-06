package com.srm.test.clientinfo.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Cesar.
 * @version 1.0
 */
public class ClientInfoRequest implements Serializable {

    @NotNull
    private String clienteName;

    @NotNull
    private Float limitedCredit;

    @NotNull
    private String interestList;

    public String getClienteName() {
        return clienteName;
    }

    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }

    public Float getLimitedCredit() {
        return limitedCredit;
    }

    public void setLimitedCredit(Float limitedCredit) {
        this.limitedCredit = limitedCredit;
    }

    public String getInterestList() {
        return interestList;
    }

    public void setInterestList(String interestList) {
        this.interestList = interestList;
    }


}
