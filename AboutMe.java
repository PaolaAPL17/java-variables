public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos: nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza en el texto de impresión, la variable que corresponda.

        //Escribe tu código aquí
        String name = "Paola";
        int age = 30;
        String country = "Colombia";
        String programingLenguage = "Java";
        int hours = 5;
        String[] hobbies = {"Paint", "Dance", "Read"};
        String place = "Beach";


        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println("Mi nombre es " + name + ", tengo " + age + " años y soy de " + country + ".");

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando " + programingLenguage + " y practico " + hours + " horas al día.");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito es " + hobbies[3] + " y lo practico en " + place);
    }
}
