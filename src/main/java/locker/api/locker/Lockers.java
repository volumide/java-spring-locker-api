package locker.api.locker;

public class Lockers {
    private Long id;
    private String location;
    private String city;
    private String description;
    private String price;
    private String name;

    public Lockers(){

    }

    public Lockers(Long id, String name, String location, String price, String description, String city) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
        this.description = description;
        this.city = city;

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}