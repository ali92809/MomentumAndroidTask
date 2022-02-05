package com.elprog.momentumtask.domain.model.nutritionalInformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class Ingredient {
    @Expose
    @SerializedName("parsed")
    private List<Parsed> parsed;
    @Expose
    @SerializedName("text")
    private String text;

    public List<Parsed> getParsed() {
        return parsed;
    }

    public void setParsed(List<Parsed> parsed) {
        this.parsed = parsed;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
