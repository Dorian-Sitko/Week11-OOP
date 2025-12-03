package ie.atu.productv3;

public class TV extends Product{
    private String manufacture;
    private String screen_size;

    public TV(){
        super();
        manufacture="";
        screen_size="";
        count++;
    }
    public void setManufacture(String manufacture){this.manufacture=manufacture;}
    public void setScreen_size(String screen_size){this.screen_size=screen_size;}

    public String setManufacture(){return manufacture;}
    public String getScreen_size(){return screen_size;}

    @Override
    public String toString(){return super.toString()+" by "+manufacture+"\nScreen size is "+screen_size;}

}
