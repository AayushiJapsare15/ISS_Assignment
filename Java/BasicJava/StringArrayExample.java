package BasicJava;
public class StringArrayExample {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");

        System.out.println(a == b);        // false 
        System.out.println(a.equals(b));   // true 

        //arrays

        int[] arr1 = new int[5];      // size fixed
        int[] arr2 = {1,2,3,4};    

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        String[] names = {"Aayushi", "Rahul", "Sneha"};

        for(String name : names){
            System.out.println(name.toUpperCase());
        }

        //string manipulation

        String s1 = "  Java Programming  ";
        String s2 = "java programming";
        String s3 = "Hello";
        String s4 = "World";

        System.out.println("Length: " + s1.length());
        System.out.println("Trimmed: '" + s1.trim() + "'");
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        System.out.println("Equals: " + s1.trim().equals(s2));
        System.out.println("Char at index 2: " + s3.charAt(2));
        System.out.println("Substring (0 to 4): " + s3.substring(0, 4));
        
        System.out.println("Contains 'Java': " + s1.contains("Java"));

        System.out.println("Starts with '  Ja': " + s1.startsWith("  Ja"));
        System.out.println("Ends with '  ': " + s1.endsWith("  "));

        System.out.println("Index of 'a': " + s1.indexOf('a'));
        System.out.println("Last index of 'a': " + s1.lastIndexOf('a'));

        System.out.println("Replace a with @: " + s1.replace('a', '@'));

        System.out.println("Concat: " + s3.concat(" ").concat(s4));

        String[] words = s1.trim().split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("CompareTo: " + s3.compareTo(s4));

        






    }
    
}
