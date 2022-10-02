   do {

            System.out.println("pon una letra");
            letra=sc.nextLine();
            guardado += letra;
            do {
                System.out.println("esa letra ya ha sido usada");
                letra=sc.nextLine();
                intento--;

            } while (!guardado.contains(letra));

            {
                if(guardado.contains(letra)){
                for (int i = 0; i < frase.length(); i++) {
                    posicion=frase.indexOf(letra);

                }

                for (int i = posicion; i <= posicion+1; i++) {

                        fraseOcult += letra;

                }

            }
                System.out.println(fraseOcult);
            }


        } while (intento !=0);

