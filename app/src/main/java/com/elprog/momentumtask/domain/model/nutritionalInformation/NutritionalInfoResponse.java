package com.elprog.momentumtask.domain.model.nutritionalInformation;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class NutritionalInfoResponse  {

    @Expose
    @SerializedName("totalNutrientsKCal")
    private TotalNutrientsKCal totalNutrientsKCal;
    @Expose
    @SerializedName("ingredients")
    private List<Ingredient> ingredients;
    @Expose
    @SerializedName("totalDaily")
    private TotalDaily totalDaily;
    @Expose
    @SerializedName("totalNutrients")
    private TotalNutrients totalNutrients;
    @Expose
    @SerializedName("cautions")
    private List<String> cautions;
    @Expose
    @SerializedName("healthLabels")
    private List<String> healthLabels;
    @Expose
    @SerializedName("dietLabels")
    private List<String> dietLabels;
    @Expose
    @SerializedName("totalWeight")
    private double totalWeight;
    @Expose
    @SerializedName("glycemicIndex")
    private double glycemicIndex;
    @Expose
    @SerializedName("calories")
    private double calories;
    @Expose
    @SerializedName("yield")
    private double yield;
    @Expose
    @SerializedName("uri")
    private String uri;

    public TotalNutrientsKCal getTotalNutrientsKCal() {
        return totalNutrientsKCal;
    }

    public void setTotalNutrientsKCal(TotalNutrientsKCal totalNutrientsKCal) {
        this.totalNutrientsKCal = totalNutrientsKCal;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public TotalDaily getTotalDaily() {
        return totalDaily;
    }

    public void setTotalDaily(TotalDaily totalDaily) {
        this.totalDaily = totalDaily;
    }

    public TotalNutrients getTotalNutrients() {
        return totalNutrients;
    }

    public void setTotalNutrients(TotalNutrients totalNutrients) {
        this.totalNutrients = totalNutrients;
    }

    public List<String> getCautions() {
        return cautions;
    }

    public void setCautions(List<String> cautions) {
        this.cautions = cautions;
    }

    public List<String> getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(List<String> healthLabels) {
        this.healthLabels = healthLabels;
    }

    public List<String> getDietLabels() {
        return dietLabels;
    }

    public void setDietLabels(List<String> dietLabels) {
        this.dietLabels = dietLabels;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getGlycemicIndex() {
        return glycemicIndex;
    }

    public void setGlycemicIndex(double glycemicIndex) {
        this.glycemicIndex = glycemicIndex;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
