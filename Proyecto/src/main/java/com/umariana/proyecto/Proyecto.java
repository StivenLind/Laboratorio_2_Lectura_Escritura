/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umariana.proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import mundo.Alumno;

/**
 *
 * @author Sistemas
 */
public class Proyecto {
    

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // funcion que permite leer la opcion del usuario
        Scanner lector = new Scanner(System.in);
        
        //bandera que permite terminar el programaso
        boolean activo= true;
         ArrayList<Alumno> misAlumnos = new ArrayList<Alumno>();
         
         leerArchivo(misAlumnos);
         do{
        System.out.println("---------- menu de opciones---------");
        System.out.println("1. Insertar alumno");
         System.out.println("2. Eliminar  alumno");
         System.out.println("3. Modificar alumno");
         System.out.println("4. Consultar  alumno");
         System.out.println("5. Terminar programa");
         System.out.println(".-----------------------");
         
         int opcion = lector.nextInt();
         
            switch (opcion) {
                
                case 1:
                     System.out.println("Ha seleccionado la opcion 1(Insertar un alumno)");
                    agregarAlumno(misAlumnos,lector);
                    escribirArchivo(misAlumnos);
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opcion 2(Eliminar un alumno)");
                    eliminarAlumno(misAlumnos,new BufferedReader(new InputStreamReader(System.in)));
                    break;
                case 3:
                    System.out.println("Ha seleccionado La opcion 3(Modificar un alumno)");
                    modificarAlumno(misAlumnos, new BufferedReader(new InputStreamReader(System.in)), lector);
                    break;
                    
                case 4:
                    System.out.println("Ha seleccionado la opcion 4(Consultar un alumno)");
                    consultarAlumno(misAlumnos,lector);
                    break; 
                case 5:
                    System.out.println("Ha salido del programa");
                    activo =false;
                    
                    break;                       
                default:
                    System.out.println("Opcion no valida , por favor digite una opcion correcta");
                    break;
            }
         
        }while(activo);    
    }
    public static void leerArchivo(ArrayList<Alumno>misAlumnos) throws FileNotFoundException, IOException{
        File archivo = new File("./data/lista.txt");
       try( FileReader lr = new FileReader (archivo);
        BufferedReader lectura = new BufferedReader(lr)){
        
        String cosito;
        while((cosito = lectura.readLine())!=null){
            String[] datos = cosito.split(",");
           String Cedula = datos[0].trim();
            String Nombre = datos[1].trim();
            String Apellido = datos[2].trim();
            String Semestre = datos[3].trim();
            String Correo = datos[4].trim();
            String Celular = datos[5].trim(); 
            
            int cedula2 = Integer.parseInt(Cedula);
            int semestre2 = Integer.parseInt(Semestre);
            int celular2 = Integer.parseInt(Celular);
            
           Alumno alumno = new Alumno(cedula2,Nombre,Apellido,semestre2,Correo,celular2); 
           misAlumnos.add(alumno);
           
        }
        }catch(FileNotFoundException e){
                System.out.println("No se encontro la ruta, ruta equibocada");
                }catch(IOException e){
                        System.out.println("Datos incorrectos");
                        }
    }
    public static void escribirArchivo(ArrayList<Alumno> misAlumnos) throws FileNotFoundException{
        File archivo = new File("./data/lista.txt");
        try( PrintWriter pluma = new PrintWriter(archivo)){
        
        for(Alumno alumno : misAlumnos){
            
            pluma.println("REPORTE DE LOS ALUMNOS");
            pluma.println("==========================");
            
            String escritura = alumno.getCedula()+","+alumno.getNombre()+","+alumno.getApellido()+","+alumno.getSemestre()+","+alumno.getCorreo()+","+alumno.getCelular();
         pluma.println(escritura);
                   
        }
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo ruta equibocada");
        }
    }
    public static void agregarAlumno(ArrayList<Alumno> misAlumnos,Scanner lector){
                    System.out.println("Introduce la cedula del alumno");
                    
             int Cedula = lector.nextInt();
              System.out.println("Introduce el nombre del alumno");
             String Nombre = lector.next();
             System.out.println("Introduce el Apellido del alumno");
             String Apellido = lector.next();
             System.out.println("Introduce el Semetre del alumno");
             int Semestre = lector.nextInt();
             System.out.println("Introduce el Correo del alumno");
             String Correo = lector.next();
             System.out.println("Introduce el Numero de celular del alumno");
             int Celular = lector.nextInt();
             
             // se crea un objeto para guardar la informacion de cada alumno
             Alumno a = new Alumno();
             a.setCedula(Cedula);
             a.setNombre(Nombre);
             a.setApellido(Apellido);
             a.setSemestre(Semestre);
             a.setCorreo(Correo);
             a.setCelular(Celular);
             
             //se agrega el valor del objetp a ListArray
             misAlumnos.add(a);
             System.out.println("Se ha agregado el alumno");

    }
    public static void eliminarAlumno(ArrayList<Alumno> misAlumnos, BufferedReader lectura) throws IOException {
         
        String cofr;
        boolean hallar = false;

            System.out.println("===================================================");
            System.out.println("Ingrese la cedula del estudiante que desea eliminar");
            
            String cedulaEliminar = lectura.readLine();
        
            
        for (Alumno alumno : misAlumnos ) {
            if (cedulaEliminar.equals(alumno)) {
                hallar = true;
                System.out.println("Por favor, confirma la eliminación del estudiante: " + alumno.getNombre() + " " + alumno.getApellido() + ", con cédula: " + alumno.getCedula() + "\n" +
                        "\nEscribe 'si' para proceder con la eliminación. Si digitas algo diferente, la acción no se realizará.");
                cofr = lectura.readLine();
                
                if(cofr.equals("si")){
                    misAlumnos.remove(alumno); // Eliminar el estudiante de la lista
                    hallar = true;
                    System.out.println("============================================");
                    System.out.println("El estudiante " + alumno.getNombre() + " " + alumno.getApellido() + " fue eliminado exitosamente");
                    
                    break;
                }else if(!cofr.equals("si")){
                    System.out.println("============================================");
                    System.out.println("Eliminación cancelada: Gracias por confirmar.");
                    
                }
            } else {
            }
        }

        //no se encuentra la cedula del estudiante para eliminar
        if (!hallar) {   
            System.out.println("No se encontró un estudiante con la cédula ingresada.");
           
        }
    }
    public static void modificarAlumno(ArrayList<Alumno> misAlumnos,BufferedReader lectura, Scanner lector) throws IOException {
        }
    public static void consultarAlumno(ArrayList<Alumno> misAlumnos,Scanner lector){
    if (misAlumnos.isEmpty()) {
        System.out.println("");
        System.out.println("No se encuentra ningún estudiante registrado en el sistema en este momento.");
        System.out.println("");
    } else {
        for (int i = 0; i < misAlumnos.size(); i++) {
            Alumno alumno = misAlumnos.get(i);
            String estudianteNum = String.format("%-4d", i + 1);
            String cedula = String.format("%-13s", alumno.getCedula());
            String nombre = String.format("%-17s", alumno.getNombre());
            String apellido = String.format("%-17s", alumno.getApellido());
            String semestre = String.format("%-8d", alumno.getSemestre());
            String correo = String.format("%-19s", alumno.getCorreo());
            String celular = String.format("%-16s", alumno.getCelular());

            System.out.println(estudianteNum+"/"+cedula+"/"+nombre+"/"+apellido+"/"+semestre+"/"+correo+"/"+celular+"/");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    }
}