package com.elprog.momentumtask.domain.model.nutritionalInformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parsed {
    @Expose
    @SerializedName("status")
    private String status;
    @Expose
    @SerializedName("measureURI")
    private String measureURI;
    @Expose
    @SerializedName("nutrients")
    private TotalDaily nutrients;
    @Expose
    @SerializedName("retainedWeight")
    private double retainedWeight;
    @Expose
    @SerializedName("weight")
    private double weight;
    @Expose
    @SerializedName("specificFoodURI")
    private String specificFoodURI;
    @Expose
    @SerializedName("foodId")
    private String foodId;
    @Expose
    @SerializedName("food")
    private String food;
    @Expose
    @SerializedName("foodMatch")
    private String foodMatch;
    @Expose
    @SerializedName("measure")
    private String measure;
    @Expose
    @SerializedName("quantity")
    private double quantity;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMeasureURI() {
        return measureURI;
    }

    public void setMeasureURI(String measureURI) {
        this.measureURI = measureURI;
    }

    public TotalDaily getNutrients() {
        return nutrients;
    }

    public void setNutrients(TotalDaily nutrients) {
        this.nutrients = nutrients;
    }

    public double getRetainedWeight() {
        return retainedWeight;
    }

    public void setRetainedWeight(double retainedWeight) {
        this.retainedWeight = retainedWeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecificFoodURI() {
        return specificFoodURI;
    }

    public void setSpecificFoodURI(String specificFoodURI) {
        this.specificFoodURI = specificFoodURI;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFoodMatch() {
        return foodMatch;
    }

    public void setFoodMatch(String foodMatch) {
        this.foodMatch = foodMatch;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
