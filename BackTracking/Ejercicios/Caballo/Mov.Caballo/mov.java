
/** * Write a description of class mov here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mov
{
    public void movimientosCaballo(int x, int y)
    {
       if(x<0 || y<0){
           
           System.out.println(" Nega ");
       }else if(x > 8 || y > 8 ) {// son 8 posiciones incluyendo al 0{
           System.out.println(" Outside ");
       }else{
           boolean [][] tabla = new boolean[8][8];
           movimientosCaballo(x,y,tabla);
           for(int i = 0; i<tabla.length;i++){
               for(int j = 0; j < tabla[i][j];j++){
                   System.out.println(" Outside ");
                }
            }
        }
    }
    public void movimientosCaballo(int x, int y, boolean[][] tabla){
        if(x>=0 && y>=0 && x<8 && y<8){ //caso que esta dentro, 8 dentro de la matriz
            if(tabla[y][x] == false){ //columnas filas{
                tabla[y][x] = true;
                System.out.println("el caballo puede pasar por"+x+" y "+y);
                //arriba
                movimientosCaballo(x+1,y-2,tabla);
                movimientosCaballo(x-1,y-2,tabla);
                //abajo
                movimientosCaballo(x+1,y+2,tabla);
                movimientosCaballo(x-1,y+2,tabla);
                //izq
                movimientosCaballo(x-2,y+1,tabla);
                movimientosCaballo(x-2,y-1,tabla);
                //der
                movimientosCaballo(x+2,y+1,tabla);
                movimientosCaballo(x+2,y-1,tabla);
           }
       }
    }
}
