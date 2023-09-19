package co.edu.escuelaing.arep;

public class Functionalities {

    public static void main(String[] args) {

    }

    public Double cosin(String number) {
        Double convNumber = Double.parseDouble(number);
        return Math.cos(convNumber);
    }

    public Double sin(String number) {
        Double convNumber = Double.parseDouble(number);
        return Math.sin(convNumber);
    }

    public Boolean palindrome(String word) {
        Boolean palin = true;
        int len = word.length();
        for (int i = 0; i < (len / 2); ++i) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                palin = false;
            }
        }
        return palin;
    }

    public Double magnitude(String vector1, String vector2) {
        Double result = 0.0;
        return result;
    }

}