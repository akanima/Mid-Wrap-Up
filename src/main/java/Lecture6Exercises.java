import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum=0;
        for(int i=0 ; i<arr.length;i++){
            if(i%2==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int beginIndex=0;
        int endIndex= arr.length-1;
        int temp;
        while(beginIndex<endIndex){
            temp=arr[beginIndex];
            arr[beginIndex]=arr[endIndex];
            arr[endIndex]=temp;
            beginIndex++;
            endIndex--;
        }
        return arr;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        int row1= m1.length;
        int col1=m1[0].length;
        int row2=m2.length;
        int col2=m2[0].length;
        if(col1!=row2){
            throw new IllegalArgumentException();
        }
        double m3[][]=new double[row1][col2];
        for(int i=0 ;i<row1;i++){
            for(int j=0 ;j<col2;j++){
                for (int k=0; k<row2;k++){
                    m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
                }
            }
        }
        return m3;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> list = Arrays.stream(names)
                .map(Arrays::asList)
                .collect(Collectors.toList());
        return list;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        ArrayList<Integer> primeFactor=new ArrayList<>();
        if(n%2==0){
            primeFactor.add(2);
        }
        for (int i = 3; i <=n; i += 2) {
            while (n % i == 0) {
                primeFactor.add(i);
                n /= i;
            }
        }
        return primeFactor;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        ArrayList<String> wordsInString=new ArrayList<>();
        String line1=line.replaceAll(",","");
        String line2=line1.replaceAll("\\?","");
        String line3=line2.replaceAll("!","");
        for(String res: line3.split(" ")){
            wordsInString.add(res);
        }
        return wordsInString;
    }
}