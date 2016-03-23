//Binary Conversion
#include<stdio.h>
#include<math.h>
int main(void)
{
	int a, temp, bin=0, k=0;
	printf("Enter the number to be converted to binary : ");
	scanf("%d",&a);
	while(a>0)
	{
		temp=a%2;
		temp=temp*pow(10,k);
		bin=bin+temp;
		a=a/2;
		k++;
		
		printf("%d\n", bin);
	}
	printf("\nThe binary equivalent is : %d",bin);
	return 0;
}
