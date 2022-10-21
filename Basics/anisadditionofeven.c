.include "common.i"
.text
.entry main

     main : 
            GetInt asku, N
	    mov rax, N
	    mov rbx, rax
	    mul rbx
	    PutInt tell
	    ret
	    
asku : .string "Enter the first N numbers : \n"
tell : .string "The addition is \n"
 
     .data
     N : .quad 0
      .end
