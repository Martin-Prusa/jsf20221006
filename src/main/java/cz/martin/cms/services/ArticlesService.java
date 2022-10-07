package cz.martin.cms.services;

import cz.martin.cms.models.Article;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ArticlesService {
    private List<Article> articles = new ArrayList<>();

    public List<Article> getArticles() {
        return articles;
    }
}
