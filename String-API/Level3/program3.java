import java.util.Scanner;
public class Problem3 {
public static char findFirstNonRepeating(String text) {
int[] frequency = new int;
for (int i = 0; i < text.length(); i++) {
frequency[text.charAt(i)]++;
}
for (int i = 0; i < text.length(); i++) {
if (frequency[text.charAt(i)] == 1) {
return text.charAt(i);
}
}
return '\0';
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
char firstNonRepeating = findFirstNonRepeating(input);
if (firstNonRepeating != '\0') {
System.out.println("The first non-repeating character is: " + firstNonRepeating);
} else {
System.out.println("There are no non-repeating characters in the string.");
}
scanner.close();
}
}