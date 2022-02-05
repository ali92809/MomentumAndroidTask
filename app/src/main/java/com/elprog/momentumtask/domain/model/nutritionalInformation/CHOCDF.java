package com.elprog.momentumtask.domain.model.nutritionalInformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CHOCDF implements Serializable {
    @Expose
    @SerializedName("unit")
    private String unit;
    @Expose
    @SerializedName("quantity")
    private double quantity;
    @Expose
    @SerializedName("label")
    private String label;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
