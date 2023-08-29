package semiTest;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkTest {
    HomeWork homeWork = new HomeWork();
    @Test
    void sumTestEmpty() {

        List<Integer> list = new ArrayList<>();
        Assertions.assertEquals(0,homeWork.sum(list));
    }
    @Test
    void sumTestNoEmpty() {
        List<Integer> list = Arrays.asList(1,2,3);
        Assertions.assertEquals(6,homeWork.sum(list));
    }
    @Test
    void hasExactlyTest1 (){
        List <String> list = new ArrayList<>();
        String s = "Hello";
        list.add(s);
        Assertions.assertTrue(homeWork.hasExactly(list,s));
    }
    @Test
    void hasExactlyTest2 (){
        List <String> list = new ArrayList<>();
        String s = "Hello";
        list.add("Bye");
        Assertions.assertFalse(homeWork.hasExactly(list,s));
    }
    @Test
    void hasExactlyTest3 (){
        List <String> list = new ArrayList<>();
        String s = "Hello";
        list.add("Bye");
        list.add(s);
        Assertions.assertFalse(homeWork.hasExactly(list,s));
    }
    @Test
    void hasExactlyTest4 (){
        List <String> list = new ArrayList<>();
        String s = "Hello";
        Assertions.assertFalse(homeWork.hasExactly(list,s));
    }
    @Test
    void copyTest1 () {
        Dog dog = new Dog();
        Mops mops = new Mops();
        List <Dog> listDog = new ArrayList<>();
        List <Mops> mopsList = new ArrayList<>();
        listDog.add(dog);
        mopsList.add(mops);
        homeWork.copy(mopsList,listDog);
        Assertions.assertTrue(mopsList.isEmpty() && listDog.size() == 2);
    }
    @Test
    void copyTest2 () {
        Dog dog = new Dog();
        List <Dog> listDog = new ArrayList<>();
        List <Mops> mopsList = new ArrayList<>();
        listDog.add(dog);
        homeWork.copy(mopsList,listDog);
        Assertions.assertTrue(mopsList.isEmpty() && listDog.size() == 1);
    }
    @Test
    void copyTest3 () {
        Mops mops = new Mops();
        List <Dog> listDog = new ArrayList<>();
        List <Mops> mopsList = new ArrayList<>();
        mopsList.add(mops);
        homeWork.copy(mopsList,listDog);
        Assertions.assertTrue(mopsList.isEmpty() && listDog.size() == 1);
    }
    @Test
    void copyTest4 () {
        List <Dog> listDog = new ArrayList<>();
        List <Mops> mopsList = new ArrayList<>();
        homeWork.copy(mopsList,listDog);
        Assertions.assertTrue(mopsList.isEmpty() && listDog.isEmpty());
    }
}
