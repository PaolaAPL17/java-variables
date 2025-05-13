public class Cakes {
    public static void main(String[] args) {
        //Tenemos 1 pastel y queremos dividirlo para 5 personas

        int cake = 1;
        int people = 5;

        //Cuando dividimos dos enteros cabe la posibilidad de que el resultado sea una fracción, pero no está bien cambiar a double algo que conceptualmente es un entero (como el pastel o las personas)
        //Para que el resultado cambie de tipo usamos "type casting" y se hace agregando entre paréntesis lo que queremos convertir
        
        //Corre el siguiente código
        System.out.println("Cada persona se lleva " + ((double)cake / people) + " partes de pastel");
        //El resultado obtenido es de tipo double.
        

        //Ahora vamos a escribir un programa que convierta un valor de tipo double a int y de int a double. 

        //Declara y asigna un valor a una variable double
        //Escribe aquí tu código
        double doubleValue = 7.50;
        System.out.println("Valor original de double: <doubleValue>");

        //Convierte double a int
        //Escribe aquí tu código
        int intValue = (int) doubleValue;
        System.out.println("Valor convertido de double a int: " + intValue);

        //Declara y asigna un valor a una variable int
        //Escribe aquí tu código
        int anotherIntValue = 8;
        System.out.println("Valor original de  int: " + anotherIntValue );

        //Convierte int a double
        //Escribe aquí tu código
        double anotherDoubleValue = (double) anotherIntValue;
        System.out.println("Valor convertido de int a double: " + anotherDoubleValue );
               
    }
}
