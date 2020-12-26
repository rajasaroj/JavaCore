package org;


import java.util.ArrayList;
import java.util.List;

/** MARKER INTERFACE
 *  The whole idea behind using Marker Interface is to tell JVM "that i am something" so that JVM can take some special action for those objects
 *  those special action can be serializing the object or saving entity object into database.
 *
 *  The Classes can be able to express this information to JVM with help of Marker Interfaces
 *
 *  eg Serializable and Clonable
 *
 *  Below we will see how to create our own Marker Interface:
 *
 *  Usecase: We want to create some entity classes so that we can store those entity objects inside database.
 *  but we have to also ensure that save() operation is only invoked for the objects of entity classes and not for some other classes
 *
 *  We will see below how the Marker Interface helps us to solve this usecase.
 */

interface IMarkerEntity {

}

class Customer implements  IMarkerEntity {

}

class DataBaseDao {

    List<Customer> customerList = new ArrayList<>();

    public void save(Customer customer) {
        customerList.add(customer);
    }

}

public class MarkerInterfaceSolution {

    public static void main(String[] args) throws Exception {

        Customer c = new Customer();
        DataBaseDao dataBaseDao = new DataBaseDao();
        //Object b = new Object();


        // You can see here because of the MarkerInterface JVM was able to Indentify the objects of the Entity classes
        // and store it inside the DB
        // if the object doesn't below to Entity class and still you tried to store it inside DB it will throw error.
        if (c instanceof IMarkerEntity) {
            dataBaseDao.save(c);
        } else {
            throw new Exception("The object is not an istance of IMarkerEntity");
        }


    }
}
