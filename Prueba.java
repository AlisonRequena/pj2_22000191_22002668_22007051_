import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;


public class Prueba{


    

    public static void main(String arga[]){

            File file = new File("tests/afd/pseudo_float.afd");

            int currentState = 6;


            try{
                 Scanner scanner = new Scanner(file);
                 scanner.nextLine();
                 String finales = scanner.nextLine();
                 System.out.println(finales +  "  " + "longitud: " + finales.length() );
                //--------------------------------------------------------------
               
                 int lengthF = finales.length();

                 if( lengthF >  1 ){
                        System.out.println("String");
                        boolean salida = false;
                        String[] arrayFinales = finales.split(",");
                        int arrayLength = arrayFinales.length;

                        for(int i = 0; i<arrayLength ; i++){
                            int intArrFinales = Integer.parseInt(arrayFinales[i]);
                            if(currentState == intArrFinales ){
                                salida = true;   
                            }
                        }
                        //return salida
                        System.out.println(salida);

                 }if(lengthF == 1){
                       
                    System.out.println("Char");
                    int intFinales  = Integer.parseInt(finales);
                    System.out.println(intFinales);

                    if(currentState == intFinales ){

                         System.out.println(true);
                        //return true;
                    }else{
                        System.out.println(false); 
                    }
                }

            }catch(FileNotFoundException e){
                System.out.println("Archivo no encontrado");
        
            }   


           

        
        
        







    }
}