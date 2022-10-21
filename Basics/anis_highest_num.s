.include "common.i"
.text
.entry main

  main : 

        GetInt ask1, num1
        GetInt ask2, num2
      
        mov rax, num1
        mov rbx, num2
        cmp rax, rbx
        jg over
        PutInt tell2
        ret

over: PutInt tell1
    ret
ask1 : .string " Enter the num1 : \n"
ask2 : .string " Enter the num2 : \n"
tell1 : .string " num1 is greater \n "
tell2 : .string " num2 is greater \n "

.data
 num1 : .quad 0
 num2 : .quad 0
         
         .end
