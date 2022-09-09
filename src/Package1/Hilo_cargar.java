
package Package1;

import javax.swing.JProgressBar;

public class Hilo_cargar extends Thread{
    
    private JProgressBar barra;

    public Hilo_cargar(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(true){
            barra.setValue(barra.getValue() + 1);
            barra.setString(Integer.toString(barra.getValue()) + "%");
        }
    }
    
}
