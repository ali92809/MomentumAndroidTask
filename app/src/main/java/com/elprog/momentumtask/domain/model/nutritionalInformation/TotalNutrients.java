package com.elprog.momentumtask.domain.model.nutritionalInformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * i used CHOCDF object as all have the same content
 *
 * */
public class TotalNutrients implements Serializable {
    @Expose
    @SerializedName("WATER")
    private CHOCDF WATER;
    @Expose
    @SerializedName("VITK1")
    private CHOCDF VITK1;
    @Expose
    @SerializedName("TOCPHA")
    private CHOCDF TOCPHA;
    @Expose
    @SerializedName("VITD")
    private CHOCDF VITD;
    @Expose
    @SerializedName("VITB12")
    private CHOCDF VITB12;
    @Expose
    @SerializedName("FOLAC")
    private CHOCDF FOLAC;
    @Expose
    @SerializedName("FOLFD")
    private CHOCDF FOLFD;
    @Expose
    @SerializedName("FOLDFE")
    private CHOCDF FOLDFE;
    @Expose
    @SerializedName("VITB6A")
    private CHOCDF VITB6A;
    @Expose
    @SerializedName("NIA")
    private CHOCDF NIA;
    @Expose
    @SerializedName("RIBF")
    private CHOCDF RIBF;
    @Expose
    @SerializedName("THIA")
    private CHOCDF THIA;
    @Expose
    @SerializedName("VITC")
    private CHOCDF VITC;
    @Expose
    @SerializedName("VITA_RAE")
    private CHOCDF VITA_RAE;
    @Expose
    @SerializedName("P")
    private CHOCDF P;
    @Expose
    @SerializedName("ZN")
    private CHOCDF ZN;
    @Expose
    @SerializedName("FE")
    private CHOCDF FE;
    @Expose
    @SerializedName("K")
    private CHOCDF K;
    @Expose
    @SerializedName("MG")
    private CHOCDF MG;
    @Expose
    @SerializedName("CA")
    private CHOCDF CA;
    @Expose
    @SerializedName("NA")
    private CHOCDF NA;
    @Expose
    @SerializedName("CHOLE")
    private CHOCDF CHOLE;
    @Expose
    @SerializedName("PROCNT")
    private CHOCDF PROCNT;
    @Expose
    @SerializedName("SUGAR")
    private CHOCDF SUGAR;
    @Expose
    @SerializedName("FIBTG")
    private CHOCDF FIBTG;
    @Expose
    @SerializedName("CHOCDF")
    private CHOCDF CHOCDF;
    @Expose
    @SerializedName("FAPU")
    private CHOCDF FAPU;
    @Expose
    @SerializedName("FAMS")
    private CHOCDF FAMS;
    @Expose
    @SerializedName("FASAT")
    private CHOCDF FASAT;
    @Expose
    @SerializedName("FAT")
    private CHOCDF FAT;
    @Expose
    @SerializedName("ENERC_KCAL")
    private CHOCDF ENERC_KCAL;

    public CHOCDF getWATER() {
        return WATER;
    }

    public void setWATER(CHOCDF WATER) {
        this.WATER = WATER;
    }

    public CHOCDF getVITK1() {
        return VITK1;
    }

    public void setVITK1(CHOCDF VITK1) {
        this.VITK1 = VITK1;
    }

    public CHOCDF getTOCPHA() {
        return TOCPHA;
    }

    public void setTOCPHA(CHOCDF TOCPHA) {
        this.TOCPHA = TOCPHA;
    }

    public CHOCDF getVITD() {
        return VITD;
    }

    public void setVITD(CHOCDF VITD) {
        this.VITD = VITD;
    }

    public CHOCDF getVITB12() {
        return VITB12;
    }

    public void setVITB12(CHOCDF VITB12) {
        this.VITB12 = VITB12;
    }

    public CHOCDF getFOLAC() {
        return FOLAC;
    }

    public void setFOLAC(CHOCDF FOLAC) {
        this.FOLAC = FOLAC;
    }

    public CHOCDF getFOLFD() {
        return FOLFD;
    }

