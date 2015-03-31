.data
	begin:.asciiz "---please enter two number that you want to add \n"
	end:.asciiz" the answer is "
.text
	li $v0 4
	la $a0 begin
	syscall
	
	li $v0 5
	syscall
	add $a0 $v0 $zero
	li $v0 5
	syscall
	add $a1 $v0 $zero
	jal leaf_example
	add $t0 $v0 $zero
	li $v0 4
	la $a0 end
	syscall
	li $v0 1
	add $a0 $t0 $zero
	syscall
	li $v0 10
	syscall
leaf_example:
	addi $sp, $sp, -4 #for push
	sw $s0, 0($sp)	  #push $s0
	add $t0, $a0, $a1 #program
	
	add $v0, $t0, $zero#Result
	lw $s0, 0($sp)		#Restore $s0
	addi $sp, $sp, 4	#pop
	jr $ra			#Return
