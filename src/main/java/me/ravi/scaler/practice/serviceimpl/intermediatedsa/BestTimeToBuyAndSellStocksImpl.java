package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.BestTimeToBuyAndSellStocks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestTimeToBuyAndSellStocksImpl implements BestTimeToBuyAndSellStocks {
    @Override
    public int maxProfit(List<Integer> A) {
        int maxProfit = 0;
        if (A.size() < 2) {
            return maxProfit;
        }
        int buyPrice = A.get(0);
        for (Integer integer : A) {
            buyPrice = Math.min(buyPrice, integer);
            maxProfit = Math.max(maxProfit, integer - buyPrice);
        }
        return maxProfit;
    }
}
