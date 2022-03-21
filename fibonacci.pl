#/usr/shar/perl
# Sucesion Fibonacci
# Author Nordevelop
 
my ($uno,$dos) = ("0","1");
my $cantidad = "10";
 
for my $num(0..$cantidad) {
print $uno."\n";
my $final = $uno + $dos;
$uno = $dos;
$dos = $final;
}
