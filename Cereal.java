import java.util.ArrayList;

public class Cereal
{
    private String cerealName;
    private Double rating;
    private Double cups;
    private int potassium;
    private int sodium;
    
    public Cereal(String name, Double rating, Double cups, int potassium, int sodium)
        {
            this.cerealName = name;
            this.rating = rating;
            this.cups = cups;
            this.potassium = potassium;
            this.sodium = sodium;
        }

    public Double getCups() {
        return cups;
    }
    public void setCups(Double cups) {
        this.cups = cups;
    }
    public String getCerealName() 
        {
            return cerealName;
        }
    public Double getRating() 
        {
            return rating;
        }
    public int getPotassium() 
        {
            return potassium;
        }
    public int getSodium() 
        {
            return sodium;
        }

    public void setCerealName(String cerealName) 
        {
            this.cerealName = cerealName;
        }
    public void setRating(Double rating) 
        {
            this.rating = rating;
        }
    public void setPotassium(int potassium) 
        {
            this.potassium = potassium;
        }
    public void setSodium(int sodium) 
        {
            this.sodium = sodium;
        }


    public String toString()
        {
            
            return  "Name: " + cerealName + "Rating: " + rating + "Potassium: " + potassium + "Sodium: " + sodium;
        }
        

    public static void main(String[] args) 
        {
            Cereal cereal1 = new Cereal("100% Bran", 68.402973, 0.33, 280, 130);
            Cereal cereal2 = new Cereal("100% Natural Bran", 33.983679, 1.0, 135, 15);
            Cereal cereal3 = new Cereal("All-Bran", 59.425505, 0.33, 320, 260);
            Cereal cereal4 = new Cereal("All-Bran with Extra Fiber", 93.704912, 0.5, 330, 140);
            Cereal cereal5 = new Cereal("Almond Delight", 34.384843, 0.75, -1, 200);
        
        ArrayList<Cereal> listOfCereals = new ArrayList<>();
        listOfCereals.add(cereal1);
        listOfCereals.add(cereal2);
        listOfCereals.add(cereal3);
        listOfCereals.add(cereal4);
        listOfCereals.add(cereal5);

        int tempPotassium= Integer.MIN_VALUE; 
        String tempCereal = "";   
        for (Cereal cereal : listOfCereals) 
            {
                if (cereal.getPotassium() > tempPotassium)
                    {
                        tempCereal = cereal.getCerealName();
                       tempPotassium = cereal.getPotassium();
                        
                    }
            }
        System.out.println(tempCereal + "Has the most amount of Potassium with an Amount of: " + tempPotassium);
        }
        
}

