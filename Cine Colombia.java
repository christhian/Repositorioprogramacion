class Cine Colombia {
public static void main (String[] args) {

	String a; String b; int c; int d; int e; int f; String g; int h; int i; int precio;

	System.out.println("Digite Tipo De Funcion Sea 2D o 3D  Digitar valores en MAYUSCULAS");
	a =   String.valueOf(System.console().readLine());
if ("3D".equals(a)){
	System.out.println("Tipo de Boleta Sea Preferencial o General");
	b =   String.valueOf(System.console().readLine());
if ("GENERAL".equals(b)) {
	System.out.println("Numero de Boletas");
	c =   Integer.parseInt(System.console().readLine());
	precio =   Integer.parseInt(System.console().readLine());
	precio=precio+(c*12000);
	System.out.println("Numero de Gafas a Adquirir");
	d =   Integer.parseInt(System.console().readLine());
	precio=precio+(d*3000);
} else if ("PREFERENCIAL".equals(b)) {
	System.out.println("Numero de Boletas");
	e =   Integer.parseInt(System.console().readLine());
	precio =   Integer.parseInt(System.console().readLine());
	precio= precio+(e*15000);
	System.out.println("Numero de Gafas a Adquirir");
	f =   Integer.parseInt(System.console().readLine());
	precio=precio+(f*3000);
}
} else if ("2D".equals(a)) {
	System.out.println("Tipo de Boleta Sea Preferencial o General");
	g =   String.valueOf(System.console().readLine());
if ("GENERAL".equals(g)) {
	System.out.println("Numero de Boletas");
	h =   Integer.parseInt(System.console().readLine());
	precio =   Integer.parseInt(System.console().readLine());
	precio=precio+(h*8000);
} else if ("PREFERENCIAL".equals(g)) {
	System.out.println("Numero de Boletas");
	i =   Integer.parseInt(System.console().readLine());
	precio =   Integer.parseInt(System.console().readLine());
	precio=precio+(i+11000);
}
}
	precio =   Integer.parseInt(System.console().readLine());
	System.out.println("Valor a Pagar"+ precio);
}
}

