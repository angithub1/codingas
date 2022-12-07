// alert("hello")

function myFunction()
{
    // console.log("hello");
    var amount=document.getElementById('a1').value;
    var rateOfInterest=document.getElementById('a2').value;
    var period=document.getElementById('a3').value;
    
    // console.log(amount,rateOfInterest,period);
    // console.log(typeof amount,typeof rateOfInterest,typeof period);
    if(amount==""||rateOfInterest==""||period=="")
    {
        alert("Please Pass all Value")
    }
    else
    {
        // var x="";
        amount=parseInt(amount);
        rateOfInterest=parseFloat(rateOfInterest);
        period=parseInt(period);

        var interest = (amount * rateOfInterest * period)/100;
        var totalAmount = amount + interest;
        // console.log(interest,totalAmount);

        // x=x+`
        //   <tr>
        //        <td>${interest}</td>
        //        <td>${totalAmount}</td>
        //   </tr>
        // `
        // console.log(x);
        // console.log(document.getElementById("result"));
        // document.getElementById("result").innerhtml= x
        console.log(interest);
        console.log(document.getElementById("result1"));
        document.getElementById("result1").innerHTML=interest;

        console.log(totalAmount);
        console.log(document.getElementById("result2"));
        document.getElementById("result2").innerHTML=totalAmount;


    }
   
}

