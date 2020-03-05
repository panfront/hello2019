package com.hollycrm.test.review_Throwable;

public class Test1 {
    public static void main(String[] args) throws Exception {
        /**
         * 获取数组指定索引处的元素
         *
         */
        int [] arr = {1,2,3};
        getException(123);
        try {
            int e = getElement(arr,3);
            System.out.println(e);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void getException(int a) throws Exception {
        if(a>100){
            throw new Exception("123错误！");
        }
    }

    public static int getElement(int []arr,int index){

        return  arr[index];
    }
}
