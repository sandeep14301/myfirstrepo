Here’s a simple C program to demonstrate basic functionality. This program calculates the sum of two numbers entered by the user:

Copy code
#include <stdio.h>

int main() {
    int num1, num2, sum;

    // Asking the user for input
    printf("Enter the first number: ");
    scanf("%d", &num1);

    printf("Enter the second number: ");
    scanf("%d", &num2);

    // Calculating the sum
    sum = num1 + num2;

    // Displaying the result
    printf("The sum of %d and %d is: %d\n", num1, num2, sum);

    return 0;
}

How it works:
The program prompts the user to input two integers.
It calculates their sum using the + operator.
Finally, it displays the result.

Feel free to modify it to explore more!
