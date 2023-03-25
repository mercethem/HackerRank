#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    const int MAX_LEN=100;
    char ch;
    char str[MAX_LEN];
    char sen[MAX_LEN];
    scanf("%c", &ch);
    scanf("%s\n", str);
    scanf("%[^\n]%*c", sen);
    scanf("\n");

    printf("%c\n", ch);
    printf("%s\n", str);
    printf("%s", sen);

    return 0;
}
