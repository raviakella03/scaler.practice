package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.GenerateAllSubarrays;

import java.util.ArrayList;

public class GenerateAllSubarraysImpl implements GenerateAllSubarrays {
    @Override
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> allSubArrays = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                ArrayList<Integer> subArray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subArray.add(A.get(k));
                }
                allSubArrays.add(subArray);
            }
        }
        return allSubArrays;
    }
}
