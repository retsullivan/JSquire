import static org.junit.jupiter.api.Assertions.assertEquals;

import framework.StringKihonBase;

public class StringKihon extends StringKihonBase {

    @Override
    protected String convertToUpperCase(String data) {          //correct
        return data.toUpperCase();
    }

    @Override
    protected String convertToLowerCase(String data) {          //correct
        return data.toLowerCase();
    }

    @Override
    protected String Combine_Parts_Of_A_Name(String firstName, String middleName, String lastName) {
        String fullName = new String("");
        fullName= firstName + " " + middleName + " " + lastName;
        return fullName;
    }

    @Override
    protected String Combine_Two_Strings(String a, String b) {          //correct
        String c = a + b;
        return c;
    }

    @Override
    protected int Determine_The_Length_Of_A_String(String data) {       //correct
        return data.length();
    }

    @Override
    protected String Remove_All_Leading_Whitespace(String data) {       //return data.trim (or strip leading/strip trailing)
        return data.trim;
    }

    @Override
    protected String Remove_All_Trailing_Whitespace(String data) {      //return data.trim

        return data.trim;
    }

    @Override
    protected String[] Split_A_String_Into_An_Array(String input, char divider) {   //incorrect
        return input.split(String.valueOf(divider));
    }

    @Override
    protected String Join_An_Array_Into_A_String(String[] input, String divider) {  //incorrect
            String joinedString = String.join(divider, input);
            return joinedString;
        }
    }

    @Override
    protected boolean returnTrueIfAContainsB(String a, String b) {
        return a.contains(b);
    }

    @Override
    protected int determineThePositionOfAInB(String a, String b) {
        b.indexOf(a)
    }

    @Override
    protected boolean returnTrueIfAStartsWithB(String a, String b) {
        return a.startsWith(b)
    }

    @Override
    protected boolean returnTrueIsAEndsWithB(String a, String b) {
        return a.endsWith(b);
    }

    @Override
    protected String returnTheFourthThroughSeventhCharactersOfInput(String input) {
        return input.substring(4,7);
}