package chapter4;

public class ArrayTest {
    public static void main (String[] args){
        //1.定义数组
        int[] intArr;

        //2.初始化数组
        //2.1 静态初始化
        //使用静态初始化，初始化数组时只指定数组的元素，不指定数组的长度
        //2.1.1 基本用法
        intArr = new int[]{1,2,3,4,5};
        //2.1.2 子类父类&简化的静态初始化
        //这里String型的数据直接变成了Object型的数组的元素，因为，String属于Object的子类。
        Object[] objArr = {"嗷呜","Nina"};

        //2.2 动态初始化
        //2.2.1 基本用法
        intArr = new int[5];
        //2.2.2 子类父类&数组定义与初始化同时完成。
        //这里String型的数据直接变成了Object型的数组的元素，因为，String属于Object的子类。
        Object[] objs = new String[3];

    }
}
