
public class str{    
public static void main(String args[]){    
    String s1 = "jaya";                 //Using string literal creating a string
    char[] ch = {'j','a','v','a'};
    String s2 = new String(ch);         // Using a new keyword to create a string
    String s3 = new String("Welcome");  // By using new keyword
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s1.charAt(2)); //CharAt() to return the character present at that index in the string
    System.out.println(s1.length());  //Retutrns the string length in integer
    System.out.println(s1.substring(1)); //Returns substring from the begin index specified till the end of the string
    System.out.println(s1.substring(0,3)); //Returns substring from the begin to end index
    System.out.println(s1.contains("ja")); // Contains a set of characters check and return boolean true / false
    System.out.println(s1.equals(s2)); //Check if 2 strings are equal (Returns true if they contain same content and with same case or returns false)
    System.out.println(s1.isEmpty()); //Returns boolean true or false if the string is empty or not
    String s4 = "learning";
    s1.concat(s4);
    System.out.println(s1); // Strings are immutable. So, the concat does not work like this
    s1 = s1.concat(s4); // Works fine now and returns the concatinated string
    System.out.println(s1);
    String str5 = s1.concat(s2).concat(s3);  
    System.out.println(str5);  
    System.out.println(s1.indexOf('j'));    //Returns starting index of the given character
    System.out.println(s2.indexOf('a', 2)); //Returns index of the character and starting from an index if specified
    System.out.println(s2.indexOf("ja"));
    String s7 = "Java is a good language";
    System.out.println(s7.replace('a','p')); // Replaces a character or set of characters with the given
    System.out.println(s7.replace("a good","an excellent"));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s3.toLowerCase()); //Convert entire string to lowercase
    System.out.println(s1.toUpperCase()); //Comvert entire string to uppercase
    int a = 9;
    String s9 = String.valueOf(a);  //Value of converts any type to string( int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string)
    System.out.println(s9);
    char[] arr = {'h','e','l','l','o'};
    String s8 = String.valueOf(arr);
    System.out.println(s8);
    String ns = "  hello    world    ";
    System.out.println(ns);
    System.out.println(ns.trim());  //Trim eliminates leading and trailing spaces
    String dope = "Java is a programming language";
    String[] words = dope.split("\\s");   //Split words of a string based on the reg expression given. Here it is whitespace.
    for(String w:words)
    {
        System.out.println(w);
    }
    String str3 = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr3 = str3.split("t",1);  //splits the string against given regular expression and returns a char array.

        for (String w : arr3) {  
            System.out.println(w);  
        }
}
}