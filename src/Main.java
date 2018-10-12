import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> edades = new ArrayList<>();
        int sumEdades = 0;
        Estudiante[] estudiantes = {
                new Estudiante("Juan",24),
                new Estudiante("Erica",20),
                new Estudiante("Emilio",23),
                new Estudiante("Karina",21),
                new Estudiante("Eduardo",24),
                new Estudiante("Tomas",25),

        };


        for (Estudiante estudiante: estudiantes) {
            sumEdades+=estudiante.getEdad();
            edades.add(estudiante.getEdad()); //Guarda todas las edades en un Array!
            System.out.println("Nombre estudiante: "+estudiante.getNombre()+", Edad: "+estudiante.getEdad());
        }
        System.out.println("Edad mínima: "+Collections.min(edades));
        System.out.println("Edad máxima: "+Collections.max(edades));
        System.out.println("Edad Promedio: "+sumEdades/estudiantes.length);
    }
}
