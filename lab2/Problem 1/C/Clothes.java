

public class Clothes extends Company{
    private String material;
    private String typeClothes;
    public Clothes(String name, String location, int opened, double revenue, String ceo, String material, String typeClothes){
        super(name, location, opened, ceo, revenue);
        this.material = material;
        this.typeClothes = typeClothes;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTypeClothes() {
        return typeClothes;
    }

    public void setTypeClothes(String typeClothes) {
        this.typeClothes = typeClothes;
    }

    @Override
    public String toString(){
        return "Clothes [" + super.toString() + ", material= " + material + ", typeClothes= " + typeClothes + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((material == null) ? 0 : material.hashCode());
        result = prime * result + ((typeClothes == null) ? 0 : typeClothes.hashCode());
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
        Clothes other = (Clothes) obj;
        if (material == null) {
            if (other.material != null)
                return false;
        } else if (!material.equals(other.material))
            return false;
        if (typeClothes == null) {
            if (other.typeClothes != null)
                return false;
        } else if (!typeClothes.equals(other.typeClothes))
            return false;
        return true;
    }

    

    


   
}