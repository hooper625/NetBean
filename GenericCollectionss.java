/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hooper.erika.genericcollectionss;   
import java.util.LinkedList;
import java.util.Random;
import java.util.List;
/**
 *
 * @author Erika
 */
public class GenericCollectionss {
    

  public static void main(String[] args) {

        System.out.println("Erika Hooper – Lab 5");
        
        LinksList1 list = new LinksList1();
        list.insertRandomIntegers(25, 0, 100);
        
        List<Integer> randomList = list.getRandomList();
        List<Integer> linkedList = list.getSortedList();
        

        int sum = CalculateSumAverage.calculateSum(linkedList);
        double average = CalculateSumAverage.calculateAverage(linkedList);

        System.out.println("Random list: " + randomList);
        System.out.println("Sorted list: " + linkedList);
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}


