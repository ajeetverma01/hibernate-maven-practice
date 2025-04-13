
package org.example;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ForAnnotation")
public class LearningAnnotations {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String city;
    private boolean isOpen;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Transient
    private double x;
    @Lob
    @Column(name = "img", columnDefinition = "MEDIUMBLOB")  // Ensure Hibernate uses MEDIUMBLOB
    private byte[] img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public LearningAnnotations(int id, String street, String city, boolean isOpen, Date date, double x, byte[] img) {
        super();
        this.id = id;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.date = date;
        this.x = x;
        this.img = img;
    }

    public LearningAnnotations() {
        super();
    }


}
