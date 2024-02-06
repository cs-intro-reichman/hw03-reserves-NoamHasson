/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) { 
        
        String ans = "";
        int checker = 0;

        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            for (int j =0;j<ans.length();j++) {
                char chans = ans.charAt(j);

                if ( ch==32&&chans==32) {
                    checker++;
                }
                if ( ch!=chans ) {
                    checker++;
                } 
            }
            if ( checker == ans.length() ) {
                ans +=ch;
                }
                checker = 0;
            
        }
        
        return ans;
    }
}