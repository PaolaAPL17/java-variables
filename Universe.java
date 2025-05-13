public class Universe {
    public static void main(String[] args) {
        //Somos actualmente 8 118 302 456 de personas en el mundo. 
        //Java no permite una variable de tipo int, mayor que 2 147 483 647 por lo que la polación mundial no cabe en un int.
        //Intenta hacer una variable de tipo int con el valor de la población actual y mira el error.

        int peopleWorld = 8118302456;


        //Para poder almacenar la población mundial tenemos que definir el tipo de dato long que almacena un valor de hasta 9 223 372 036 854 775 807 
        //Para ello define una variable de tipo long con ese valor

        long peopleWorld = 8118302456;


        //¿Te sale el mismo error que el anterior?
        //Eso es debido a que cuando definimos una variable de tipo long debemos poner una L al final del último número.
        //Inténtalo de nuevo

        long peopleWorld = 8118302456L;


        //Un número largo sin tener un separador de millares, cuesta mucho de leer, es más fácil entender este valor 8 118 302 456, java nos permite tener este espacio con el underscore, cada tres dígitos. 
        
        //Inténtalo de nuevo con separador de millares
        long peopleWorld1 = 8_118_302_456L;

        //Imprime el resultado final
        System.out.println("La población mundial actual es de " + peopleWorld + " habitantes.");



        //La vía láctea parece tener unos cuatrocientos mil millones de estrellas, crea una variable con esa cantidad.

        //Escribe aquí tu código
        long milkyWay = 400_000_000_000L;


        //Andrómeda parece tener un billón de estrellas, crea una variable con esa cantidad.

        //Escribe aquí tu código
        long andromeda = 1_000_000_000_000L;


        //Corre este código y mira cuál es el problema
        System.out.println("Hay"+ milkyWay + andromeda + " " + "de estrellas en Andrómeda y en la Vía Láctea juntas.");

        //El problema es que está añadiendo el valor de milkyWay al String anterior, lo que convierte ese valor en String y cuando llega a andromeda también lo convierte a String y no puede hacer la operación matemática. Para dar prioridades de operaciones, usamos los paréntesis. 

        //Intenta resolver este problema dentro del System.out.println para que nos devuelva la suma de milkyWay + andromeda
        //Escribe aquí tu código
        System.out.println("Hay"+ " " +(milkyWay + andromeda) + " " + "de estrellas en Andrómeda y en la Vía Láctea juntas.");

    }
}
