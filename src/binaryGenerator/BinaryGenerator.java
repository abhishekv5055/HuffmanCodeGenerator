/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    private String binary(String userInputStringInLowerCase) {
        char[] chars = userInputStringInLowerCase.toCharArray();
        String binaryCode = "";
        for (int i = 0; i < chars.length; i++) {
            int letters = chars[i];
            binaryCode = binaryCode + Integer.toBinaryString(letters);
        }
        return binaryCode;
    }

    public String convertNormalStringToBinaryString() {
        return null;
    }
}
