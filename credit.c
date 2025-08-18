#include <stdio.h>

int main(void) {
    long number;

    printf("Number: ");
    scanf("%ld", &number);

    int digits = 0;
    long temp = number;
     while (temp >0) {
        temp /= 10;
        digits++;
     }

     int sum = 0;
     int position = 0;
     long temp2=number;
     while (temp2> 0) {
        int digit = temp2 % 10;
        if (position %2 == 1) {
            int double_num = digit * 2;
            sum += double_num / 10 + double_num%10;
        } else {
            sum += digit;
        }
        temp2 /= 10;
        position ++;
     }

     if (sum % 10 != 0) {
        printf("INVALID\n");
        return 0;
     }

    long start_digits = number;
    while (start_digits >= 100) {
        start_digits /= 10;
    }
    int first_digit = start_digits / 10;
    int first_two = start_digits;

    if (digits == 15 && (first_two == 34 || first_two == 37))
    {
        printf("AMEX\n");
    }
    else if (digits == 16 && (first_two >= 51 && first_two <= 55))
    {
        printf("MASTERCARD\n");
    }
    else if ((digits == 13 || digits == 16) && first_digit == 4)
    {
        printf("VISA\n");
    }
    else
    {
        printf("INVALID\n");
    }

    return 0;
}
