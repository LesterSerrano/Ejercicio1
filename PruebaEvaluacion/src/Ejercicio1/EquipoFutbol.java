package Ejercicio1;

import java.util.Scanner;

public class EquipoFutbol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seleccione el tipo de persona para ingresar:");
        System.out.println("1. Futbolista");
        System.out.println("2. Entrenador");
        System.out.println("3. Masajista");

        int opcion = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                System.out.println("Ingrese los datos del Futbolista:");
                System.out.print("ID: ");
                int idF = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea

                System.out.print("Nombre: ");
                String nombreF = entrada.nextLine();

                System.out.print("Apellidos: ");
                String apellidosF = entrada.nextLine();

                System.out.print("Edad: ");
                int edadF = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea

                System.out.print("Dorsal: ");
                String dorsal = entrada.nextLine();

                System.out.print("Demarcación: ");
                String demarcacion = entrada.nextLine();

                Futbolista futbolista = new Futbolista(idF, nombreF, apellidosF, edadF, dorsal, demarcacion);
                futbolista.mostrarInfoPersona();
                break;

            case 2:
                System.out.println("Ingrese los datos del Entrenador:");
                System.out.print("ID: ");
                int idE = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea

                System.out.print("Nombre: ");
                String nombreE = entrada.nextLine();

                System.out.print("Apellidos: ");
                String apellidosE = entrada.nextLine();

                System.out.print("Edad: ");
                int edadE = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea

                System.out.print("ID Federación: ");
                String idFederacion = entrada.nextLine();

                Entrenador entrenador = new Entrenador(idE, nombreE, apellidosE, edadE, idFederacion);
                entrenador.mostrarInfoPersona();
                break;

            case 3:
                System.out.println("Ingrese los datos del Masajista:");
                System.out.print("ID: ");
                int idM = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea

                System.out.print("Nombre: ");
                String nombreM = entrada.nextLine();

                System.out.print("Apellidos: ");
                String apellidosM = entrada.nextLine();

                System.out.print("Edad: ");
                int edadM = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea

                System.out.print("Titulación: ");
                String titulacion = entrada.nextLine();

                System.out.print("Años de experiencia: ");
                int aniosExperiencia = entrada.nextInt();

                Masajista masajista = new Masajista(idM, nombreM, apellidosM, edadM, titulacion, aniosExperiencia);
                masajista.mostrarInfoPersona();
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        entrada.close();
    }
}

    class Personas{
        protected int id;
        protected String nombre;
        protected String apellidos;
        protected int edad;

        public Personas() {
        }

        public Personas(int id, String nombre, String apellidos, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }


        public void mostrarInfoPersona(){
            System.out.println("Datos de la Persona");
            System.out.println("Nombre:\n"+ nombre + " " + apellidos);
            System.out.println("Edad: " + edad);
        }

        public void Concentrarse(){System.out.println(nombre + " " + apellidos + "Se concentra en el partido");}
        public void Viajar(){System.out.println(nombre + " " + apellidos + "Viaja en autobus");}

    }


        class Futbolista extends Personas{
            private String dorsal;
            private String demarcacion;

            public Futbolista() {
            }

            public Futbolista(int id, String nombre, String apellidos, int edad, String dorsal, String demarcacion) {
                super(id, nombre, apellidos, edad);
                this.dorsal = dorsal;
                this.demarcacion = demarcacion;
            }

            @Override
            public void mostrarInfoPersona(){
                super.mostrarInfoPersona();
                System.out.println("Dorsal:" + dorsal);
                System.out.println("Demarcación:" + demarcacion);

            }

            @Override
            public void Concentrarse(){System.out.println("Se concentra en el partido");}
            public void Viajar(){System.out.println("Viaja en autobus");}

            public void jugarPartido(){
                System.out.println("Está jugando un partido");
            }

            public void entrenar(){
                System.out.println("Está entrenando");
            }

        }

        class Entrenador extends Personas{
            private String idFederacion;

            public Entrenador() {
            }

            public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
                super(id, nombre, apellidos, edad);
                this.idFederacion = idFederacion;
            }


        @Override
        public void mostrarInfoPersona(){
                super.mostrarInfoPersona();
            System.out.println("Id Federación: " + idFederacion);
        }

        @Override
        public void Concentrarse(){System.out.println("Se concentra en coordinar a los jugadores");}
        public void Viajar(){System.out.println("Viaja en su automovil");}

            public void dirigirPartido() {
                System.out.println(nombre + " " + apellidos + " está dirigiendo un partido.");
            }

            public void dirigirEntrenamiento() {
                System.out.println(nombre + " " + apellidos +" está dirigiendo el entrenamiento.");
            }

    }

            class Masajista extends Personas{
                private String Titulacion;
                private int aniosExperiencia;

                public Masajista() {
                }

                public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
                    super(id, nombre, apellidos, edad);
                    Titulacion = titulacion;
                    this.aniosExperiencia = aniosExperiencia;
                }

                @Override
                public void mostrarInfoPersona(){
                    super.mostrarInfoPersona();
                    System.out.println("Titulación: " + Titulacion);
                    System.out.println("Años de experiencia: " + aniosExperiencia);
                }

                @Override
                public void Concentrarse(){System.out.println("Se concentra en atender a los jugadores");}
                public void Viajar(){System.out.println("Viaja en su automovil personal");}

                public void darMasaje(){
                    System.out.println("Da masajes a los jugadores lastimados");

                }
            }


