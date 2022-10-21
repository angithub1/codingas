.include "common.i"
.text
.entry main 
  main : 

        GetInt ask1, num1
        GetInt ask2, num2
        GetInt ask3, num3
        GetInt ask4, num4
        mov rax, num1
        mov rbx, num2
        add rax, rbx
        mov rbx, num3
        add rax, rbx
        mov rbx, num4
        add rax, rbx
        shr rax
        shr rax
        
        PutInt tell
        ret

ask1 : .string "enter the num1  \n"
ask2 : .string "enter the num2  \n"
ask3 : .string "enter the num3  \n"
ask4 : .string "enter the num4  \n"
tell : .string "The average is \n"
    
       .data 

     num1 : .quad 0
     num2 : .quad 0
     num3 : .quad 0
     num4 : .quad 0
     
   
.end
