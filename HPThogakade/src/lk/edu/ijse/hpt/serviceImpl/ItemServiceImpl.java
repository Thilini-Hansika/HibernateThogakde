/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hpt.dao.ItemDao;
import lk.edu.ijse.hpt.daoImpl.ItemDaoImpl;
import lk.edu.ijse.hpt.dto.ItemDTO;
import lk.edu.ijse.hpt.entity.ItemEntity;
import lk.edu.ijse.hpt.service.ItemService;
import lk.edu.ijse.hpt.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Thilini Hansika
 */
public class ItemServiceImpl implements ItemService {

    ItemDao itemDao = new ItemDaoImpl();
    SessionFactory sf = SessionFactoryUtil.getSessionFactory();

    @Override
    public boolean addItem(ItemEntity item) throws Exception {
        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            itemDao.setSession(session);
            boolean result = itemDao.addItem(item);
            if (result) {
                tx.commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
                return false;
        }finally{
            session.close();
        }
    
    }

    @Override
    public ItemDTO searchByDescription(String description) throws Exception {
        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            itemDao.setSession(session);

            ItemEntity searchItemByName = itemDao.searchItemByName(description);
            ItemDTO itm = new ItemDTO();
            itm.setItemcode(searchItemByName.getItemcode());
            itm.setDescription(searchItemByName.getDescription());
            itm.setQtyOnHand(searchItemByName.getQtyOnHand());
            itm.setUnitPrice(searchItemByName.getUnitPrice());

            System.out.println("Dinki" + itm);
            tx.commit();
            return itm;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();

            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }

    }

    @Override
    public List<ItemDTO> getAllItems() throws Exception {
        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            itemDao.setSession(session);
            List<ItemEntity> allDescriptions = itemDao.getAllDescriptions();

            List<ItemDTO> IList = new ArrayList<>();
            for (ItemEntity itemEntity : allDescriptions) {
                ItemDTO item = new ItemDTO();
                item.setDescription(itemEntity.getDescription());
                item.setQtyOnHand(itemEntity.getQtyOnHand());
                item.setUnitPrice(itemEntity.getUnitPrice());

                IList.add(item);

            }

            tx.commit();

            return IList;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();

            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws Exception {
        Session openSession = sf.openSession();
        Transaction tx = null;
        try {
            tx = openSession.beginTransaction();
            itemDao.setSession(openSession);
            ItemEntity item = itemDao.searchItemByName(itemDTO.getDescription());
            item.setQtyOnHand(itemDTO.getQtyOnHand());
            item.setUnitPrice(itemDTO.getUnitPrice());
            itemDao.updateItem(item);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
             return false;
        } finally {
            openSession.close();
        }
       
    }

    @Override
    public ItemDTO searchBYId(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
