package cz.martin.cms.beans;

import cz.martin.cms.models.Article;
import cz.martin.cms.services.ArticlesService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import java.util.List;

@RequestScoped
public class CmsMainBean {
    @Inject
    private ArticlesService articlesService;

    public List<Article> getArticles() {
        return articlesService.getArticles();
    }
}
