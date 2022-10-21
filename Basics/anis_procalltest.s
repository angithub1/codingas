.include "common.i"
.extern GCD
.text
.entry main

   main :  
           mov rbp, rsp
           sub rsp, 16
           GetInt ask1, rbp-8
           GetInt ask2, rbp-16
           mov rdi, [rbp-8]
           mov rsi, [rbp-16]
           call GCD
           PutInt tell
           mov rsp, rbp
           ret
           
ask1 : .string "Enter the number 1 : \n"
ask2 : .string "Enter the number 2 : \n"
tell : .string "The Highest common factor is \n"
  .end
