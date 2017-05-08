
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void mostrarMillon(){
        int contador = 0;
        long tiempoActual = System.currentTimeMillis();
        long tiempo = 0;
        while (contador <= 1000000){
            System.out.println(contador);
            contador++;
        }
        long tiempoDeEjecucion = System.currentTimeMillis();
        tiempo = tiempoDeEjecucion - tiempoActual;
        float segundos = 0;
        float minutos = 0;
        if(tiempo > 1000){
            segundos = tiempo / 1000;
            if(segundos > 60){
                minutos = segundos/60;
                segundos = segundos%60;
            }
        }
        System.out.println(tiempo);
        System.out.println( minutos + " : " + segundos);
    }
}
