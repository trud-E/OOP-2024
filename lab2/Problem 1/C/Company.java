
import java.util.*;
public class Company{
    private String nameCompany;
    private String location;
    private int opened;
    private String ceo;
    private double revenue;

    public Company(String nameCompany, String location, int opened, String ceo, double revenue){
        this.nameCompany = nameCompany;
        this.location = location;
        this.opened = opened;
        this.ceo = ceo;
        this.revenue = revenue;
    }

    public Company(){

    }

    public void setNameCompany(String nameCompany){
        this.nameCompany = nameCompany;
    }

    public String getNameCompany(){
        return nameCompany;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public void setCeo(String ceo){
        this.ceo = ceo;
    }
    
    public String getCeo(){
        return ceo;
    }

    public void setRevenue(double revenue){
        this.revenue = revenue;
    }

    public double getRevenue(){
        return revenue;
    }

    @Override
    public String toString() {
        return "Company [nameCompany=" + nameCompany + ", location=" + location + ", opened=" + opened + ", ceo=" + ceo
                + ", revenue=" + revenue + "]";
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameCompany == null) ? 0 : nameCompany.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + opened;
        result = prime * result + ((ceo == null) ? 0 : ceo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(revenue);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Company other = (Company) obj;
        if (nameCompany == null) {
            if (other.nameCompany != null)
                return false;
        } else if (!nameCompany.equals(other.nameCompany))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (opened != other.opened)
            return false;
        if (ceo == null) {
            if (other.ceo != null)
                return false;
        } else if (!ceo.equals(other.ceo))
            return false;
        if (Double.doubleToLongBits(revenue) != Double.doubleToLongBits(other.revenue))
            return false;
        return true;
    }
    
}
