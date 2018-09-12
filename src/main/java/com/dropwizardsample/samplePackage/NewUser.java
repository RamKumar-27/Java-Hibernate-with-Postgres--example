package com.dropwizardsample.samplePackage;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class NewUser implements Serializable {
    private String username;
    private String mobileNo;
    @Id
    private String model;


    public NewUser(String model, String username, String mobileNo) {
        this.username = username;
        this.mobileNo = mobileNo;
        this.model = model;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
