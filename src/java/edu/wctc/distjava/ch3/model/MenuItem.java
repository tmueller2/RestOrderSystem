package edu.wctc.distjava.ch3.model;

/**
 * 
 * This class represents a database table.
 * Allows you to use property accessors and mutators to manipulate the info
 * 
 * @author Todd mueller
 * @version 1.0
 * 
 */
public class MenuItem {
    private int id;                 //Used for primry key
    private String menuDescription;
    private String category;        //USed to for what category the menu item is in

    public MenuItem() {
    }

    public MenuItem(int id, String menuDescription, String category) {
        this.id = id;
        this.menuDescription = menuDescription;
        this.category = category;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the menuDescription
     */
    public String getMenuDescription() {
        return menuDescription;
    }

    /**
     * @param menuDescription the menuDescription to set
     */
    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.getId();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MenuItem other = (MenuItem) obj;
        if (this.getId() != other.getId()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "id=" + getId() + ", itemName=" + getMenuDescription() 
                + ", category=" + getCategory() + '}';
    }

    
    
}
