import java.util.*;

public class Mahasiswa {
    public static void main(String[] args) {
        List<String> dataList = new ArrayList<>();
        dataList.add("joko");
        dataList.add("budi");
        dataList.add("Rina");

        dataList.remove("budi");

        System.out.println("Data List: " + dataList);

        //LinkedHashSet sama dengan HashSet
        Set<String> dataSet1 = new LinkedHashSet<>();
        dataSet1.add("Joko");
        dataSet1.add("Budi");
        dataSet1.add("Miya");
        dataSet1.add("Rina");
        dataSet1.add("Rina");



        System.out.println("Data Set: " + dataSet1);

        //TreeSet ketika dirun nama yang keluar sesuai abjad
        Set<String> dataSet2 = new TreeSet<>();
        dataSet2.add("Joko");
        dataSet2.add("Budi");
        dataSet2.add("Miya");
        dataSet2.add("Rina");
        dataSet2.add("Rina");


        System.out.println("Data Set: " + dataSet2);

        Map<String,Integer> stokBuah = new HashMap<>();
        stokBuah.put("apel",50);
        stokBuah.put("mangga", 150);

        stokBuah.remove("apel");

        System.out.printf("Stok apel: " + stokBuah.get("apel"));
        System.out.printf("Stok apel: " + stokBuah.get("mangga"));

    }
}
