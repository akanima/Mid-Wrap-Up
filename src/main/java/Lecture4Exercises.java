public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int d=1;
        if(n==0){
            return 1;
        }
        else {
            for(int i=1;i<=n; i++){
                d=d*i;
            }
        }
        return d;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        char[] stringCharacters=word.toCharArray();
        int beginIndex=0;
        int endIndex=word.length()-1;
        char temp;
        while(endIndex>beginIndex){
            temp=stringCharacters[beginIndex];
            stringCharacters[beginIndex]=stringCharacters[endIndex];
            stringCharacters[endIndex]=temp;
            endIndex--;
            beginIndex++;
        }
        String reversedWord=new String(stringCharacters);
        return reversedWord;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        String line1=line.replaceAll(" ","");
        String line2=line1.toLowerCase();
        int beginIndex=0;
        int endIndex=line2.length()-1;
        char[] stringCharacters=line2.toCharArray();
        int counter=0;
        while(beginIndex<endIndex){
            if(stringCharacters[beginIndex]==stringCharacters[endIndex]){
                counter++;
            }
            beginIndex++;
            endIndex--;
        }
        if(counter==line2.length()/2){
            return true;
        }

        return false;
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {

        char[][] result=new char[str1.length()][str2.length()];
        for(int i=0 ;i<str1.length();i++){
            for(int j=0 ; j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    result[i][j] = '*';
                }
                else{
                    result[i][j] = ' ';
                }
            }
        }
        return result;
    }
}
