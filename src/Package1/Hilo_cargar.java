
package Package1;

import javax.swing.JProgressBar;

public class Hilo_cargar extends Thread{
    
    private JProgressBar barra;
    private boolean flag;
    private int max;

    public Hilo_cargar(JProgressBar barra, boolean flag, int max) {
        this.barra = barra;
        this.flag=flag;
        this.max= max;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    
    
    @Override
    public void run(){
        while(flag){
                barra.setValue(barra.getValue() + 1);
            barra.setString(Integer.toString(barra.getValue()) + "%");
            
            if(barra.getValue()==max){
                flag=false;
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
            
        }
    }
    
}
