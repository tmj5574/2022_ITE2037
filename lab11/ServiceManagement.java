import java.util.ArrayList;

public class ServiceManagement {
    public static <T extends Hub> T moveArea(T t, String area) {
        // 택배 도착 area 변경
        t.setArea(area);
        return t;
    }

    public static <T extends Hub> T raisePerBox(T t, double rate) {
        // 택배 개당 요금 변경, e.g. 1.05 == 5% 상승
        t.setPrice_per_box(t.getPrice_per_box()*rate);
        return t;
    }

    public static <T extends Hub> int findIndexByNum(ArrayList<T> tList, int num) {
        // 택배 번호로 찾기
        // 찾으면 해당 인덱스 반환, 찾지 못하면 -1 반환
        for (int i = 0; i < tList.size(); i++){
            if (tList.get(i).getNumber() == num){
                return i;
            }
        }
        return -1;
    }

    public static <T extends Hub> ArrayList<T> raiseAll(ArrayList<T> tList, double rate) {
        // 한 지역의 모든 택배 요금 변경, e.g. 1.05 == 5% 상승
        for (int i = 0; i < tList.size(); i++){
            tList.get(i).setPrice_per_box(tList.get(i).getPrice_per_box()*rate);
        }
        return tList;
    }

}
