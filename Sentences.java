/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hooper.erika.sentencebuilder;

/**
 *
 * @author Erika
 */
public class Sentences {
     private Words word = new Words();
    
    public String getSentence(){
       //StringBuilder type
       StringBuilder sentence = new StringBuilder();
     
       //Create a sentence (using the StringBuilderMain type) 
       //by selecting a word at random from each array 
       sentence.append(word.getArticle()).append(" ");//uses the append() method.
       sentence.append(word.getNouns()).append(" ");//The words separated by spaces
       sentence.append(word.getVerbs()).append(" ");
       sentence.append(word.getPrepositions()).append(" ");
       sentence.append(word.getArticle()).append(" ");
       sentence.append(word.getNouns()).append(".");
    
    //first letter of the first word should start with a capital letter 
    sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));
    return sentence.toString();
    }
    
}
