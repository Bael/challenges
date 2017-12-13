import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class LongestSubstringWithoutRep {
        public int lengthOfLongestSubstring(String s) {
            int start = 0;
            int finish = 0;

            int maxlen = 0;

            // temp set of elements
            HashSet<String> subseq = new HashSet<>();
            while (finish < s.length()) {

                String currentSymbol = s.substring(finish, finish+1);

                // if found repetition, clear current sequence and update maxlen if needed.
                if (subseq.contains(currentSymbol)) {
                    maxlen = Math.max(maxlen, subseq.size());

                    // starting new sequence
                    subseq.clear();
                    start++;
                    finish = start;

                } else {
                    // growing
                    subseq.add(currentSymbol);
                    finish++;
                }

            }

            // edge case: if end of string is unique
            maxlen = Math.max(maxlen, subseq.size());

            return maxlen;

        }

}