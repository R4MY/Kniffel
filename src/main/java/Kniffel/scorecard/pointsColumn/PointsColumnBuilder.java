package Kniffel.scorecard.pointsColumn;

import Kniffel.scorecard.box.Box;
import Kniffel.scorecard.section.Section;

import java.util.List;
import java.util.Map;
// Prototype Pattern
public class PointsColumnBuilder
{
    private int gameNumber = 1;
    private Map<Box, Integer> pointsBoxes;

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
                        .forEach(box -> pointsBoxes.put(box, null)));
        return this;
    }

    public PointsColumn build()
    {
        return new PointsColumn(gameNumber, pointsBoxes);
    }
}