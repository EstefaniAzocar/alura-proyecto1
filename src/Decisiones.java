public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";
  // CODIGO QUE PRUEBA LOS OPERADORES RELACIONALES
        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más Populares");

        }else{
             System.out.println("peliculas menos populares");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
