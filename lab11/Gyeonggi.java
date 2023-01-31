public class Gyeonggi extends Hub {
    public static int init_num = 1000;
    public static String init_area = "Gyeonggi";
    public static int init_per_box = 3000;

    Gyeonggi(String description){
        init_num++;
        setArea(init_area);
        setNumber(init_num);
        setPrice_per_box(init_per_box);
        setDescription(description);

    }
}
