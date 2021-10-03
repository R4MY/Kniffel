package Kniffel.scorecard.pointsColumn;

import Kniffel.scorecard.section.Section;

import java.util.ArrayList;
import java.util.List;

public class PointsColumnBuilder
{
    private int gameNumber = 1;
    private List<PointsBox> pointsBoxes = new ArrayList<>();

    public PointsColumnBuilder setGameNumber(int gameNumber)
    {
        this.gameNumber = gameNumber;
        return this;
    }

    public PointsColumnBuilder setPointsBoxes(List<Section> sections)
    {
        sections.stream()
                .map(Section::getBoxList)
                .forEach(boxes -> boxes
                        .forEach(box -> pointsBoxes.add(new PointsBox(box, null))));
        return this;
    }

    public PointsColumn build()
    {
        return new PointsColumn(gameNumber, pointsBoxes);
    }
}