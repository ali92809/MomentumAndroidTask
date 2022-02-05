package com.elprog.momentumtask.domain.model.nutritionalInformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TotalNutrientsKCal implements Serializable {
    @Expose
    @SerializedName("CHOCDF_KCAL")
    private CHOCDF CHOCDF_KCAL;
    @Expose
    @SerializedName("FAT_KCAL")
    private CHOCDF FAT_KCAL;
    @Expose
    @SerializedName("PROCNT_KCAL")
    private CHOCDF PROCNT_KCAL;
    @Expose
    @SerializedName("ENERC_KCAL")
    private CHOCDF ENERC_KCAL;

    public CHOCDF getCHOCDF_KCAL() {
        return CHOCDF_KCAL;
    }

    public void setCHOCDF_KCAL(CHOCDF CHOCDF_KCAL) {
        this.CHOCDF_KCAL = CHOCDF_KCAL;
    }

    public CHOCDF getFAT_KCAL() {
        return FAT_KCAL;
    }

    public void setFAT_KCAL(CHOCDF FAT_KCAL) {
        this.FAT_KCAL = FAT_KCAL;
    }

    public CHOCDF getPROCNT_KCAL() {
        return PROCNT_KCAL;
    }

    public void setPROCNT_KCAL(CHOCDF PROCNT_KCAL) {
        this.PROCNT_KCAL = PROCNT_KCAL;
    }

    public CHOCDF getENERC_KCAL() {
        return ENERC_KCAL;
    }

    public void setENERC_KCAL(CHOCDF ENERC_KCAL) {
        this.ENERC_KCAL = ENERC_KCAL;
    }
}
