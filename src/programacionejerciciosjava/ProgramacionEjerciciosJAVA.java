
package programacionejerciciosjava;

import java.util.Scanner;

public class ProgramacionEjerciciosJAVA {

    public static void main(String[] args) {
        //EJERCICIO 1.4 y 1.5 de CLASE 1
        System.out.println("Hola Mundo desde Java");
        
        //CLASE 2 es TODO TEORIA SIN EJERCICIOS
                          
        //EJERCICIOS 2.3, 2.5, 2.6 y 2.7 de la CLASE 3
        var miVariableEntera2 = 10;
        var miVariableCadena2="Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + usuario;
                
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a+b));
        
        //EJERCICIO 3 - La CLASE 3 - La clase Scanner
        Scanner entrada = new Scanner(System.in); // aca creamos una instancia de la clase Scanner
        System.out.println("Ingrese su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo");
        var titulo2 = entrada.nextLine();
        System.out.println("resultado " + titulo2 + " " + usuario2);
        
        //Clase 4 - Ejercicio 3.2 - Tipos Enteros
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del Short:"+ Short.MIN_VALUE);
        System.out.println("Valor máximo del Short:"+ Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo del Short:"+ Integer.MIN_VALUE);
        System.out.println("Valor máximo del Short:"+ Integer.MAX_VALUE);
        
        long numEnteroLong = 10;
        System.out.println("numEnteroInt = " + numEnteroLong);
        System.out.println("Valor mínimo del Short:"+ Long.MIN_VALUE);
        System.out.println("Valor máximo del Short:"+ Long.MAX_VALUE);
        
        //Clase 4- Ejercicio 3.3
        float numFloat = (float)3.4028236E38D;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor mínimo de float:" + Float.MIN_VALUE);
        System.out.println("El valor máximo de float:" + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor mínimo de double" + Double.MIN_VALUE);
        System.out.println("El valor máximo de double" + Double.MAX_VALUE);
        
        //EJERCICIO 5.1 de CLASE 5 Inferencia de tipos VAR y tipos primitivos
        var numeroEntero= 20;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroFloat = 10.0F;//automaticamente con el punto se transforma en el tipo double
        System.out.println("numeroFloat = " + numeroFloat);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        //EJERCICIO 5.2
        char miVariableChar = 'a';// puede alamacenar solo 1 caracter
        System.out.println("miVariableChar = " + miVariableChar);
        //EJERCICIO 5.2
        
        char varCaracter = '\u0024'; // indicamos a JAVA la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';//un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        
        char varCaracter1 = '\u0024'; // indicamos a JAVA la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        char varCaracterDecimal1 = (char)36; //sino casteamos char, asigna un valor de tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        char varCaracterSimbolo1 = '$';//un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
             
        
        //EJERCICIOS 6.2 y 6.3 de la CLASE 6
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1 ));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        var lectura = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = Integer.parseInt(lectura.nextLine());
        System.out.println("edad = " + edad);
        
        //CLASE 6 - video 6.3
        //Conversión de tipos primitivos en Java parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);
        System.out.println("Digite un caracter: ");
        fraseChar = lectura.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        
        //EJERCICIO 7.1 - CLASE 7 - Operadores aritmeticos
        int num1= 5;
        int num2= 6;
        //operacion suma
        var suma = num1 + num2;
        System.out.println("resultado suma = " + suma);
        //operacion resta
        var resta = num2 - num1;
        System.out.println("resultado resta = " + resta);
        //operacion division
        var division = num2 / num1;
        System.out.println("resultado división = " + division);
        //operacion multiplicacion
        var multiplicacion = num1 * num2;
        System.out.println("resultado multiplicacion = " + multiplicacion);
        //operacion modulo o residual
        var modulo = num2 % num1;
        System.out.println("resultado del modulo = " + modulo);
             
                       
        //Clase 7 - Ejercicio 7.2 Operadores de Asignacion
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3" + varNum3);
        
        varNum1 +=1;
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        
        varNum1 *=5;
        System.out.println("varnum1 = " + varNum1);
        
        varNum3 /=4;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
        
        //EJERCICIO 8.1 de clase 8 Operadores Unarios
        //Operadores Unarios: cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);//el resultado sera un numero negativo
        
        //operador de negacion
        var varC = true; // esta literal por default en Java es tipo boleana
        var varD = !varC; //invertimos el valor
        
        //Operadores Unarios de Incremento: preincremento
        var varE = 9; //se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable
                //primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);//se incrementa en la unidad
        System.out.println("varF = "+ varF);//va a sumar uno
        
        //Postincremento (el simbolo va despues dela variable)
        var varG=3;
        var varH=varG++;//primero el valor de la variable luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //postdecremento
        var varK=8;
        var varL= varK--;//primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); //Aqui va a decrementar en 1
        System.out.println("varL = " + varL);
        
        //EJERCICIO 8.2, 8.3 y 8.4 de Clase 8 
        // operador de Igualdad, relacionales y condicionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum==bNum);
        System.out.println("cNum = " + cNum);
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA= "hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar= cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        //ahora vemos relacionales
        var gVar = aNum != bNum; // >< >= <= == !=
        System.out.println("gVar = " + gVar );
        
        if (aNum % 2 == 0 ){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        
        var age = 15;
        var adulto = 18;
        if(age >= adulto){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
        //Un ejemplo de un operador and dentro de un condicional
        var valorA = 7;
        var valorMinimo= 0;//rango del 0 al 10
        var valorMaximo= 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if(respuesta){
            System.out.println("esta dentro del rango establecido");
        }else{
            System.out.println("esta fuera del rango establecido");
        }
         //un ejemplo con operador OR dentro de una estructura condicional
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones || diaLibre){
            System.out.println("papa puede asistir al juego de su hijo");
        }else{
            System.out.println("papa no puede asistir al juego de su hijo");
        }
        
        //Operador Ternario, sirve para simplificar la estructura condicional IF
        //se recomienda utilizar cuando la complejidad condicional no sea compleja
        var resultadoT = (5>8) ? "verdadero" : "falso"; // esta estructura se evalua de la siguiente manera
        //Si dada una condicion entre () entonces sera ? primer argumento sino con : sera segundo argumento
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 4;
        resultadoT =(numeroT % 2 == 0) ? "es par" : "es impar";
        System.out.println("resultadoT = " + resultadoT);
      
    }
    
}
