import java.util.Scanner;

public class Elahorcado {
    public static void main(String[] args) {
        //solo puede fallar 3 veces
        // e l95 la ralla
        int intento = 3, posicion=0;
        Scanner sc = new Scanner(System.in);
        String frase = "";
        String guardado="";
        String letra="";
        String fraseOcult="";
        char aux=' ';
        boolean salir = false;



        System.out.println("pon frase \n");
        frase = sc.nextLine().toLowerCase();


        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' '){
                fraseOcult += '\t';
            }else{
                fraseOcult += '_';
            }
        }
        System.out.print(fraseOcult);
        System.out.println();


        do {
            System.out.println("introduce  letra");
            letra=sc.nextLine();
            if (frase.contains(letra)){

                for (int i = 0; i < frase.length(); i++) {
                    if (letra.equals(frase.charAt(i))){
          //              aux=letra;
            //            frase.charAt(i)=;


                    }
                }

//
//                for (int i = 0; i < frase.length(); i++) {
//                    posicion=frase.indexOf(letra);
//                }
//
//                for (int i = 0; i < posicion; i++) {
//                    fraseOcult= String.valueOf(letra.charAt(posicion));
//
//                }






                System.out.println(fraseOcult);

                guardado+=letra;


            }else{
                if (guardado.contains(letra)){
                    System.out.println("letra ya usada");
                }else{
                    System.out.println("has fallado te quedan = " + intento);
                    intento--;
                    guardado+=letra;
                }

            }
        } while (intento!=0);


    
    }
    //public static void 
}
