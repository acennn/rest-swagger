package asen.restswagger;

import org.junit.jupiter.api.Test;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//@SpringBootTest
class TestsToBeRemoved {
    //TODO remove this class
    //
//	@Test
//	void contextLoads() {
//	}
    @Test
    public void test() {
        //проверява дали даден стринг съдърва определен чар
        System.out.println(StringUtils.countOccurrencesOf("gsdadsfa", "a"));

        String arrStr[] = {"d", "v"};
        int arrInt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrInt2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrInt3[] = {1, 7, 3, 11, 5, 15, 7, 8, 9, 10};
//	System.out.println(StringUtils.arrayToCommaDelimitedString());

        // бинарно търсене в арей
        System.out.println(Arrays.binarySearch(arrInt, 5));

        Object arrObj[] = {1, 2, 3};
        Object arrObj1[] = {1, 2, 3};

        System.out.println(Arrays.deepToString(arrObj));
        // прави копие на арей от индекс до индекс
        System.out.println(Arrays.copyOfRange(arrInt, 3, 5).toString());
        System.out.println(Arrays.toString(arrInt));
        //пълни лист с дадена стойност
        Arrays.fill(arrStr, "r");
        System.out.println(Arrays.toString(arrStr));
        //проверява дали два масива са еднакви
        System.out.println(Arrays.equals(arrInt, arrInt2));
        System.out.println(Arrays.deepEquals(arrObj, arrObj1));
        //Сортира масив
        Arrays.sort(arrInt3);
        System.out.println(Arrays.toString(arrInt3));

        // проверяна null or empty проверява
        CollectionUtils.isEmpty(Arrays.asList());
        CollectionUtils.arrayToList(arrInt);

        List intList = Arrays.asList(5, 9, 11);
//    intList.addAll(Arrays.asList(7,15,19));

        System.out.println(Arrays.asList(1, 2, 3).contains(2));
        System.out.println(intList);
        //дава индекса на дадена стойност ако го няма връща стойност <0
        System.out.println(intList.indexOf(7));
        //проверява дали индекс съдържа дадена стойност
        System.out.println(intList.contains(7));
        System.out.println(intList.get(2));
        System.out.println("is list empty----------------");
        //проверява дали лист е празен
        System.out.println(intList.isEmpty());
// ако лист се създава само с Arrays.asList() не може да се променя размера му
        List resizableIntList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 3, 9, 13, 17));
        resizableIntList.remove(2);
        System.out.println(resizableIntList);
        Object onjestOne = 1;
        //маха обект от листа ако е инт маха обекта на дадения индекс
        resizableIntList.remove(onjestOne);
        System.out.println(resizableIntList);
        System.out.println("retainALL---------------------------");
        System.out.println(intList);
        System.out.println("retainList--------------------------");
        // оставя само съвпадащите в двата листа
        resizableIntList.retainAll(intList);

        System.out.println(resizableIntList);
        // добавя всички стойности към лист
        resizableIntList.addAll(Arrays.asList(13, 14, 15));
        System.out.println(resizableIntList);
        // добавя се стойност към лист
        resizableIntList.add(25);
        System.out.println(resizableIntList);
        // проверява дали лист съдържа дадена стойност
        System.out.println(resizableIntList.contains(25));
//    resizableIntList.clear();
        System.out.println(resizableIntList);

        System.out.println(resizableIntList.subList(3, 5));
        System.out.println(resizableIntList.containsAll(Arrays.asList(13, 5)));
//    resizableIntList.sort(new Comparator() {
//        @Override
//        public int compare(Object o1, Object o2) {
//            return 0;
//        }
//    });
        System.out.println(resizableIntList);

        resizableIntList.addAll(Arrays.asList(43, 5, 2, 7, 21, 33, 2, 8, 2, 4, 2, 4));
        //сортирам лист през стрим
        System.out.println(resizableIntList.stream().sorted().collect(Collectors.toList()));
        System.out.println(resizableIntList);
//    Collections.sort(resizableIntList);
//    System.out.println(resizableIntList);
        System.out.println(CollectionUtils.containsAny(resizableIntList, Arrays.asList(4, 7)));
        //проверява дали листа съдържа всички стойности
        System.out.println(resizableIntList.containsAll(Arrays.asList(4, 7)));
        System.out.println(resizableIntList);
        System.out.println(resizableIntList.stream().anyMatch(a -> a.equals(5)));
        //маха повтарящите стойности
        System.out.println(resizableIntList.stream().distinct().collect(Collectors.toList()));
        System.out.println(resizableIntList);
//------------------------------------------------------------------------------------

        String aaa = "fa;sfasd;faslfla ads-adf_9443";

        // връща буквата на даден индекс
        System.out.println(aaa.charAt(3));
// връща индекса на дадена буква ако я няма връша -1
        System.out.println(aaa.indexOf('9'));
        System.out.println(aaa.indexOf('j'));

        // стринг към арей от букви
        char[] charArr = aaa.toCharArray();
        // стринг към главни букви
        System.out.println(aaa.toUpperCase());
        // разделя стринг на даден сепаратор и прави арей от стрингове
        String[] splitA = aaa.split(",");
        System.out.println(Arrays.toString(splitA));
        // дава аски кода на даден чар
        System.out.println(aaa.codePointAt(5));

        System.out.println(aaa.compareTo("ff"));
        // конкатенира стринг
        aaa.concat("dddddddddddddddddddddd");
        System.out.println(aaa.concat("dddddddddddddddddddddd"));

        System.out.println(aaa.compareToIgnoreCase("fa;sfasd;faslfla ads-adf_9443"));
        //сравнява стринг с string builder или buffer
        System.out.println(aaa.contentEquals(new StringBuilder("fa;sfasd;faslfla ads-adf_9443")));
        //сравнява два стринга игнор кейс
        aaa.equalsIgnoreCase("fasdf");

        //сменя дадена буква с друга
        System.out.println(aaa.replaceAll("a", "1"));

        // дали стринг започва с дадена буква
        System.out.println(aaa.startsWith("f"));


        //взима стринг между два индекса дадени стойности взима първата но не и втората
        System.out.println(aaa.substring(3, 15));

        // взима от този индекс в стринг до кеая
        aaa.substring(3);

//    aaa.toLowerCase();
        // int към стринг
        System.out.println(String.valueOf(1));

//добавя в стринг стойност %s добавя стринг % добавя int
        System.out.println(String.format("fafa %s----%d", "1555555555", 9999999));

//-------------------------------------------------------------------
//Integer от стринг
        System.out.println(Integer.valueOf("1"));

        Optional.of(aaa.charAt(99));

        StringUtils.countOccurrencesOf("gsdadsfa", "a");

    }


}
