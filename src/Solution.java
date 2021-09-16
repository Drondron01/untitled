public class Solution {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'g', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();

        char[] chars1 =  {'g', '-', '-', '-', '-', 'l'};
        char[] chars2 =  {'m', '-', '-', '-', '-', 'r'};
        chars[1] = chars1;
        chars[2] = chars2;

      /*  for (int i = 1; i < chars.length+1; i++){

            chars[1][i] = '-';
            chars[2][i] = '-';

        }
*/
        //напишите тут ваш код

        printArray();
    }

    private static void printArray() {
        for (char[] aChar : chars) {
            for (int j = 0; j < aChar.length; j++) {
                System.out.print(aChar[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
