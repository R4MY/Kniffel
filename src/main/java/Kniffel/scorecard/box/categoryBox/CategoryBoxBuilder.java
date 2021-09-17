package Kniffel.scorecard.box.categoryBox;

public abstract class CategoryBoxBuilder<T extends CategoryBoxBuilder<T>>
{
    private String category = "default_Category";
    private String description = "default_Description";
    private String scoreComposition = "default_Score_Composition";
    private CategoryBoxListBuilder categoryBoxListBuilder;

    public CategoryBoxBuilder()
    {

    }

    public CategoryBoxBuilder(CategoryBoxListBuilder categoryBoxListBuilder)
    {
        this.categoryBoxListBuilder = categoryBoxListBuilder;
    }

    public T setCategory(String category)
    {
        this.category = category;
        return self();
    }

    public T setDescription(String description)
    {
        this.description = description;
        return self();
    }

    public T setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
        return self();
    }

    public abstract CategoryBox build();

    CategoryBoxListBuilder addCategoryBoxToList()
    {
        CategoryBox categoryBox = build();
        this.categoryBoxListBuilder.addCategoryBox(categoryBox);
        return this.categoryBoxListBuilder;
    }

    protected abstract T self();
}