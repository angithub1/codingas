.include "common.i"
.text
.entry main
main:

GetInt asku,sum
mov rax,sum
GetInt asku,sum1
mov rcx,sum1
add rax,rcx

PutInt tell
PutMsg greet
ret

asku: .string "enter the numbers"
tell: .string "addition of 2 numbers"
greet: .string "Goodbye user\n"

.data

sum: .quad 0
sum1: .quad 0
add: .quad 0


