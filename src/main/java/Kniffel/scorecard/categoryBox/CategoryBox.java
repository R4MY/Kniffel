package Kniffel.scorecard.categoryBox;

public abstract class CategoryBox implements Description, Score
{
    private String category;
    private String description;
    private String scoreComposition;

    public CategoryBox(String category, String description, String scoreComposition)
    {
        this.category = category;
        this.description = description;
        this.scoreComposition = scoreComposition;
    }
}
