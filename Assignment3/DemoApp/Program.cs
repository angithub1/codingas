using GeoLib;

float a = float.Parse(args[0]);
float b = float.Parse(args[1]);
float c = float.Parse(args[2]);

Banner B = new Banner (a,b);
Console.WriteLine("The Area of rectangular banner is = {0}", B.Area());
CurvedBanner CB = new CurvedBanner(a,b,c);
Console.WriteLine("Area of curvedbanner is = {0}", CB.Area());
 


