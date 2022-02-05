package com.elprog.momentumtask.domain.model.RequestBodyData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * this class to submit data in request body
 * to get the information of function1
 *
 * //model schema
 * {
 *   "title": "string",
 *   "ingr": [
 *     "string"
 *   ],
 *   "url": "string",
 *   "summary": "string",
 *   "yield": "string",
 *   "time": "string",
 *   "img": "string",
 *   "prep": "string",
 *   "cuisine": "string",
 *   "mealtype": "string",
 *   "dishtype": "string"
 * }
 * */
public class body {

    @SerializedName("ingr")
    private List<String> ingr;

    public body(List<String> ingrList) {
        this.ingr = ingrList;
    }

    public List<String> getIngrList() {
        return ingr;
    }

    public void setIngrList(List<String> ingrList) {
        this.ingr = ingrList;
    }
}
