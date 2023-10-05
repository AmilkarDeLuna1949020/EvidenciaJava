//Amilkar Jhair De Luna Palacios
//Evidencia-Curso de Java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuesta;
        List<String> listaCitas = new ArrayList<>();

        do {
            System.out.println("Presione 1 para dar de alta a un Doctor");
            System.out.println("Presione 2 para dar de alta a un Paciente");
            System.out.println("Presione 3 para hacer una Cita");
            System.out.println("Presione 4 para acceder al Control del sistema");
            System.out.println("Presione 5 para mostrar citas");
            System.out.println("Escriba el numero segun su opcion deseada: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Doctor doctor = new Doctor();
                    doctor.altaDoctor();
                    break;
                case 2:
                    Paciente paciente = new Paciente();
                    paciente.altaPaciente();
                    break;
                case 3:
                    Cita cita = new Cita();
                    cita.programarCita(listaCitas);
                    break;
                case 4:
                    Control control = new Control();
                    control.accesoControl();
                    break;
                default:
                    System.out.println("Opción no válida.");
                case 5:
                    Relacion relacion = new Relacion();
                    relacion.menuRelacion(listaCitas);
                    break;
            }

            System.out.println("Si desea salir del programa, presione 1. Si desea seguir, presione 2: ");
            respuesta = scanner.nextInt();

            if (respuesta == 1) {
                System.out.println("Saliendo del programa...");
            } else if (respuesta != 2) {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (respuesta == 2);

        System.out.println("Programa Finalizado");


    }
}

class Doctor {
    private static final int[] identificadoresD = {38492048, 28349510, 30484306, 28594032, 48453956, 29475840, 38521038, 19220394};

    public void altaDoctor() {
        Scanner scanner = new Scanner(System.in);

        int identificador;

        do {
            System.out.println("Favor de escribir su número de identificación: ");
            identificador = scanner.nextInt();

            if (!identificadorValido(identificador)) {
                System.out.println("Número inválido. Inténtelo de nuevo.");
            }
        } while (!identificadorValido(identificador));

        if (identificadorValido(identificador)) {
            System.out.println("Favor de escribir su Nombre: ");
            String nombre = scanner.next();
            System.out.println("Favor de escribir área de especialidad: ");
            String especialidad = scanner.next();

            System.out.println("Doctor " + nombre + " se ha dado de alta de " + especialidad);
        } else {
            System.out.println("El número de identificación es incorrecto");
        }
    }

    private boolean identificadorValido(int identificador) {
        for (int id : identificadoresD) {
            if (identificador == id) {
                return true;
            }
        }
        return false;
    }
}

class Paciente {
    private static final int[] identificadoresD = {38492048, 28349510, 30484306, 28594032, 48453956, 29475840, 38521038, 19220394};

    public void altaPaciente()
    {
        Scanner scanner = new Scanner(System.in);

        int identificador;

        do {
            System.out.println("Favor de escribir su número de identificación: ");
            identificador = scanner.nextInt();

            if (!identificadorValido(identificador)) {
                System.out.println("Número inválido. Inténtelo de nuevo.");
            }
        } while (!identificadorValido(identificador));

        if (identificadorValido(identificador)) {
            System.out.println("Favor de escribir el Nombre Completo del paciente");
            String nombre = scanner.next();

            System.out.println("Paciente " + nombre + " se ha dado de alta");
        } else {
            System.out.println("El número de identificación es incorrecto");
        }
    }

    private boolean identificadorValido(int identificador) {
        for (int id : identificadoresD) {
            if (identificador == id) {
                return true;
            }
        }
        return false;
    }
}

class Cita {
    private static final int[] identificadoresD = {38492048, 28349510, 30484306, 28594032, 48453956, 29475840, 38521038, 19220394};

    public void programarCita(List<String> listaCitas) {
        Scanner scanner = new Scanner(System.in);

        int identificador;

        do {
            System.out.println("Favor de escribir su número de identificación: ");
            identificador = scanner.nextInt();

            if (!identificadorValido(identificador)) {
                System.out.println("Número inválido. Inténtelo de nuevo.");
            }
        } while (!identificadorValido(identificador));

        if (identificadorValido(identificador)) {
            System.out.println("Favor de escribir la hora, recuerde que solo puede ser del 1-12");
            int hora = scanner.nextInt();

            if (hora >= 1 && hora <= 12) {
                System.out.println("Favor de escribir 1 para escoger tiempo de tarde o escribe 2 para tiempo de mañana");
                int tiempo = scanner.nextInt();

                System.out.println("Escribe el motivo de la cita");
                String motivo = scanner.next();

                listaCitas.add("Hora de cita: " + hora + " " + (tiempo == 1 ? "pm" : "am") + "-motivo: " + motivo);
                System.out.println("Hora de cita: " + hora + " " + (tiempo == 1 ? "pm" : "am") + "-motivo: " + motivo);
            } else {
                System.out.println("Hora inválida");
            }
        } else {
            System.out.println("El número de identificación es incorrecto");
        }
    }

    private boolean identificadorValido(int identificador) {
        for (int id : identificadoresD) {
            if (identificador == id) {
                return true;
            }
        }
        return false;
    }
}

class Control {
    private static final int[] identificadoresD = {38492048, 28349510, 30484306, 28594032, 48453956, 29475840, 38521038, 19220394};

    public void accesoControl() {
        Scanner scanner = new Scanner(System.in);

        int identificador;

        do {
            System.out.println("Favor de escribir su número de identificación: ");
            identificador = scanner.nextInt();

            if (!identificadorValido(identificador)) {
                System.out.println("Número inválido. Inténtelo de nuevo.");
            }
        } while (!identificadorValido(identificador));

        if (identificadorValido(identificador)) {
            System.out.println("Favor de escribir la contraseña");
            int contraseña = scanner.nextInt();

            if (contraseña == 457839) {
                System.out.println("Acceso de control confirmado");
            } else {
                System.out.println("La contraseña es incorrecta");
            }
        } else {
            System.out.println("El número de identificación es incorrecto");
        }
    }

    private boolean identificadorValido(int identificador) {
        for (int id : identificadoresD) {
            if (identificador == id) {
                return true;
            }
        }
        return false;
    }

}
class Relacion {
    public void menuRelacion(List<String> listaCitas) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Presione 1 para mostrar citas");
            System.out.println("Presione 2 para eliminar una cita");
            System.out.println("Presione 3 para salir");
            System.out.println("Escriba el numero segun su opcion deseada: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarCitas(listaCitas);
                    break;
                case 2:
                    eliminarCita(listaCitas);
                    break;
                case 3:
                    System.out.println("Saliendo del menú de Relación...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }

    private void mostrarCitas(List<String> listaCitas) {
        System.out.println("Citas programadas:");
        for (String cita : listaCitas) {
            System.out.println(cita);
        }
    }

    private void eliminarCita(List<String> listaCitas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el índice de la cita que desea eliminar: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < listaCitas.size()) {
            listaCitas.remove(indice);
            System.out.println("Cita eliminada correctamente.");
        } else {
            System.out.println("Índice no válido. No se eliminó ninguna cita.");
        }
    }
}