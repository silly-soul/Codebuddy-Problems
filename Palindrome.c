/* Author: Aditya Agrawal
   https://codebuddy.co.in/problems/LOOPPALIN */
#include <stdio.h>

void palindrom(long long int i){
long long int x,n,sum=0;
n=i;
while(i!=0){
x=i%10;
sum=sum*10+x;
i=i/10;
}
if(sum==n){
printf("Yes\n");
}else{
printf("No\n");
}

}
int main(void){
long long int n,p;
scanf("%lld",&n);
while(n--){
scanf("%lld",&p);
palindrom(p);
}
return 0;
}