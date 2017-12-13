import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithutRepTest {

    @Test
    public void lengthOfLongestSubstring() {

        LongestSubstringWithoutRep a = new LongestSubstringWithoutRep();

        // Given "abcabcbb", the answer is "abc", which the length is 3.
        assertEquals(3, a.lengthOfLongestSubstring("abcabcbb"));

        //Given "bbbbb", the answer is "b", with the length of 1.
        assertEquals(1, a.lengthOfLongestSubstring("bbbbb"));


        //Given "pwwkew", the answer is "wke", with the length of 3.
        assertEquals(3, a.lengthOfLongestSubstring("pwwkew"));
    }


}