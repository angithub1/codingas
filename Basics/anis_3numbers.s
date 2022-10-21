.include "common.i"
.text
.entry main

  main : 

        GetInt ask1, num1
        GetInt ask2, num2
        GetInt ask3, num3
        mov rax, num1
        mov rbx, num2
        mov rcx, num3
        cmp rax, rbx
        jg over
        cmp rbx, rcx
        jg out
        cmp rcx, rax
        jg in
        

over: PutInt tell1
    ret
out: 
 mov rax,rbx 
PutInt tell2
    ret
in:
mov rax,rcx
 PutInt tell3
    ret
ask1 : .string " Enter the num1 : \n"
ask2 : .string " Enter the num2 : \n"
ask3 : .string " Enter the num3 : \n"
tell1 : .string " num1 is greater \n "
tell2 : .string " num2 is greater \n "
tell3 : .string " num3 is greater \n "

.data
 num1 : .quad 0
 num2 : .quad 0
 num3 : .quad 0
         
         .end
