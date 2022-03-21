program   fibonacci;
uses    Dos;
const TiempoLimite=5;
        max=10000;
type
  {estructura que almacena un numero digito a digito}
  BigNum = record
             d : array[0..max] of byte;{arreglo  donde se guardan los digitos}
             l : Integer;{cant. de digitos del numero}
           end;{bignum}
var
  N,j,i      : Integer;
  x,x1,x2,f  : Int64;
  a,b,sum    : bignum;
  fs         : Text;

function Fib(k:Integer):Int64;
var i:Integer;
begin
  for i:=2 to k do 
  begin
    x:=x1+x2;
    x1:=x2;
    x2:=x;
  end;
  Fib:=x;
end;{Fib}

{procedimiento para llevar un numero a BigNum}
procedure Toma(var k:bignum;m:int64);
var d:byte;
    ind: Integer;
begin
  ind:=-1;
  repeat
    d:=m mod 10;
    m:=m div 10;
    inc(ind);
    k.d[ind]:=d;
  until m<=0;
  k.l:=ind;
end;{toma}


procedure Suma;
var
   fin,i    : Integer;
   llevo,s  : Byte;
begin
    fin:=a.l;
    if b.l>fin then fin:=b.l;
    llevo:=0;
    for i:=0 to fin do begin
      s:=a.d[i] + b.d[i] + llevo;
      sum.d[i]:=s mod 10;
      llevo:=s div 10;
    end;{for i}
    sum.l:=fin;
    if llevo>0 then begin
      inc(sum.l);
      sum.d[sum.l]:=1;
    end;{if}
end;{Suma}

begin
  Assign(fs,'FIB.txt');Rewrite(fs);
  x1:=0;x2:=1;x:=1;
  WriteLn('Escriba el valor de N para calcular Fib(n): ');
  ReadLn(N);
  if n=0 then
    Writeln(fs,0)
  else
   if n<93 then
     WriteLn(fs,fib(n))
   else begin
     f:=fib(92);
     Toma(a,x1);
     Toma(b,x2);
     for i:=93 to N do begin
       Suma;
       a:=b;
       b:=sum;
     end;{for i}
     for i:=sum.l downto 0 do Write(fs,sum.d[i]);
     Writeln;
   end;{else}
   close(fs)
end.
WriteLn("Fin de la sucesion de fibonacci");


