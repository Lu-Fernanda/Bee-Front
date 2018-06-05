/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDTO;

import edu.sergioarboleda.rumbacoin.Billetera;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */

@XmlRootElement(name = "Billetera")
@XmlAccessorType(XmlAccessType.FIELD)
public class BilleteraDTO {
    
    private int id;
    private int dinero;

    public BilleteraDTO() {
    }

    public BilleteraDTO(Billetera bill) {
        this.id = bill.getId();
        this.dinero = bill.getDinero();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
}
