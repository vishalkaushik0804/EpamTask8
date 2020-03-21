package com.vishalkaushik.epamtask8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author VishalKaushik
 */
public class RemoveATest {

    /*
	 * 1. 1st char A : ABCD => BCD - SUCCESS
	 * 2. 1st 2chars A : AACD => CD - SUCCESS
	 * 3. 2nd char A : BACD => BCD - SUCCESS
	 * 4. no 1st A's : BBAA => BBAA - SUCCESS
	 * 5. 1st last A's : AABAA => BAA - SUCCESS
     */
    RemoveTwoAChars remove_1st_2A_char;

    @BeforeEach
    public void setUp() throws Exception {
        remove_1st_2A_char = new RemoveTwoAChars();
    }

    @Test
    public void test1stChar() {
        assertEquals("BCD", remove_1st_2A_char.removeAChars("ABCD"));
    }

    @Test
    public void test1st2Chars() {
        assertEquals("CD", remove_1st_2A_char.removeAChars("AACD"));
    }

    @Test
    public void test2ndChar() {
        assertEquals("BCD", remove_1st_2A_char.removeAChars("BACD"));
    }

    @Test
    public void testNo1st2AChars() {
        assertEquals("BBAA", remove_1st_2A_char.removeAChars("BBAA"));
    }

    @Test
    public void testChars() {
        assertEquals("BAA", remove_1st_2A_char.removeAChars("AABAA"));
    }
}
