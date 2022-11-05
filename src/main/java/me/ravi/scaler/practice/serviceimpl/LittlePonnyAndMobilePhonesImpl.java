package me.ravi.scaler.practice.serviceimpl;

import me.ravi.scaler.practice.service.LittlePonnyAndMobilePhones;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LittlePonnyAndMobilePhonesImpl implements LittlePonnyAndMobilePhones {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> outputList = new ArrayList<>();
        int overallCost;
        int currentCost = 0;
        int numberOfPhonesToBuy = 0;

        for (int i = 0; i < B.size(); i++) {
            overallCost = B.get(i);
            for (int j = 0; j < A.size(); j++) {
                currentCost += A.get(j);
                if (currentCost <= overallCost) {
                    ++numberOfPhonesToBuy;
                } else {
                    currentCost -= A.get(j);
                }
            }
            outputList.add(numberOfPhonesToBuy);
            numberOfPhonesToBuy = 0;
        }
        return outputList;
    }
}
