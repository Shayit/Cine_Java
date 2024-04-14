import java.util.Scanner;

public class funcionesCine {
    Scanner sc = new Scanner(System.in);
    Cliente date = new Cliente();

    public void tomaDatos(){
        System.out.print("Ingrese su nombre: ");
        String name = sc.next();
        System.out.print("Ingrese su apellido: ");
        String ape = sc.next();
        System.out.print("Ingrese la fecha de función: ");
        String dia = sc.next();

        date.setName(name);
        date.setFecha(dia);
        date.setApe(ape);
    }
    String sw = "Si";
    int [][] puestos = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
    public void asientos(){
        while (sw.equals("Si") || sw.equals("SI")){
            System.out.println("== Cine ==");
            System.out.println("Puestos disponibles: ");

            for(int i = 0;i<3;i++){
                for (int j = 0;j<3;j++){
                    System.out.print(puestos[i][j]);
                }
                System.out.println("");
            }

            System.out.print("Ingrese fila (1-3): ");
            int x = sc.nextInt();
            System.out.print("Ingrese columna (1-3): ");
            int y = sc.nextInt();

            for(int i = 0;i<3;i++){
                for (int j = 0;j<3;j++){
                    if(x<1 || x > 3 || y<1 || y>3 ){
                        System.out.println("Valores requeridos fuera de rango.");
                    } else {
                        if (puestos[x-1][y-1] == puestos[i][j]){
                            if(puestos[i][j] != 0){
                                puestos[i][j] = 0;
                                date.asignacion();
                                break;
                            } else {
                                date.noAsignacion();
                                break;
                            }
                        }
                    }
                }
            }

            System.out.print("¿Desea un puesto? (Si o No): ");
            sw = sc.next();
            if(sw.equals("No")){
                System.out.println("Vuelve pronto.");
            }
        }
    }

}
