package com.tc.concept.TimeComplex;

//TimeComple：时间复杂度
public class TimeComplex {
    void eat1(int n){
        for (int i=0;i<n;i++){
            System.out.println("等待一天");
        }
    }

    void eat2(int n){
        for(int i=n; i>1; i/=2){
            System.out.println("等待一天");
            System.out.println("等待一天");
            System.out.println("等待一天");
            System.out.println("等待一天");
            System.out.println("吃一半面包");
        }
    }

    void eat3(int n){
        System.out.println("等待一天");
        System.out.println("吃一个鸡腿");
    }

    void eat4(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.println("等待一天");
            }
            System.out.println("吃一寸面包");
        }
    }
}
