/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Scanner;

/**
 *
 * @author jiseonoh
 */
public class UniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        executeAlgorithm(input);
    }
    public static boolean executeAlgorithm(String input) {
        if(input.length() > 256)
            return false;
        // hash table 생성해서 올린다.
        return true;
    }
}