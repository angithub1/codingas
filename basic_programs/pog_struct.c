 #include<stdio.h>

struct Employee

{

     int empno;
     short age;
     int sal;
};

int main()

{
	struct Employee Emp;
	Emp.empno=101856159;
	Emp.age=24;
	Emp.sal=50000;

	printf("Employee %d is of %hd years and has %d salary\n",Emp.empno,Emp.age,Emp.sal);

	return 0;

}
