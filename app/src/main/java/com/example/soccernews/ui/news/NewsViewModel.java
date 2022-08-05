package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        news = new MutableLiveData<>();
        //TODO Remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria tem desfalque importante","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit"));
        news.add(new News("Ferrinha joga no sabado ","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit"));
        news.add(new News("Copa do Mundo Feminino esta Terminando","Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit"));

        this.news.setValue(news );
    }

    public LiveData<List<News>> getNews() {

        return news;
    }
}