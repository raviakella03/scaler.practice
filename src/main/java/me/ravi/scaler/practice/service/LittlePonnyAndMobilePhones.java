package me.ravi.scaler.practice.service;


import java.util.ArrayList;

/*
 * Problem Description:
 * Little pony is going to buy some mobile phones for his friends.
 * As there many models available in the market at different prices, He is confused
 * and wants to know the maximum distinct models of a mobile phone he can buy for his friends,
 * given that he has a total X amount of money.
 * You are given an array A of size N. denoting the size of prices of different models.
 * The array is sorted based on prices in increasing order.
 * You are given another array B of size Q denoting the queries.
 * In i'th query, you need to tell the maximum distinct models of mobile phones he can buy with B[i] money.
 * Problem Constraints: 1 <= N, Q <= 105 | 1 <= A[i] <= 104 | 1 <= B[i] <= 109
 * Input Format:
 * The 1st argument of the input is the array A.
 * The 2nd argument of the input is the array B containing the description of the queries.
 * Output Format:
 * Your function should return the answer to all queries in an array (in the same order they were asked in the input).
 * Example Input:
 * Input 1: A: [3, 4, 4, 6] B: [20, 4, 10, 2]
 * Example Output:
 * Output 1: [4, 1, 2, 0]
 * Example Explanation:
 * Explanation 1:
 * For the 1st query, he has 20 amount of money and he can buy the phones in just 3 + 4 + 4 + 6 = 17 rupees.
 * For the 2nd query, he has 4 amount of money and he can buy any the second or first phone.
 * For the 3rd query, he has 10 amount of money and he can buy the third and fourth phone in 6 + 4 = 10 amount of money
 * For the 2nd query, he has 2 amount of money and he can't buy any phone with it
 * */
public interface LittlePonnyAndMobilePhones {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B);
}
