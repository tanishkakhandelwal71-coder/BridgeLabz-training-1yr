import java.util.Scanner;
public class Problem5 {
public static char[] findUniqueCharacters(String text) {
String uniqueCharsStr = "";
for (int i = 0; i < text.length(); i++) {
boolean isUnique = true;
for (int j = 0; j < uniqueCharsStr.length(); j++) {
if (text.charAt(i) == uniqueCharsStr.charAt(j)) {
isUnique = false;
break;
}
}
if (isUnique) {
uniqueCharsStr += text.charAt(i);
}
}
return uniqueCharsStr.toCharArray();
}
public static String[][] findCharacterFrequencies(String text) {
int[] frequency = new int;
for (int i = 0; i < text.length(); i++) {
frequency[text.charAt(i)]++;
}
char[] uniqueChars = findUniqueCharacters(text);
String[][] charFrequencies = new String[uniqueChars.length];
for (int i = 0; i < uniqueChars.length; i++) {
char currentChar = uniqueChars[i];
charFrequencies[i] = String.valueOf(currentChar);
charFrequencies[i] = String.valueOf(frequency[currentChar]);
}
return charFrequencies; } 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
String[][] frequencies = findCharacterFrequencies(input);
System.out.println("Character frequencies:");
for (String[] entry : frequencies) {
System.out.println("'" + entry + "': " + entry);
}
scanner.close();
} }