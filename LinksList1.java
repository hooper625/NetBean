/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hooper.erika.genericcollectionss;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
/**
 *
 * @author Erika
 */
//Creates a LinkedList object
public class LinksList1 {
      private final List<Integer> linkedList;

    public LinksList1() {
        linkedList = new LinkedList<>();
    }

    public void insertRandomIntegers(int count, int min, int max) {
        for (int i = 0; i < count; i++) {
            int randomNumber = RandomGenerator.generateRandomNumber(min, max);
            linkedList.add(randomNumber);
        }
    }

    public List<Integer> getSortedList() {
        List<Integer> sortedList = new LinkedList<>(linkedList); // Create a copy of the original list
        Collections.sort(sortedList); // Sort the copy
        return sortedList; // Return the sorted list
    }

    public List<Integer> getRandomList() {
        return linkedList;
    }
}