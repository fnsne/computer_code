.data
	begin:.asciiz "please enter which fact you want to know\n"
	end:.asciiz "the answer is "
.text
	li $v0 4
	la $a0 begin
	syscall
	
	li $v0 5
	syscall
	
	add $a0 $v0 $zero
	
	
	jal fact
	add $t0 $v0 $zero
	
	li $v0 4
	la $a0 end
	syscall
	
	li $v0 1
	add $a0 $t0 $zero
	syscall
	
	li $v0 10
	syscall
fact:
	#callee save
	addi $sp $sp -8
	sw $ra 4($sp)
	sw $a0 0($sp)
	slti $t0 $a0 1  # test n < 1
	beq $t0 $zero L1 # if n not < 1 goto L1
	# if n < 1
	addi $v0 $zero 1
	addi $sp $sp 8
	jr $ra
L1:
	# f(n) = n * f( n-1 )
	addi $a0 $a0 -1
	jal fact
	lw $a0 0($sp)
	lw $ra 4($sp)
	addi $sp $sp 8
	mul $v0 $a0 $v0
	jr $ra
	
	
	
	
	
	
	
	
	
	