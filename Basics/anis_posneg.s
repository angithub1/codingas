.include "common.i"
.text
.entry main

main:
      GetInt asku, number
      mov rax, number
      mov rbx, 0
      cmp rax, rbx
      jge out
      PutInt tell1
      ret
      
    out :  PutInt tell2
           ret

asku : .string "Enter any integer : \n"
tell1 : .string "Entered number is negative \n"
tell2 : .string "Entered number is Positive \n"
     
        .data

   number : .quad 0

  .end
