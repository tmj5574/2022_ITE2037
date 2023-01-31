public class Jeju extends Hub{
    public static int init_num = 9000;
    public static String init_area = "Jeju";
    public static int init_per_box = 6000;

    Jeju(String description){
        ++init_num;
        setArea(init_area);
        setNumber(init_num);
        setPrice_per_box(init_per_box);
        setDescription(description);

    }
}
