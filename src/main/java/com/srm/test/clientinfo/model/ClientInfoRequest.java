package com.srm.test.clientinfo.model;

import java.io.Serializable;

public class ClientInfoRequest implements Serializable {

    private String clienteName;

    private Float limitedCredit;

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
