package Kniffel.scorecard.box.categoryBox;

import Kniffel.scorecard.box.Box;

import java.util.Objects;

public abstract class CategoryBox extends Box implements ScoreCalculator
{
    private String category;
    private String description;
    private String scoreComposition;

    public CategoryBox()
    {
    }

    public CategoryBox(String category, String description, String scoreComposition)
    {
        this.category = category;
        this.description = description;
        this.scoreComposition = scoreComposition;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getScoreComposition()
    {
        return scoreComposition;
    }

    public void setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryBox that = (CategoryBox) o;
        return Objects.equals(category, that.category) && Objects.equals(description, that.description) && Objects.equals(scoreComposition, that.scoreComposition);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(category, description, scoreComposition);
    }

    @Override
    public String toString()
    {
        return "CategoryBox{" +
                "category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", scoreComposition='" + scoreComposition + '\'' +
                '}';
    }
}
