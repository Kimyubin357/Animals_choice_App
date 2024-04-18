package com.cookandroid.animals_choice_app;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost(); //탭호스트 변수 생성

        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("DOG").setIndicator("강아지");//탭에 출력될 글자 생성
        tabSpecDog.setContent(R.id.tabDog);
        tabHost.addTab(tabSpecDog);

        TabHost tabHost1 = getTabHost(); //탭호스트 변수 생성

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("CAT").setIndicator("고양이");//탭에 출력될 글자 생성
        tabSpecCat.setContent(R.id.tabCat);
        tabHost1.addTab(tabSpecCat);

        TabHost tabHost2 = getTabHost(); //탭호스트 변수 생성

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("토끼");//탭에 출력될 글자 생성
        tabSpecRabbit.setContent(R.id.tabRabbit);
        tabHost2.addTab(tabSpecRabbit);

        TabHost tabHost3 = getTabHost(); //탭호스트 변수 생성

        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("HORSE").setIndicator("말");//탭에 출력될 글자 생성
        tabSpecHorse.setContent(R.id.tabHorse);
        tabHost3.addTab(tabSpecHorse);

    }

}