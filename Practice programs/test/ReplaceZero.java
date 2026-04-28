import java.util.*;
public class DuplicateElements{
public static void main(String[]args){


int num = 102030;
int result = 0, place = 1;

while (num > 0) {
    int digit = num % 10;

    if (digit == 0) {
        digit = 1;
    }

    result = digit * place + result;
    place *= 10;
    num /= 10;
}

System.out.println(result);