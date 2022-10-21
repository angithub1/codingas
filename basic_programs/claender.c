#include<stdio.h>
int main(void)
{ 
	int day []= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	short month=0;
	printf("Enter the month [1-12] \n");
	scanf("%hd",&month);
	printf("The days in this month : %d\n", day[month-1] );



	}


