/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hooper.erika.sentencebuilder;

import java.util.Random;

/**
 *
 * @author Erika
 */

public class Words {
    // Create four String arrays called article, noun, verb, and preposition 
    String[] articles = {"the", "a", "one", "some", "any"};
    String[] nouns = {"boy", "girl", "dog", "town", "car"}; 
    String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    String[] prepositions = {"to", "from", "over", "under", "on"};
    
    private Random rand = new Random();

    public String getArticle() {
        int index = rand.nextInt(articles.length); // gets a random index
        return articles[index];
    }
    
    public String getNouns() {
        int index = rand.nextInt(nouns.length); // gets a random index
        return nouns[index];
    }
    
    public String getVerbs() {
        int index = rand.nextInt(verbs.length); // gets a random index
        return verbs[index];
    }
    
    public String getPrepositions() {
        int index = rand.nextInt(prepositions.length); // gets a random index
        return prepositions[index];
    }
}
