

class Employee
{

	private : 
		int id;
		int hrs;
		float rate;

	public : 
		Employee ()
		{
		   id = 101;
		   hrs = 100;
		   rate = 50;
		}

		Employee (int i, int h, float r)
		{
		    id = i;
		    hrs = h;
		    rate = r;
		}

		int Getid()
		{
			return id;
		}
		void Setid (int i)
		{
			id = i;
		}


};

#include<cstdio>

  int main(void)
   {
                Employee e;
		printf("The emp id is : %d\n", e.Getid());	
	     
   }
