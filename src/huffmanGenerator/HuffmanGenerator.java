/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package huffmanGenerator;

public class HuffmanGenerator {
    private String userInputStringInLowerCase;

    public HuffmanGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    private String huffmanCode(String userInputStringInLowerCase) {
        char[] letters = userInputStringInLowerCase.toCharArray();
        String huffmanString = "";
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a')
                huffmanString = huffmanString + "1010";
            else if (letters[i] == 'b')
                huffmanString = huffmanString + "100000";
            else if (letters[i] == 'c')
                huffmanString = huffmanString + "00000";
            else if (letters[i] == 'd')
                huffmanString = huffmanString + "10110";
            else if (letters[i] == 'e')
                huffmanString = huffmanString + "010";
            else if (letters[i] == 'f')
                huffmanString = huffmanString + "110011";
            else if (letters[i] == 'g')
                huffmanString = huffmanString + "100010";
            else if (letters[i] == 'h')
                huffmanString = huffmanString + "0001";
            else if (letters[i] == 'i')
                huffmanString = huffmanString + "0110";
            else if (letters[i] == 'j')
                huffmanString = huffmanString + "1100001011";
            else if (letters[i] == 'k')
                huffmanString = huffmanString + "11000011";
            else if (letters[i] == 'l')
                huffmanString = huffmanString + "10111";
            else if (letters[i] == 'm')
                huffmanString = huffmanString + "1100010";
            else if (letters[i] == 'n')
                huffmanString = huffmanString + "0111";
            else if (letters[i] == 'o')
                huffmanString = huffmanString + "1001";
            else if (letters[i] == 'p')
                huffmanString = huffmanString + "100001";
            else if (letters[i] == 'q')
                huffmanString = huffmanString + "1100001001";
            else if (letters[i] == 'r')
                huffmanString = huffmanString + "0010";
            else if (letters[i] == 's')
                huffmanString = huffmanString + "0011";
            else if (letters[i] == 't')
                huffmanString = huffmanString + "1101";
            else if (letters[i] == 'u')
                huffmanString = huffmanString + "00001";
            else if (letters[i] == 'v')
                huffmanString = huffmanString + "1100000";
            else if (letters[i] == 'w')
                huffmanString = huffmanString + "110001";
            else if (letters[i] == 'x')
                huffmanString = huffmanString + "1100001000";
            else if (letters[i] == 'y')
                huffmanString = huffmanString + "100011";
            else if (letters[i] == 'z')
                huffmanString = huffmanString + "1100001010";
        }
        return huffmanString;
    }

    public String convertNormalStringToHuffmanString() {
        return huffmanCode(userInputStringInLowerCase);
    }
}
