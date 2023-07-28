/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hooper.erika.genericcollectionss;

import java.util.List;

/**
 *
 * @author Erika
 */
public class CalculateSumAverage {
    public static int calculateSum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(List<Integer> list) {
        int sum = calculateSum(list);
        return (double) sum / list.size();
    }

}
