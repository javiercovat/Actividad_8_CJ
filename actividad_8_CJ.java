import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class actividad_8_CJ {


    public static void shuffle(ArrayList<Object> a) {
        Collections.shuffle(a);
        System.out.println("Se mezcló el deck");
    }

    public static void head(ArrayList<Object> a){
        System.out.println(a.get(0).toString());
        a.remove(0);
        System.out.println("Quedan "+ a.size() + " cartas en la baraja.");
    }

    public static void pick(ArrayList<Object> a){
        Random randomNumbers = new Random();

        int carta = randomNumbers.nextInt(a.size());
        System.out.println(a.get(carta).toString());
        a.remove(carta);
        System.out.println("Quedan "+ a.size() + " cartas en la baraja.");
    }

    public static void hand (ArrayList<Object> a){
        Random randomNumbers = new Random();

            int carta1 = randomNumbers.nextInt(a.size() - 1);
            System.out.println(a.get(carta1).toString());
            a.remove(carta1);

            int carta2 = randomNumbers.nextInt(a.size() - 1);
            System.out.println(a.get(carta2).toString());
            a.remove(carta2);

            int carta3 = randomNumbers.nextInt(a.size() - 1);
            System.out.println(a.get(carta3).toString());
            a.remove(carta3);

            int carta4 = randomNumbers.nextInt(a.size() - 1);
            System.out.println(a.get(carta4).toString());
            a.remove(carta4);

            int carta5 = randomNumbers.nextInt(a.size() - 1);
            System.out.println(a.get(carta5).toString());
            a.remove(carta5);

        System.out.println("Quedan "+ a.size() + " cartas en la baraja.");

    }

    public static void main (String[]args){

        Scanner lector = new Scanner(System.in);


        class card {
        private final String palo;
        private final String color;
        private final String valor;

        public card(String palo, String color, String valor) {
            this.palo = palo;
            this.color = color;
            this.valor = valor;

        }
            public String toString(){
                return palo + " " + color + " " + valor;
            }
    }

                card card1 = new card("Tréboles", "Negro", "2");
                card card2 = new card("Tréboles", "Negro", "3");
                card card3 = new card("Tréboles", "Negro", "4");
                card card4 = new card("Tréboles", "Negro", "5");
                card card5 = new card("Tréboles", "Negro", "6");
                card card6 = new card("Tréboles", "Negro", "7");
                card card7 = new card("Tréboles", "Negro", "8");
                card card8 = new card("Tréboles", "Negro", "9");
                card card9 = new card("Tréboles", "Negro", "10");
                card card10 = new card("Tréboles", "Negro", "A");
                card card11 = new card("Tréboles", "Negro", "J");
                card card12 = new card("Tréboles", "Negro", "Q");
                card card13 = new card("Tréboles", "Negro", "K");

                card card14 = new card("Corazones", "Rojo", "2");
                card card15 = new card("Corazones", "Rojo", "3");
                card card16 = new card("Corazones", "Rojo", "4");
                card card17 = new card("Corazones", "Rojo", "5");
                card card18 = new card("Corazones", "Rojo", "6");
                card card19 = new card("Corazones", "Rojo", "7");
                card card20 = new card("Corazones", "Rojo", "8");
                card card21 = new card("Corazones", "Rojo", "9");
                card card22 = new card("Corazones", "Rojo", "10");
                card card23 = new card("Corazones", "Rojo", "A");
                card card24 = new card("Corazones", "Rojo", "J");
                card card25 = new card("Corazones", "Rojo", "Q");
                card card26 = new card("Corazones", "Rojo", "K");

                card card27 = new card("Picas", "Negro", "2");
                card card28 = new card("Picas", "Negro", "3");
                card card29 = new card("Picas", "Negro", "4");
                card card30 = new card("Picas", "Negro", "5");
                card card31 = new card("Picas", "Negro", "6");
                card card32 = new card("Picas", "Negro", "7");
                card card33 = new card("Picas", "Negro", "8");
                card card34 = new card("Picas", "Negro", "9");
                card card35 = new card("Picas", "Negro", "10");
                card card36 = new card("Picas", "Negro", "A");
                card card37 = new card("Picas", "Negro", "J");
                card card38 = new card("Picas", "Negro", "Q");
                card card39 = new card("Picas", "Negro", "K");

                card card40 = new card("Diamantes", "Rojo", "2");
                card card41 = new card("Diamantes", "Rojo", "3");
                card card42 = new card("Diamantes", "Rojo", "4");
                card card43 = new card("Diamantes", "Rojo", "5");
                card card44 = new card("Diamantes", "Rojo", "6");
                card card45 = new card("Diamantes", "Rojo", "7");
                card card46 = new card("Diamantes", "Rojo", "8");
                card card47 = new card("Diamantes", "Rojo", "9");
                card card48 = new card("Diamantes", "Rojo", "10");
                card card49 = new card("Diamantes", "Rojo", "A");
                card card50 = new card("Diamantes", "Rojo", "J");
                card card51 = new card("Diamantes", "Rojo", "Q");
                card card52 = new card("Diamantes", "Rojo", "K");


                ArrayList<Object> baraja = new ArrayList<>();
                baraja.add(card1);
                baraja.add(card2);
                baraja.add(card3);
                baraja.add(card4);
                baraja.add(card5);
                baraja.add(card6);
                baraja.add(card7);
                baraja.add(card8);
                baraja.add(card9);
                baraja.add(card10);
                baraja.add(card11);
                baraja.add(card12);
                baraja.add(card13);
                baraja.add(card14);
                baraja.add(card15);
                baraja.add(card16);
                baraja.add(card17);
                baraja.add(card18);
                baraja.add(card19);
                baraja.add(card20);
                baraja.add(card21);
                baraja.add(card22);
                baraja.add(card23);
                baraja.add(card24);
                baraja.add(card25);
                baraja.add(card26);
                baraja.add(card27);
                baraja.add(card28);
                baraja.add(card29);
                baraja.add(card30);
                baraja.add(card31);
                baraja.add(card32);
                baraja.add(card33);
                baraja.add(card34);
                baraja.add(card35);
                baraja.add(card36);
                baraja.add(card37);
                baraja.add(card38);
                baraja.add(card39);
                baraja.add(card40);
                baraja.add(card41);
                baraja.add(card42);
                baraja.add(card43);
                baraja.add(card44);
                baraja.add(card45);
                baraja.add(card46);
                baraja.add(card47);
                baraja.add(card48);
                baraja.add(card49);
                baraja.add(card50);
                baraja.add(card51);
                baraja.add(card52);

                System.out.println("""
                        Este programa simula una baraja virtual de póquer.
                        Cuenta con las siguientes opciones:
                        
                        1 -> Mezclar la baraja
                        2 -> Sacar la primera carta de la baraja.
                        3 -> Sacar una carta al azar de la baraja.
                        4 -> Sacar 5 cartas al azar de la baraja.
                        
                        Podrás seguir sacando cartas hasta que no queden más.
                       """);

                while (baraja.size() >= 1) {
                    System.out.println();
                    System.out.println("Selecciona la opción que deseas: ");
                    int metodo;
                    metodo = lector.nextInt();
                    switch (metodo) {
                        case 1 -> shuffle(baraja);
                        case 2 -> head(baraja);
                        case 3 -> pick(baraja);
                        case 4 -> {
                            if (baraja.size()<= 4){
                                System.out.println("Cartas insuficientes. Selecciona otra opción.");
                            }
                                else{hand(baraja);
                            }
                        }
                    }
        }
    }

}




