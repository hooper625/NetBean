/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hooper.erika.genericcollectionss;

/**
 *
 * @author Erika
 */
import java.util.Random;

public class RandomGenerator {  
    public static int generateRandomNumber(int min, int max) {
        Random randNum = new Random();
        return randNum.nextInt(max - min + 1) + min;
    }
}