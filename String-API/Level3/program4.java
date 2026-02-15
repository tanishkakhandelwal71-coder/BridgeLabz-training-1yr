import java.util.Scanner;
public class Problem4 {
public static String[][] findCharacterFrequencies(String text) {
int[] frequency = new int;
for (int i = 0; i < text.length(); i++) {
frequency[text.charAt(i)]++;
}
int uniqueCount = 0;
for (int i = 0; i < 256; i++) {
if (frequency[i] > 0) {
uniqueCount++;
}
}
String[][] charFrequencies = new String[uniqueCount];
int index = 0;
for (int i = 0; i < 256; i++) {
if (frequency[i] > 0) {
charFrequencies[index] = String.valueOf((char) i);
charFrequencies[index] = String.valueOf(frequency[i]);
index++;
}
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
