
/**
 * 
 */
public class nReinas{
    public void NReinas(int n){
        if(n<1){
            System.out.println("error");
        }else{
            NReinas(n, new boolean[n][n], 0); //no se envia en la matriz con ctts
        }
    }
    public void NReinas(int n, boolean[][] tabla, int j){
        if(j<tabla.length){
            
            for(int i = 0 ; i<tabla.length;i++){
                if(tabla[i][j] == false){
                    dondeAtacaReina();
                    NReinas(n,tabla,j+1);
                    if(j=tabla.length-1){
                        imprimirTabla(tabla);
                        
                    }
                }
            }
        }
    
    }
}
