package Kniffel.scorecard.categoryBox;

import java.util.ArrayList;

public class CategoryBoxListBuilder
{
    private ArrayList listOfCategoryBox;

    public CategoryBoxListBuilder addList()
    {
        this.listOfCategoryBox = new ArrayList();
        return this;
    }

    public CategoryBoxListBuilder addCategoryBox(CategoryBox categoryBox)
    {
        listOfCategoryBox.add(categoryBox);
        return this;
    }

    public CategoryBoxListBuilder addCategoryBox()
    {
        return new CategoryBoxListBuilder();
    }

    public ArrayList buildList()
    {
        return listOfCategoryBox;
    }
}
