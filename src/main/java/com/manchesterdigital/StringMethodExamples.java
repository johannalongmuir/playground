package com.manchesterdigital;

public class StringMethodExamples {
    public static void main(String[] args) {
        // concatenation using +. Prints 123
        String st = "1";
        st += "2";
        st += 3;
        System.out.println(st);

        // concatenation using the method. As String is immutable calling method on it not change it. Prints 12 only
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);


        String string = "animals";
        string.toUpperCase();
        System.out.println(string); // immutable so will be as originally inputted as not assigned to new
        System.out.println(string.toUpperCase()); // will print as the uppercase version
        String uppercaseString = string.toUpperCase(); // okay to assign to uppercase version then print that
        System.out.println(uppercaseString);

        System.out.println("ABc123".toLowerCase());


        String start = "AniMaL   ";
        String trimmed = start.trim();                 // "AniMaL"
        String lowercase = trimmed.toLowerCase();      // "animal"
        String result = lowercase.replace('a', 'A');   // "Animal"
        System.out.println(result);

        //method chaining of the above. Both are equiv. Will still create 4 String objects. Start at left when reading
        String result2 = "AniMaL   ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result2);


        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a); // a=abc
        System.out.println("b=" + b); // b=A23. b is set to point to new variable through method chaining

        // String builder is not immutable like string so can do as below. Code reuses the same StringBuilder
        // without creating an interim String each time.
        StringBuilder alpha = new StringBuilder();
        alpha.append("hey");
        alpha.append("you");
        System.out.println(alpha);


        StringBuilder sb = new StringBuilder().append("animals");
        sb.delete(0, 2); // removed up until 2. i.e ani (2=i)
        sb.deleteCharAt(0); // removes single character. When taken out index updates. 0 now what was 2 originally
        System.out.println(sb);
        sb.insert(0, "a"); //insert at 0
        sb.insert(1, "ni"); // insert starting at 1
        int length = sb.length();
        System.out.println(length); //back to 7
        System.out.println(sb); // prints animals


        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y);    // true




    }

}
