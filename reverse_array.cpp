/*author: rishav krishna(https://github.com/rishu22)*/
#include<iostream>
using namespace std;
int main()
{
	int input[10],output[10],count,i;
	
	cout<<"Enter the number of element in array:\n";
	cin>>count;
	
	cout<<"Enter " <<count<< " Element:\n";
	
	for(i=0;i<count;i++)
	{
		cin>>input[i];
	}
	for(i=0;i<count;i++)
	{
		output[i]=input[count-i-1];
	}
	cout<<"Array in reverse order is:\n";
	for(i=0;i<count;i++)
	{
		cout<<output[i]<<" ";
	}
}
