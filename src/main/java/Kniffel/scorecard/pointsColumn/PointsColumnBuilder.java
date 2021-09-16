package Kniffel.scorecard.pointsColumn;

import Kniffel.scorecard.categoryBox.CategoryBox;
import Kniffel.scorecard.section.Section;

import java.util.Map;

public class PointsColumnBuilder
{
    private String gameNumber;
    private Map<CategoryBox, Integer> pointsBoxes;

    public PointsColumnBuilder setGameNumber(String gameNumber)
    {
        this.gameNumber = gameNumber;
        return this;
    }

    public PointsColumnBuilder setPointsBoxes(Section section)
    {
        section.getCategoryBoxList()
                .forEach(categoryBox -> pointsBoxes.put(categoryBox, 0));;
        return this;
    }

    public PointsColumn createPointsColumn()
    {
        return new PointsColumn(gameNumber, pointsBoxes);
    }
}