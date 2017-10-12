/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author stahc1596
 */
public class Quiz2 {

    public void reverseString(String word){
        if(0 != word.length()){
            System.out.print(word.charAt(word.length() - 1));
            word = word.substring(0, word.length() - 1);
            reverseString(word);
        }
    }
    public static void main(String[] args) {
        Quiz2 test = new Quiz2();
        String word = "horse";
        test.reverseString(word);
        
    }
}
