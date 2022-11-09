namespace GeoLib;
public class Banner
{
    private float width;
    private float height;
  
   public Banner()
   { 
     width = 20f;
     height = 15f;
   }
      
public Banner(float width ,float height)
{
   this.width = width;
   this.height = height;   
}
    public float Width
        {
            get { return width; }
            set { width = value; }
        }
    
     public float Height 
     {
        get { return height;}
        set { height = value;}
     }

     public virtual float Area()
     {
      return width * height;
     }

     
}
   