
package jpa;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Person implements Serializable {

    @Id
    private int id;
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setId(int id) {
        this.id = id;
    }
}