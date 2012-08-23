class Nomina {
	public static void main (String [] args) {
	Double a; Double b; Double pago;
	
	System.out.println("Digite Pago Base");
	a =     Double.parseDouble(System.console().readLine());
	System.out.println("Digite Numero de Horas Trabajadas");
	b =     Double.parseDouble(System.console().readLine());
	pago= (b*a);
if (b>=61){
	System.out.println("El Numero de Horas no debe ser mayor de 60");
} else if (b>=1 && b<=40) {
	System.out.println("Saldo Acumulado"+ pago);
} else if (b>=40 && b>=9999999){
	pago=pago*1.5;
	System.out.println("Saldo Acumulado por exceso de horas"+ pago);
} else if (a<=8) {
	System.out.println("El Pago No Debe Ser Menor A 8");
}
}
}

