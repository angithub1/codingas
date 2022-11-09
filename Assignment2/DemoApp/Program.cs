using HospLib;




    int a = int.Parse(args[0]);
    string b = args[1];
    int c = int.Parse(args[2]); 
    int d = int.Parse(args[3]);
    
    Patient p = new Patient (a, b, c, d);
    Console.WriteLine ("current bill= {0}", p.GetBillAmount());
    InHousePatient hp = new InHousePatient (a, b, c, d);
   Console.WriteLine ("Inhouse patient  bill= {0}", hp.GetBillAmount());




