#include <stdio.h>
#include <stdlib.h>

void update(int *a,int *b) {
    int* temp = &temp;
    int* temp2 = &temp2;

    *temp = *a + *b;
    *temp2 = abs(*a - *b);

    *a = *temp;
    *b = *temp2;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}