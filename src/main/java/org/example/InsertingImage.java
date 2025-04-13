package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class InsertingImage {

    @Id
    private int id;
    private String imageName;

    @Lob  //For large objects
    @Column(name = "img", columnDefinition = "MEDIUMBLOB")  // Ensure Hibernate uses MEDIUMBLOB
    private byte[] img1;
    public InsertingImage(int id, String imgName, byte[] img) {
        this.id = id;
        this.imageName = imgName;
        this.img1 = img;
    }
}
