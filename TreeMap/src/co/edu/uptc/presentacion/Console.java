package co.edu.uptc.presentacion;
import java.util.*;


public class Console {
    Scanner sc = new Scanner(System.in);
    int op = 6;
    TreeMap<Integer,String> details =new TreeMap<>();


    public void menu() {
        details.put(1,"sarai");
        details.put(2,"daniela");
        details.put(3,"Carolina");
        details.put(4,"Valentina");
        do {
            System.out.println("""
                    <<<<menú>>>>
                    1.mostrar treemap
                    2.borrar un elemento del treemap
                    0.salir
                    """);
            op = sc.nextInt();
            switch (op) {
                case 1:
                    mostrarTreeMap();
                    break;
                /*case 2:


                    String nombre;

                    System.out.println("ingrese un id");

                    id = sc.nextInt();
                    System.out.println("ingrese un nombre");
                    sc.next();
                    nombre = sc.nextLine();

                    details.put(id, nombre);


                    break;*/
                case 2:

                    Integer id;
                    System.out.println("ingrese un id");
                    id = sc.nextInt();
                    details.remove(id);

                    System.out.println("ingrese valores con sentido");
                    break;


            }


        }while (op != 0) ;
    }

        private void mostrarTreeMap () {
            System.out.println("el tamaño del treeMap es de: "+details.size());
            Set<Integer> keyVal=details.keySet();
            for (Integer i:keyVal) {
                System.out.println("key: " + i+ "|value: " + details.get(i));
            }
        }


    }