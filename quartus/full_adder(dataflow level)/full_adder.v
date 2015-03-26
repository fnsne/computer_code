module full_adder_1bit(sum, car_out, car_in, a, b);

input car_in, a, b;
output sum, car_out;

wire sum, car_out, car_in, a, b, out1, out2, out3;

assign out1 = a ^ b;
assign sum = out1 ^ car_in;
assign out2 = car_in & out1;
assign out3 = a & b;
assign car_out = out2 | out3;

endmodule

module full_adder_4bit(sum, car_out, car_in, a, b);

input car_in, a, b;
output sum, car_out;

wire [3:0] sum, a, b;
wire car_out, car_in, car1, car2, car3;

full_adder_1bit adder1( sum[0], car1, car_in, a[0], b[0] );
full_adder_1bit adder2( sum[1], car2, car1, a[1], b[1] );
full_adder_1bit adder3( sum[2], car3, car2, a[2], b[2] );
full_adder_1bit adder4( sum[3], car_out, car3, a[3], b[3] );

endmodule

module full_adder(sum, car_out, car_in, a, b);

input car_in, a, b;
output sum, car_out;

wire [15:0]sum, a, b;
wire car_out, car_in, car1, car2, car3;

full_adder_4bit adder1( sum[3:0], car1, car_in, a[3:0], b[3:0] );
full_adder_4bit adder2( sum[7:4], car2, car1, a[7:4], b[7:4] );
full_adder_4bit adder3( sum[11:8], car3, car2, a[11:8], b[11:8] );
full_adder_4bit adder4( sum[15:12], car_out, car3, a[15:12], b[15:12] );

endmodule
