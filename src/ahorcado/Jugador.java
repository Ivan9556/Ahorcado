/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author Ivan-PC
 */
public class Jugador {

    //Variables
    int estado = 0;

    public Jugador() {
    }
    
    public Jugador(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }
    

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    @Override
    public String toString() {
        return "Jugador{" + "Estado=" + estado + '}';
    }

    public void estadoJugador(int estado) {
        switch (estado) {
            case 1:
                System.out.println("    |----|");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("       __|");
                break;
            case 2:
                System.out.println("    |----|");
                System.out.println("    |    |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("       __|");
                break;
            case 3:
                System.out.println("    |----|");
                System.out.println("    |    |");
                System.out.println("    O    |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("       __|");
                break;
            case 4:
                System.out.println("    |----|");
                System.out.println("    |    |");
                System.out.println("    O    |");
                System.out.println("    |    |");
                System.out.println("         |");
                System.out.println("       __|");
                break;
            case 5:
                System.out.println("    |----|");
                System.out.println("    |    |");
                System.out.println("    O    |");
                System.out.println("    |-   |");
                System.out.println("         |");
                System.out.println("       __|");
                break; 
            case 6:
                System.out.println("    |----|");
                System.out.println("    |    |");
                System.out.println("    O    |");
                System.out.println("   -|-   |");
                System.out.println("         |");
                System.out.println("       __|");
                break;
            case 7:
                System.out.println("    |----|");
                System.out.println("    |    |");
                System.out.println("    O    |");
                System.out.println("   -|-   |");
                System.out.println("   |     |");
                System.out.println("       __|");
                break;
            case 8:
                System.out.println("   |----|");
                System.out.println("   |    |");
                System.out.println("   O    |");
                System.out.println("  -|-   |");
                System.out.println("  | |   |");
                System.out.println("      __|");
                break;
               default:
                   System.out.println("no hay imagen");
        }
    }

}