    public void setFOLFD(CHOCDF FOLFD) {
        this.FOLFD = FOLFD;
    }

    public CHOCDF getFOLDFE() {
        return FOLDFE;
    }

    public void setFOLDFE(CHOCDF FOLDFE) {
        this.FOLDFE = FOLDFE;
    }

    public CHOCDF getVITB6A() {
        return VITB6A;
    }

    public void setVITB6A(CHOCDF VITB6A) {
        this.VITB6A = VITB6A;
    }

    public CHOCDF getNIA() {
        return NIA;
    }

    public void setNIA(CHOCDF NIA) {
        this.NIA = NIA;
    }

    public CHOCDF getRIBF() {
        return RIBF;
    }

    public void setRIBF(CHOCDF RIBF) {
        this.RIBF = RIBF;
    }

    public CHOCDF getTHIA() {
        return THIA;
    }

    public void setTHIA(CHOCDF THIA) {
        this.THIA = THIA;
    }

    public CHOCDF getVITC() {
        return VITC;
    }

    public void setVITC(CHOCDF VITC) {
        this.VITC = VITC;
    }

    public CHOCDF getVITA_RAE() {
        return VITA_RAE;
    }

    public void setVITA_RAE(CHOCDF VITA_RAE) {
        this.VITA_RAE = VITA_RAE;
    }

    public CHOCDF getP() {
        return P;
    }

    public void setP(CHOCDF p) {
        P = p;
    }

    public CHOCDF getZN() {
        return ZN;
    }

    public void setZN(CHOCDF ZN) {
        this.ZN = ZN;
    }

    public CHOCDF getFE() {
        return FE;
    }

    public void setFE(CHOCDF FE) {
        this.FE = FE;
    }

    public CHOCDF getK() {
        return K;
    }

    public void setK(CHOCDF k) {
        K = k;
    }

    public CHOCDF getMG() {
        return MG;
    }

    public void setMG(CHOCDF MG) {
        this.MG = MG;
    }

    public CHOCDF getCA() {
        return CA;
    }

    public void setCA(CHOCDF CA) {
        this.CA = CA;
    }

    public CHOCDF getNA() {
        return NA;
    }

    public void setNA(CHOCDF NA) {
        this.NA = NA;
    }

    public CHOCDF getCHOLE() {
        return CHOLE;
    }

    public void setCHOLE(CHOCDF CHOLE) {
        this.CHOLE = CHOLE;
    }

    public CHOCDF getPROCNT() {
        return PROCNT;
    }

    public void setPROCNT(CHOCDF PROCNT) {
        this.PROCNT = PROCNT;
    }

    public CHOCDF getSUGAR() {
        return SUGAR;
    }

    public void setSUGAR(CHOCDF SUGAR) {
        this.SUGAR = SUGAR;
    }

    public CHOCDF getFIBTG() {
        return FIBTG;
    }

    public void setFIBTG(CHOCDF FIBTG) {
        this.FIBTG = FIBTG;
    }

    public CHOCDF getCHOCDF() {
        return CHOCDF;
    }

    public void setCHOCDF(CHOCDF CHOCDF) {
        this.CHOCDF = CHOCDF;
    }

    public CHOCDF getFAPU() {
        return FAPU;
    }

    public void setFAPU(CHOCDF FAPU) {
        this.FAPU = FAPU;
    }

    public CHOCDF getFAMS() {
        return FAMS;
    }

    public void setFAMS(CHOCDF FAMS) {
        this.FAMS = FAMS;
    }

    public CHOCDF getFASAT() {
        return FASAT;
    }

    public void setFASAT(CHOCDF FASAT) {
        this.FASAT = FASAT;
    }

    public CHOCDF getFAT() {
        return FAT;
    }

    public void setFAT(CHOCDF FAT) {
        this.FAT = FAT;
    }

    public CHOCDF getENERC_KCAL() {
        return ENERC_KCAL;
    }

    public void setENERC_KCAL(CHOCDF ENERC_KCAL) {
        this.ENERC_KCAL = ENERC_KCAL;
    }
}
