#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    printf("%d",(n / 10000) + (n / 1000 % 10) + (n / 100 % 10) +
    (n / 10 % 10) + (n % 10) );

    return 0;
}