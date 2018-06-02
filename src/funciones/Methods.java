/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

public class Methods {
    static int anArray[][] = new int[10][10];
    public static void main(String[] args) {
         int contador = 1; 
        for(int i = 0; i <= 5; i++) { 
            contador = metodoUno(i, contador); 
            contador = metodoDos(i, contador);
            contador = metodoTres(i, contador); 
            contador = metodoCuatro(i, contador); 
        }
        imprimir();
    }
    
    //MÃ©todos 
    public static int metodoUno(int x, int count) { 
        for(int a = 0 + x; a < 10 - x; a++) { 
            anArray[x][a] = count; 
            count++; 
        }  
        return count; 
    }
    
    public static int metodoDos(int y, int count) { 
        for (int b = 1 + y; b < 9 - y; b++) {
            anArray[b][9 - y] = count; 
            count++;
        }
        return count; 
    }
    
    public static int metodoTres(int x, int count) { 
        for (int a = 9 - x; a >= 0 + x; a--) { 
            anArray[9 - x][a] = count; 
            count++;
        }
        return count; 
    }
    
    public static int metodoCuatro(int y, int count) { 
        for (int a = 8 - y; a >  y; a--) { 
            anArray[a][y] = count; 
            count++;
        }
        return count; 
    }
    
    public static void imprimir() { 
        for(int i = 0; i < 10; i++) { 
            for(int j = 0; j < 10; j++){
                System.out.print("\t" + anArray[i][j]);
            }
            System.out.println("");
        }
    }
}
