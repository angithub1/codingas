.include "common.i"
.text
.entry main

main:

     GetInt asku number
     mov rax, number
     mov rbx, rax
     add rbx, 1
     mul rbx
     PutInt tell
     
     ret

asku: .string "Enter the number : \n"
tell: .string "The addition of the number : \n"

        .data

    number: .quad 0
    addition: .quad 0

.end
