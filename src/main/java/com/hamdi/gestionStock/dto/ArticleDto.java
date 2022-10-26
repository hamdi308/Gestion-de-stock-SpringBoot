package com.hamdi.gestionStock.dto;

import com.hamdi.gestionStock.model.Article;
import com.hamdi.gestionStock.model.Category;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    private Integer id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixunitaireHt;
    private BigDecimal tauxTva;
    private BigDecimal prixunitaireTtc;
    private String photo;
    private CategoryDto category;
    public static ArticleDto fromEntity(Article article){
        if(article==null){
            return null;
        }
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixunitaireHt(article.getPrixunitaireHt())
                .prixunitaireTtc(article.getPrixunitaireTtc())
                .tauxTva(article.getTauxTva())
                .category(CategoryDto.fromEntity(article.getCategory()))
                .photo(article.getPhoto())
                .build();
    }
    public static Article toEntity(ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
            //throw Exception
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixunitaireHt(articleDto.getPrixunitaireHt());
        article.setPrixunitaireTtc(articleDto.getPrixunitaireTtc());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPhoto(articleDto.getPhoto());
        return article;
    }
}
