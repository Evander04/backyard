package Pojo;
// Generated 22-may-2017 9:26:58 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clients generated by hbm2java
 */
public class Clients  implements java.io.Serializable {


     private Integer idClient;
     private String name;
     private String lastName;
     private String docIdentity;
     private Boolean docType;
     private String nationality;
     private String phone;
     private String address;
     private String email;
     private Boolean erasedStatus;
     private Set detailreservationclients = new HashSet(0);

    public Clients() {
    }

    public Clients(String name, String lastName, String docIdentity, Boolean docType, String nationality, String phone, String address, String email, Boolean erasedStatus, Set detailreservationclients) {
       this.name = name;
       this.lastName = lastName;
       this.docIdentity = docIdentity;
       this.docType = docType;
       this.nationality = nationality;
       this.phone = phone;
       this.address = address;
       this.email = email;
       this.erasedStatus = erasedStatus;
       this.detailreservationclients = detailreservationclients;
    }
   
    public Integer getIdClient() {
        return this.idClient;
    }
    
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDocIdentity() {
        return this.docIdentity;
    }
    
    public void setDocIdentity(String docIdentity) {
        this.docIdentity = docIdentity;
    }
    public Boolean getDocType() {
        return this.docType;
    }
    
    public void setDocType(Boolean docType) {
        this.docType = docType;
    }
    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getErasedStatus() {
        return this.erasedStatus;
    }
    
    public void setErasedStatus(Boolean erasedStatus) {
        this.erasedStatus = erasedStatus;
    }
    public Set getDetailreservationclients() {
        return this.detailreservationclients;
    }
    
    public void setDetailreservationclients(Set detailreservationclients) {
        this.detailreservationclients = detailreservationclients;
    }




}

