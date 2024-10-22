

public class Laberinto
{
    private int[][] lab;
    private int xR, yR, xQ, yQ;
    
    public boolean valida(int x,int y){
        if(lab[x][y] == 1){
            return false;
        }
        if(lab[x][y] == lab[xQ][yQ]){
            return true;
        }
        return false;
     }
    
    public boolean buscar(){
        return buscar(xR,yR);
    }
    
    private boolean buscar(int x,int y){
        boolean encontro;
        if(valida(x,y)){
            if(lab[x][y]!=0){
                encontro = false; 
            }else{
                if(x == xQ && y == yQ){
                    encontro = true;
                }else {
                    lab[x][y] = 2;  //esta dejando rastro  
                    encontro = buscar(x-1,y);
                }
                if(!encontro){
                    encontro = buscar(x,y+1);
                }
                if(!encontro){
                    encontro = buscar(x+1,y);
                }
                if(!encontro){
                    encontro = buscar(x,y-1);
                }
            }
            lab[x][y] = 0;
        }
        else{
            encontro = false;
        }
        return encontro;
    }
}
