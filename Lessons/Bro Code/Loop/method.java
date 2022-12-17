package Loop;

public class method {
    
    public static void main(String[] args) {
         
        int numbers[] = {1, 2, 3, 4, 5};

        int sum = summation(numbers);
        System.out.println(sum);

    }

    public static int summation(int numbers[]) {

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;

    }

}
