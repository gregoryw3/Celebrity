import java.util.ArrayList;
public class Celebrity
{
    private String name;
    private String hint;
    public Celebrity(String name, String hint)
    {
        this.name = name;
        this.hint = hint;
    }

    public String getName()
        {
            return this.name;
        }
    public String getHint()
        {
            return this.hint;
        }

    public void setName(String name)
        {
            this.name = name;
        }
    public void setHint(String hint)
        {
            this.hint = hint;
        }

    public String toString()
    {
        return name + ": " + hint;
    }

    public static void main(String[] args) 
        {
            Celebrity celebrity1 = new Celebrity("Gordon Ramsay", "Master Chef");
            Celebrity celebrity2 = new Celebrity("Adam Driver", "Sad Boy Meets Sad Girl with Light Sabers");
            Celebrity celebrity3 = new Celebrity("Guy Fieri", "Hot Wings");
            Celebrity celebrity4 = new Celebrity("Keanu Reeves", "Johnny Silverhand");
            Celebrity celebrity5 = new Celebrity("Samuel L. Jackson", "Mace Windu");

            ArrayList<Celebrity> listOfCeleb = new ArrayList<>();
            listOfCeleb.add(celebrity1);
            listOfCeleb.add(celebrity2);
            listOfCeleb.add(celebrity3);
            listOfCeleb.add(celebrity4);
            listOfCeleb.add(celebrity5);
            
            for (Celebrity celebrity : listOfCeleb) 
                {
                    System.out.println(celebrity);
                }

            celebrity1.setName("Master Chief");
            celebrity1.setHint("Cortana");

            System.out.println(celebrity1);
                
        }
}