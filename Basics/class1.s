.include "common.i"
.text
.entry main


main: 

      GetInt asku label



      PutInt tell
      PutMsg greet
      ret


asku:
tell:
greet:

       .data
     label: .quad 0
     
     label: .quad 0

.end
