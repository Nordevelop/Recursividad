unit Fibo;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls;

type
  TForm1 = class(TForm)
    txtTermino: TEdit;
    Button1: TButton;
    Label1: TLabel;
    txtFib: TEdit;
    Label2: TLabel;
    procedure Button1Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}
  //implementacion de la funcion recursiva
function Fibonacci(n:integer):integer;
begin
  if (n=0) or (n=1) then
    Fibonacci := 1
  else
    Fibonacci := Fibonacci(n-1) + Fibonacci(n-2);
end;
   //utilizacion de la funcion
procedure TForm1.Button1Click(Sender: TObject);
var
  numero:integer;
begin
     numero := strtoint(txtTermino.Text);
     txtFib.Text := inttostr(Fibonacci(numero));      //aqui se utiliza la funcion
end;

end.
