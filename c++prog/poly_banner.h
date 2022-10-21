class Banner
{
  public :
	  Banner()
	  {
		  width = 20;
		  height = 5;
	  }

	  bool Resize(float w, float h)
	  {
		  if ( w >= h)
		  {
			  width = w;
			  height = h;
			  return true;
		  }
		return false;
	  }
	virtual double Area() const
	{
		return width * height;
	}

  private : 
           float width;
           float height;	   
};

class CurvedBanner : public Banner
{
	public : 
		CurvedBanner (float r = 1) : Banner()
	{
		radius = r;
	}
		double Area() const
		{
			return Banner :: Area() - 0.86 * radius * radius;
		}

	private : 
	float radius;	
};
