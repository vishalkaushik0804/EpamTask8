package com.vishalkaushik.epamtask8;

/**
 *
 * @author VishalKaushik
 */
public class RemoveTwoAChars {

   /* public static void main(String[] args) {
        RemoveTwoAChars remove_1st_2A_char = new RemoveTwoAChars();
        System.out.println(remove_1st_2A_char.removeAChars("BAAA"));
    }*/

    public String removeAChars(String string) {
        String result = string;
        if (string.length() >= 2) {
            result = string.substring(0, 2).replaceAll("[aA]+", "") + string.substring(2);
        }
        return result;
    }
}
