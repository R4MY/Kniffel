package Kniffel.scorecard.pointsColumn;

import Kniffel.scorecard.box.Box;
import Kniffel.scorecard.section.Section;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
// TODO  Prototype Pattern + FIX setPointsBoxes
public class PointsColumnBuilder
{
    private int gameNumber = 1;
    private Map<String, Integer> pointsBoxes = new HashMap<>();

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
                        .forEach(box -> pointsBoxes.put(box.getCategory(), null)));
        return this;
    }

    public PointsColumn build()
    {
        return new PointsColumn(gameNumber, pointsBoxes);
    }
}