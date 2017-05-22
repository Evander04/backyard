package Pojo;
// Generated 22-may-2017 9:26:58 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private Integer idCategory;
     private Integer categoryType;
     private String description;
     private Boolean erasedStatus;
     private Set rooms = new HashSet(0);

    public Category() {
    }

    public Category(Integer categoryType, String description, Boolean erasedStatus, Set rooms) {
       this.categoryType = categoryType;
       this.description = description;
       this.erasedStatus = erasedStatus;
       this.rooms = rooms;
    }
   
    public Integer getIdCategory() {
        return this.idCategory;
    }
    
    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }
    public Integer getCategoryType() {
        return this.categoryType;
    }
    
    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getErasedStatus() {
        return this.erasedStatus;
    }
    
    public void setErasedStatus(Boolean erasedStatus) {
        this.erasedStatus = erasedStatus;
    }
    public Set getRooms() {
        return this.rooms;
    }
    
    public void setRooms(Set rooms) {
        this.rooms = rooms;
    }




}

