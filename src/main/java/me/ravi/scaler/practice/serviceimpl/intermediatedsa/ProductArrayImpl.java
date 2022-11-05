package me.ravi.scaler.practice.serviceimpl.intermediatedsa;

import me.ravi.scaler.practice.service.intermediatedsa.ProductArray;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductArrayImpl implements ProductArray {
    @Override
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> productArray = new ArrayList<>();
        List<Integer> prefixProduct = prefixProduct(A);
        List<Integer> suffixProduct = suffixProduct(A);
        for (int i = 0; i < A.size(); i++) {
            if (i == 0) {
                productArray.add(suffixProduct.get(i + 1));
            } else if (i == A.size() - 1) {
                productArray.add(prefixProduct.get(i - 1));
            } else {
                productArray.add(prefixProduct.get(i - 1) * suffixProduct.get(i + 1));
            }
        }
        return productArray;
    }

    private List<Integer> suffixProduct(ArrayList<Integer> A) {
        Integer[] suffixProduct = new Integer[A.size()];
        suffixProduct[A.size() - 1] = A.get(A.size() - 1);
        for (int i = A.size() - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * A.get(i);
        }
        return Arrays.asList(suffixProduct);
    }

    private ArrayList<Integer> prefixProduct(ArrayList<Integer> A) {
        ArrayList<Integer> prefixProduct = new ArrayList<>();
        prefixProduct.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            prefixProduct.add(A.get(i) * prefixProduct.get(i - 1));
        }
        return prefixProduct;
    }
}
