.intel_syntax noprefix
.text

GCD : 
         
    1 :  cmp rdi, rsi
         je 3f
         jg 2f
    2 :  sub rdi, rsi
         jmp 1b
         cmp rdi, rsi
         jmp 1b
    3 :  mov rax, rdi
         ret

          .global gcd
          .type gcd @function
        .end
