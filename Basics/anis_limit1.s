.include "common.i"
.text
.entry main
   main :
        GetInt ask1, num
        mov rbx, num
        mov rax, 1
        mov rcx, 0
 1 :    mov rdx, 10
        mul rdx
        inc rcx
        cmp rax, rbx
        jle 1b
        mov rax, rcx
        PutInt tell
        ret

ask1 : .string "Enter the num : \n"
tell : .string "The given number has a digits of \n"


     .data
   num : .quad 0
   
 
  .end
      
        
       

