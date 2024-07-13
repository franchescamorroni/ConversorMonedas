import calcular.buscarMoneda;
import calcular.calcularMoneda;
import modelo.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entradaDato = new Scanner(System.in);
        while(true){
            mostrarMensajes();

            try {

                int opcion=Integer.valueOf(entradaDato.next());
                if(opcion == 13){
                    break;
                }
                String abreviaturaMoneda;
                buscarMoneda buscarmoneda = new buscarMoneda();
                calcularMoneda calcularmoneda = new calcularMoneda();
                Moneda monedaBuscada;
                switch (opcion) {

                    case 1:
                        abreviaturaMoneda="PEN";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 2:
                        abreviaturaMoneda="PEN";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 3:
                        abreviaturaMoneda="ARS";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 4:
                        abreviaturaMoneda="ARS";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 5:
                        abreviaturaMoneda="BRL";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 6:
                        abreviaturaMoneda="BRL";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 7:
                        abreviaturaMoneda="COP";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 8:
                        abreviaturaMoneda="COP";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 9:
                        abreviaturaMoneda="MXN";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 10:
                        abreviaturaMoneda="MXN";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 11:
                        abreviaturaMoneda="CRC";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularDolaresAMonedas(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    case 12:
                        abreviaturaMoneda="CRC";
                        monedaBuscada = buscarmoneda.buscar(abreviaturaMoneda);
                        calcularmoneda.calcularMonedasADolares(monedaBuscada.getValor(),abreviaturaMoneda);
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("*******************************************************************\n");

        }

    }

   public static void mostrarMensajes(){
        System.out.println("********Eliga  una opción de moneda a convertir*******");
        System.out.println(""" 
                               1). Dólar ===> Sol peruano
                               2). Sol peruano ====> Dólar
                               3). Dólar ===> Peso argentino
                               4). Peso argentino ====> Dólar
                               5). Dólar ===> Real brasileño
                               6). Real brasileño ====> Dólar
                               7). Dólar ===> Peso colombiano
                               8). Peso colombiano ====> Dólar
                               9). Dolar ===> Peso mexicano
                               10).Peso mexicano ====> Dólar
                               11).Dólar ===> Colón costarricense
                               12).Colón costarricense ====> Dólar
                               13).Salir 
                               """);
        System.out.println("******************************************************");



    }
}
