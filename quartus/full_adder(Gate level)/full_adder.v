module full_adder_1bit(sum, car_out, car_in, a, b);

output sum, car_out;
input car_in, a, b;

wire sum, car_out, car_in, a, b;
wire out1, out2, out3;

xor xor1( out1, a, b );
xor xor2( sum, out1, car_in );
and and1( out2, out1, car_in );
and and2( out3, a, b );
or(car_out, out2, out3);

endmodule

module full_adder(sum, car_out, car_in, a, b);

output sum, car_out;
input car_in, a, b;

wire [3:0] sum, a, b;
wire car_out, car_in, car1, car2, car3;

full_adder_1bit adder1(sum[0], car1, car_in, a[0], b[0]);
full_adder_1bit adder2(sum[1], car2, car1, a[1], b[1]);
full_adder_1bit adder3(sum[2], car3, car2, a[2], b[2]);
full_adder_1bit adder4(sum[3], car_out, car3, a[3], b[3]);

endmodule
