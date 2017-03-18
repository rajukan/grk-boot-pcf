package com.org.vg.pcf.domain;



public class Fund {

    private String id;

    private String fundName;

    private Fund() {
    }

    public Fund(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return  id + " - " +  fundName.toString();
    }

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
}
