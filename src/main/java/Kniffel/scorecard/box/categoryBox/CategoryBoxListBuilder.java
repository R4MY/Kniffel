package Kniffel.scorecard.box.categoryBox;

import java.util.ArrayList;
import java.util.List;

public class CategoryBoxListBuilder
{
    private List<CategoryBox> listOfCategoryBox;

    public CategoryBoxListBuilder addList()
    {
        this.listOfCategoryBox = new ArrayList<>();
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

    public List<CategoryBox> buildList()
    {
        return listOfCategoryBox;
    }
}
