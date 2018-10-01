/* Author: Aditya Agrawal
https://codebuddy.co.in/problems/RECTAREA */

#include <stdio.h>

int main(void) {

long long int x1,y1,x,y,area;
scanf("%lld %lld",&x1,&y1);
scanf("%lld %lld",&x,&y);

// your code goes here
area=(x1-x)*(y1-y);
printf("%lld",area);
return 0;
}
