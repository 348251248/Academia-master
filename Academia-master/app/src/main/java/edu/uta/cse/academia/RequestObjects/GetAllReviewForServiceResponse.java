package edu.uta.cse.academia.RequestObjects;

import com.google.gson.Gson;

import java.util.ArrayList;

import edu.uta.cse.academia.Models.Review;


/**
 * Created by Chris on 4/12/2016.
 */
public class GetAllReviewForServiceResponse {
    private ArrayList<Review> Reviews;

    public ArrayList<Review> getReviews() {
        return Reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        Reviews = reviews;
    }

    public static String toJsonFromObject(GetAllReviewForServiceResponse response){
        String result = "";
        Gson gson = new Gson();

        try {
            result = gson.toJson(response, GetAllReviewForServiceResponse.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }
}
