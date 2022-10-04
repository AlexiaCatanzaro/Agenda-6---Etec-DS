
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexia
 */
public class agenda6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // o cliente fornece o número final da placa do veículo, em seguida deve ser apresentado o mês que o IPVA deve ser pago
        int placa;
        placa=Integer.parseInt(JOptionPane.showInputDialog("""
                                                           Digite o n\u00famero final da placa:
                                                           1. Placa final 1
                                                           2. Placa final 2
                                                           3. Placa final 3
                                                           4. Placa final 4
                                                           5. Placa final 5
                                                           6. Placa final 6
                                                           7. Placa final 7
                                                           8. Placa final 8
                                                           9. Placa final 9
                                                           0. Placa final 0
                                                           """));
        switch (placa){
        case 1:JOptionPane.showMessageDialog(null, "Pagamento até 30/04");
        break;
        
        case 2:JOptionPane.showMessageDialog(null, "Pagamento até 31/05");
        break;
        
        case 3:JOptionPane.showMessageDialog(null, "Pagamento até 30/06");
        break;
        
        case 4:JOptionPane.showMessageDialog(null, "Pagamento até 31/07");
        break;
        
        case 5:JOptionPane.showMessageDialog(null, "Pagamento até 31/08");
        break;
        
        case 6:JOptionPane.showMessageDialog(null, "Pagamento até 30/09");
        break;
        
        case 7:JOptionPane.showMessageDialog(null, "Pagamento até 31/10");
        break;
        
        case 8: JOptionPane.showMessageDialog(null,"Pagamento até dia 30/11");
        break;
        
        case 9:JOptionPane.showMessageDialog(null,"Pagamento até 31/12");
        break;
        
        case 0:JOptionPane.showMessageDialog(null, "Pagamento até 31/12");
        break;
        
        default:
            JOptionPane.showMessageDialog(null, "Número inválido");
            break;
        
                 }
               
                
                
        
    }
    
}
