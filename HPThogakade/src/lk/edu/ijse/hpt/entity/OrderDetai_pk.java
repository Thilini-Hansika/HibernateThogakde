/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Thilini Hansika
 */
@Embeddable
public class OrderDetai_pk implements Serializable{
    int oid;
    int itemcode;

    public OrderDetai_pk() {
    }

    public OrderDetai_pk(int oid, int itemcode) {
        this.oid = oid;
        this.itemcode = itemcode;
    }
    
    
    
}
