namespace GeoLib;

public class CurvedBanner : Banner 
{
    private float radius;

    public CurvedBanner(float w, float h, float r):base(w,h)
    {
      radius = r;  
    }

    public CurvedBanner():base()
    {
        radius = 0.1f;
    }

     public float Radius
     {
        get { return radius;}
        set {  radius = value;}
     }

     public override float Area()
     {
        float a = base.Area();
        return a - 0.86f * radius * radius;
     }
}
