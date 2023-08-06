Write a function that takes a non-empty string of lowercase letters and a non-negative integer as input. 
The function should return a new string where each letter in the input string is shifted by a given number of positions in the alphabet. 
If the shift exceeds the letter 'z', it should wrap around to the letter 'a'.

Sample Input
string = "xyz"
key = 2
    
Sample Output
"zab"
    
class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
     StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                int shift = (ch - 'a' + key) % 26; // Calculate the new position after the shift
                char shiftedChar = (char) ('a' + shift); // Convert the new position back to a character
                result.append(shiftedChar);
            } else {
                // If the character is not lowercase, keep it unchanged
                result.append(ch);
            }
        }

        return result.toString();
  }
}
