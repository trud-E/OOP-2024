

public class Educational extends Company{
    private double subscriptionCost;
    public Educational(String name, String location, int opened, String ceo, double revenue, double subscriptionCost){
        super(name, location, opened, ceo, revenue);
        this.subscriptionCost = subscriptionCost;
    }

    public void setSubscriptionCost(double subscriptionCost){
        this.subscriptionCost = subscriptionCost;
    }

    public double getSubscriptionCost(){
        return subscriptionCost;
    }
    
    @Override
    public String toString(){
        return "EducationalCompany [" + super.toString() + ", subscriptionCost= " + subscriptionCost + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(subscriptionCost);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Educational other = (Educational) obj;
        if (Double.doubleToLongBits(subscriptionCost) != Double.doubleToLongBits(other.subscriptionCost))
            return false;
        return true;
    }
    
}
