package Pojo;
// Generated 22-may-2017 9:26:58 by Hibernate Tools 4.3.1



/**
 * Extras generated by hbm2java
 */
public class Extras  implements java.io.Serializable {


     private Integer idExtras;
     private Reservation reservation;
     private String description;
     private Long rode;

    public Extras() {
    }

    public Extras(Reservation reservation, String description, Long rode) {
       this.reservation = reservation;
       this.description = description;
       this.rode = rode;
    }
   
    public Integer getIdExtras() {
        return this.idExtras;
    }
    
    public void setIdExtras(Integer idExtras) {
        this.idExtras = idExtras;
    }
    public Reservation getReservation() {
        return this.reservation;
    }
    
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getRode() {
        return this.rode;
    }
    
    public void setRode(Long rode) {
        this.rode = rode;
    }




}


