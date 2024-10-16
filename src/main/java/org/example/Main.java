package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int shiCargo = 135;
        int[] weight = {50, 120, 74, 60, 100, 82};
        int[] sortedWeight = Arrays.stream(weight).sorted().toArray();

        selectSailors(sortedWeight, 0, sortedWeight.length - 1, shiCargo);
    }

    public static void selectSailors(int[] ships, int minInd, int maxInd, int shipCargo) {

        if (minInd <= maxInd) {
            if (shipCargo > ships[minInd] + ships[maxInd]) {
                System.out.println(ships[minInd] +
                        " " + ships[maxInd]);
                minInd++;
                maxInd--;
                selectSailors(ships, minInd, maxInd, shipCargo);
            } else{
                System.out.println(ships[maxInd] + " 0");
                maxInd--;
                selectSailors(ships, minInd, maxInd, shipCargo);
            }
        }
    }
}



