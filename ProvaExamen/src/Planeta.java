public class Planeta 
{
    //DOCUMENTAR
    /**
     * Variables inicials
    */
    String nom;
    int diametre;
    int pes;    

    //DOCUMENTAR
    /**
     * Parametres del constructoor
     */
    //Contructor amb tots els parametres    
    public Planeta(String nom, int diametre, int pes)
    {
        this.nom = nom;
        this.diametre = diametre;
        this.pes = pes;
    }

    //DOCUMENTAR
    //Contructor buit
    /**
     * Constructor buit per utilitzar-lo 
     */
    public Planeta(){}

    //DOCUMENTAR
    /**
     * Si el planeta te un diametre mes petit de 1300 retornara un 1 sino un 0
     * @return 1 Quan el planeta es enano
     * @return 0 Quan el planeta no es enano
     */
    public int planetaEnano()
    {
        if(this.diametre < 1300)
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }

    //DOCUMENTAR
    /**
     * El planeta s'exepnadeix, es multiplicara *3 el seu diametre
     * @return this.diametre El diametre *3
     */
    public int expansio()
    {        
        this.diametre =this.diametre*3;
        return this.diametre;
    }

    //DOCUMENTAR
    /**
     * Si hi ha una colisio, es pedra el pes del propi meteorit, pero si després de la colisio el planeta pesa igual o superior a 1800kg retornarem 1 sino retornarem 0,
     *  i el diametre augmentara la mitat del pes que pesava
     * 
     * @param meteorito
     * @return -1
     */
    public int colisio(int meteorito)
    {

        return -1;
       
    }

    //Getters i setters
    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getDiametre()
    {
        return this.diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }
    
    public int getPes()
    {
        return this.pes;
    }

    public void setPes(int pes)
    {
        this.pes = pes;
    }    
}
