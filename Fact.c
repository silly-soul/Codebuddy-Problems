
/* Author: Aditya Agrawal
   https://codebuddy.co.in/problems/FACT */

#include<stdio.h>

int main(void) {
long long int T,i,f,n;

scanf("%lld",&T);

for(i=0;i<T;i++)
{ 
scanf("%lld",&f);
n=1;
while(f>0)
{
n=(f*n)%1000000007;
f--;
}

printf("%lld\n",n);
}


return 0;
}