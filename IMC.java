class IMC {
public static void main ( String[]args){
System.out.println("POR FAVOR INGRESE ESTATURA");
double estatura = Double.parseDouble(System.console().readLine());
System.out.println("POR FAVOR INGRESE SU PESO");
double peso = Double.parseDouble(System.console().readLine());
double imc = peso / (estatura*estatura);
if (imc < 18.5) {
System.out.println("Come como si no hubiera un mañana");
}else if (imc < 16){
System.out.println("delgadez severa");
}else if (16 < imc && imc < 16.9){
System.out.println("Estas muy delgado debes comer un poco");
}else if (17< imc && imc < 18.4){
System.out.println("Alimentate bien");
}else if (imc > 18.5 && imc < 24.9){
System.out.println("Mantente en este peso felicidades");
}else if (imc >= 25){
System.out.println("Puedes ser gordito");
}else if (25< imc && imc < 29.9){
System.out.println("Eres un gordito tierno");
}else if (imc >= 30){
System.out.println("Me pone triste que comas tanto");
}else if (30 < imc && imc < 34.9){
System.out.println("No comas tanto estas perdiendo tu figura");
}else if (35 < imc && imc < 39.9){
System.out.println("Has ejercicio gordis");
}else if (imc >= 40){
System.out.println("Creo que alguien va a necesitar una operacion");
}
}
}

