/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addbinary;

//Topics: Math, String, Bit Manipulation, Simulation
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("01", "1011"));
    }

    public static String addBinary(String a, String b) {
        //Add enough 0's to the beginning of each string so that they are:
        //1: The same length and
        //2: They have an extra digit for a possible carry over number
        a = "0" + a;
        b = "0" + b;

        if (a.length() > b.length()){
            while (a.length() != b.length()) {
                b = "0" + b;
            }
        } else if (a.length() < b.length()){
            while (a.length() != b.length()) {
                a = "0" + a;
            }
        }

        //Build the sum of the numbers onto output string
        String output = "";
        char temp = ' ';

        boolean carry = false;

        int combination = 0;
        //combination value pairs:
        //'0' + '0' = 96
        //'0' + '1' = 97
        //'1' + '1' = 98

        //Add the binary numbers
        for (int i = a.length() - 1; i >= 0; i--) {
            combination = a.charAt(i) + b.charAt(i);

            if (!carry) {
                //If there is not a carry over digit
                switch (combination) {
                    case 96:
                        temp = '0';
                        break;
                    case 97:
                        temp = '1';
                        break;
                    case 98:
                        temp = '0';
                        carry = true; //1 + 1 -> There will be a carry over digit
                        break;
                    default:
                        break;
                }
            } else {
                //If there is a carry over digit
                switch (combination) {
                    case 96:
                        temp = '1';
                        carry = false;
                        break;
                    case 97:
                        temp = '0';
                        break;
                    case 98:
                        temp = '1';
                        break;
                    default:
                        break;
                }  
            }
            output = temp+output;
        }
        
        //Remove any leading 0's
        if (output.charAt(0) == '1'){
            return output;
        }

        //Find the position of the first 1
        int pos = -1;
        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == '1'){
                pos = i;
                i = output.length();
            }
        }
        
        //If the sum is 0, there will be no 1 digits
        if (pos == -1){
            return "0";
        }
        
        return output.substring (pos);
    }
}
