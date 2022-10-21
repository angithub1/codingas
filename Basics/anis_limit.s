.include "common.i"
.text
.entry main

 main : 
      GetInt ask1, lower
      GetInt ask2, upper
      mov rax, lower
      cmp rax, upper
      jg out
      sub rax, 1
      mov rbx, rax
      add rbx, 1
      mul rbx
      shr rax
      mov rcx, rax
      
      mov rax, upper
      mov rbx, rax
      add rbx, 1
      mul rbx
      shr rax
      sub rax, rcx
      PutInt tell
 out :PutMsg greet
      ret
ask1: .string "Enter the lower limit : \n"
ask2: .string "Enter the upper limit : \n"
tell: .string " The addition of numbers = \n"
greet : .string "You have entered wrong details \n"


     .data

   lower : .quad 0
   upper : .quad 0

    .end
       
      


        
