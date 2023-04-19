import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = length;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length)throws Exception{
        if(length>3){
            throw new Exception();
        }
        Random rand =new Random();
        String str = rand.ints(48, 123)
                .filter(num -> (num<58  &&  num>96))
                .limit(length-1)

                .mapToObj(c -> (char)c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
                .toString();
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        int randomInt=rand.nextInt((length-1)+1);
        sb.insert(randomInt,'@');
        String str1=sb.toString();
        return str1;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is a fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        long nInLOng=Long.valueOf(n);
        Lecture4Exercises l4=new Lecture4Exercises();
        long x=0;
        int i=1;
        while(x<=n){
            long fib= l4.fibonacci(i);
            int fibInInt=(int) fib;
            long fibobin= Long.parseLong(Integer.toBinaryString(fibInInt));
            x=fib+fibobin;
            if(nInLOng==x){
                return true;
            }
            i++;
        }
        return false;
    }
}
