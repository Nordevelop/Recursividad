#include <stdio.h>
int main()
{
int n, a=0,b=1,temp,i;
printf("ingrese hasta que Nro hacer Fibonacci: ");
scanf("%d",&n);
printf("%d %d ",a,b);
for(i=2;i<n;i++){
    temp= a+b;
    a=b;
    b= temp;
    printf("%d", temp);
}
return 0;
}
