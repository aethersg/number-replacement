package fizzbuzz;

/**
 *
 * @author judetan
 */
public class Fizzbuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder(800);
        for (int i = 1; i <= 100; i++) {
            if (i% 15 == 0) {
                output.append("FizzBuzz\n");
            }else if (i%3==0){
            output.append("Fizz\n");
            }else if (i%5==0){
            output.append("Buzz\n");
            }else{
            output.append(i);
            output.append("\n");
            }
        }
        System.out.println(output);
    }

}
